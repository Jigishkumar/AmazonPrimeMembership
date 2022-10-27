package com.example.rest.dto;

import com.example.persistence.domain.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MembershipTypeDTO {

    private Long id;

    private String name;

    private Integer strings;

    private String type;

    private Customer customer;

}
