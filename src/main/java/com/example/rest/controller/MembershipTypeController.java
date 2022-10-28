package com.example.rest.controller;


import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.persistence.domain.MembershipType;

import com.example.rest.dto.MembershipTypeDTO;
import com.example.service.MembershipTypeService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class MembershipTypeController {
@Autowired
private MembershipTypeService service;

@PostMapping("/addMembershipType")
public MembershipTypeDTO addmembershiptype(@RequestBody MembershipType membershiptype) {
return service.addMembershipType(membershiptype);
}

@GetMapping("/allMembershipTypes")
public List<MembershipTypeDTO> getAllMembershipTypes(){
return service.getAllMembershipTypes();
}

@PutMapping("/updateMembershipType/{id}")
public MembershipTypeDTO updateMembershipType(@PathVariable Long id, @RequestBody MembershipType membershiptype) {
return service.updateMembershipType(id, membershiptype);
}

@DeleteMapping("/deleteMembershipType/{id}")
public boolean deleteMembershipType(@PathVariable Long id) {
return service.deleteMembershipType(id);
}

@GetMapping("/membershiptypeById")
public MembershipTypeDTO readMembershipTypeById(@PathParam("id") Long id) {
return service.readById(id);
}

@GetMapping("/membershiptypeByName")
public MembershipTypeDTO readByName(@PathParam("name") String name){
return service.readByName(name);
}
		
}

