package com.perill.repository;

import java.util.ArrayList;
import java.util.List;

import com.perill.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	//Default method
	/* (non-Javadoc)
	 * @see com.perill.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		
		List<Customer> customers = new ArrayList();
		
		Customer customer1 = new Customer();
		customer1.setFirstName("Connor");
		customer1.setLastName("Perill");
		
		customers.add(customer1);
		
		return customers;
	}

}
