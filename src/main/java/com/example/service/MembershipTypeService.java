package com.example.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.example.exception.MembershipTypeNotFoundException;
import com.example.persistence.domain.MembershipType;
import com.example.persistence.repository.MembershipTypeRepository;
import com.example.rest.dto.MembershipTypeDTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Service
@AllArgsConstructor
@Data
public class MembershipTypeService {
	
	private MembershipTypeRepository repo;
	private ModelMapper mapper;
	
	private MembershipTypeDTO mapToDTO(MembershipType membershiptype) {
		return this.mapper.map(membershiptype, MembershipTypeDTO.class);
	}
	
	public MembershipTypeDTO addMusician(MembershipType membershiptype){
		MembershipType saved = this.repo.save(membershiptype);
		return this.mapToDTO(saved);
	}
	
	public List<MembershipTypeDTO> getAllMembershipTypes(){
		return this.repo.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
	}
	
	public MembershipTypeDTO updateMusician(Long id, MembershipType membershiptype) {
		Optional<MembershipType> tempMembershipType = Optional.of(this.repo.findById(id).orElseThrow(MembershipTypeNotFoundException::new));
		MembershipType existing = tempMembershipType.get();
		
		existing.setName(membershiptype.getName());
		existing.setStrings(membershiptype.getStrings());
		existing.setType(membershiptype.getType());
		existing.setCustomer(membershiptype.getCustomer());
		
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
		MembershipType found =  this.repo.findById(id).orElseThrow(MembershipTypeNotFoundException::new);
		return this.mapToDTO(found);
	}
	
	public List<MembershipTypeDTO> readByName(String name){
		List<MembershipType> found = this.repo.membershiptypeByName(name).orElseThrow(MembershipTypeNotFoundException::new);
		return found.stream().map(this::mapToDTO).collect(Collectors.toList());
	}

}
