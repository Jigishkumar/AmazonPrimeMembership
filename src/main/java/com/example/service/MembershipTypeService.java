package com.example.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exception.MembershipTypeNotFoundException;
import com.example.persistence.domain.MembershipType;
import com.example.persistence.repository.MembershipTypeRepository;
import com.example.rest.dto.MembershipTypeDTO;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor

public class MembershipTypeService {
@Autowired
private MembershipTypeRepository repo;
@Autowired
private ModelMapper mapper;

private MembershipTypeDTO mapToDTO(MembershipType membershiptype) {
return this.mapper.map(membershiptype, MembershipTypeDTO.class);
}

public MembershipTypeDTO addMembershipType(MembershipType membershiptype) {
MembershipType saved = this.repo.save(membershiptype);
return this.mapToDTO(saved);
}

public List<MembershipTypeDTO> getAllMembershipTypes() {
return this.repo.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
}

public MembershipTypeDTO updateMembershipType(Long id, MembershipType membershiptype) {
Optional<MembershipType> tempMembershiptype = Optional.of(this.repo.findById(id).orElseThrow(MembershipTypeNotFoundException::new));

MembershipType existing = tempMembershiptype.get();
existing.setMembershipTypeId(membershiptype.getMembershipTypeId());
existing.setMembershipDescription(membershiptype.getMembershipDescription());
existing.setMembershipExpDateValidity(membershiptype.getMembershipExpDateValidity());
existing.setCustomers(membershiptype.getCustomers());

MembershipType updated = this.repo.save(existing);
return this.mapToDTO(updated);
}

public boolean deleteMembershipType(Long id) {
this.repo.findById(id).orElseThrow(MembershipTypeNotFoundException::new);
this.repo.deleteById(id);
boolean exists = this.repo.existsById(id);
return !exists;
}

public MembershipTypeDTO readById(Long id) {
MembershipType found = this.repo.findById(id).orElseThrow(MembershipTypeNotFoundException::new);
return this.mapToDTO(found);
}

public MembershipTypeDTO readByName(String name) {
MembershipType found = this.repo.membershiptypeByName(name).orElseThrow(MembershipTypeNotFoundException::new);
return this.mapToDTO(found);
}
	
}