package com.it.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.dao.CustomerDao;
import com.it.model.Customer;
import com.it.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
    
	@Autowired
	private CustomerDao customerDao;
	@Override
	public Customer findById(int id) {
		
		return customerDao.findById(id);
	}
	@Override
	public Customer findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
}
