package com.example.persistence.repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.persistence.domain.MembershipType;

@Repository
public interface MembershipTypeRepository extends JpaRepository<MembershipType, Long>{

@Query("select m from MembershipType m where m.MembershipTypeId=?1")
Optional<MembershipType> membershiptypeByName(String MembershipTypeId);
}