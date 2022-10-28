package com.example.exception;

import javax.persistence.EntityNotFoundException;

import org.springframework.web.bind.annotation.ResponseStatus;

import org.springframework.http.HttpStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "MembershipType does not exist with that ID")
public class MembershipTypeNotFoundException extends EntityNotFoundException{
public MembershipTypeNotFoundException() {}
public MembershipTypeNotFoundException(String msg) {
super(msg);
}
}
