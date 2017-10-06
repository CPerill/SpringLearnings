package com.perill.repository;

import java.util.List;

import com.perill.model.Customer;

public interface CustomerRepository {

	//Can ref hibernate thru the Customer Repository interface
	
	
	List<Customer> findAll();

}