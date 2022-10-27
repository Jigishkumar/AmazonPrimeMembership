package com.example.rest.dto;


import java.util.ArrayList;
import java.util.List;

import com.example.persistence.domain.MembershipType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerDTO {
	
    private Long id;

    private String name;

    private List<MembershipType> membershiptypes = new ArrayList<>();
}
