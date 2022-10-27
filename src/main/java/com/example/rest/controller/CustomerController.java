package com.example.rest.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.persistence.domain.Customer;
import com.example.rest.dto.CustomerDTO;
import com.example.service.CustomerService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class CustomerController {
	
	private CustomerService service;
	
	@PostMapping("/addCustomer")
	public CustomerDTO addcustomer(@RequestBody Customer customer) {
		return service.addCustomer(customer);
	}
	
	@GetMapping("/allCustomers")
	public List<CustomerDTO> getAllCustomers(){
		return service.getAllCustomers();
	}
	
	@PutMapping("/updateCustomer/{id}")
	public CustomerDTO updateBand(@PathVariable Long id, @RequestBody Customer customer) {
		return service.updateCustomer(id, customer);
	}
	
	@DeleteMapping("/deleteCustomer/{id}")
	public boolean deleteCustomer(@PathVariable Long id) {
		return service.deleteCustomer(id);
	}
	
	@GetMapping("/CustomerById")
	public CustomerDTO readCustomerById(@PathParam("id") Long id) {
		return service.CustomerById(id);
	}
	
	@GetMapping("/bandByName")
	public CustomerDTO readByName(@PathParam("name") String name){
		return service.readByName(name);
	}
}