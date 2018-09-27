package com.it.service;

import com.it.model.Customer;

public interface CustomerService {
	public Customer findById(int i);
	public Customer findByName(String name);
}
