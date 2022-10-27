package com.example.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.example.exception.CustomerNotFoundException;
import com.example.persistence.domain.Customer;
import com.example.persistence.repository.CustomerRepository;
import com.example.rest.dto.CustomerDTO;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CustomerService {

	private CustomerRepository repo;
	private ModelMapper mapper;
	
	private CustomerDTO mapToDTO(Customer customer) {
		return this.mapper.map(customer, CustomerDTO.class);
	}
	
	public CustomerDTO addBand(Customer customer) {
		Customer saved = this.repo.save(customer);
		return this.mapToDTO(saved);
	}
	
	public List<CustomerDTO> getAllCustomers() {
		return this.repo.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
	}
	
	public CustomerDTO updateCustomer(Long id, Customer customer) {
		Optional<Customer> tempCustomer = Optional.of(this.repo.findById(id).orElseThrow(CustomerNotFoundException::new));
		
		Customer existing = tempCustomer.get();
		existing.setName(Customer.getName());
		existing.setMembershiptypes(customer.getMembershiptypes());
		
		Customer updated = this.repo.save(existing);
		return this.mapToDTO(updated);
	}
	
	public boolean deleteCustomer(Long id) {
		this.repo.findById(id).orElseThrow(CustomerNotFoundException::new);
		this.repo.deleteById(id);
		boolean exists = this.repo.existsById(id);
		return !exists;
	}
	
	public CustomerDTO readById(Long id) {
        Customer found = this.repo.findById(id).orElseThrow(CustomerNotFoundException::new);
        return this.mapToDTO(found);
    }
	
	public CustomerDTO readByName(String name) {
		Customer found = this.repo.CustomerByName(name).orElseThrow(CustomerNotFoundException::new);
		return this.mapToDTO(found);
	}
	
}
