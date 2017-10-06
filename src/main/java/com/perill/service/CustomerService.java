package com.perill.service;

import java.util.List;

import com.perill.model.Customer;

public interface CustomerService {

	//pass thru method
	//will reference findAll in cust repository	
	List<Customer> findAll();

}