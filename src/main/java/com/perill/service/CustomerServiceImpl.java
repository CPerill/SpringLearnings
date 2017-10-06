package com.perill.service;

import java.util.List;

import com.perill.model.Customer;
import com.perill.repository.CustomerRepository;
import com.perill.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	
	//need customer repospitory 
	//business logic, the heart of the business, will be in the service tier
	//Hard coded references are what spring excels at
	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	
	
	/* (non-Javadoc)
	 * @see com.perill.service.CustomerService#findAll()
	 */
	
	//pass thru method
	//will reference findAll in cust repository	
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
