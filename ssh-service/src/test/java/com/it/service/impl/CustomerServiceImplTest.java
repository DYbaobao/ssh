package com.it.service.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.it.model.Customer;
import com.it.service.CustomerService;
@ContextConfiguration(locations={"classpath*:applicationContext-service.xml","classpath*:applicationContext-dao.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class CustomerServiceImplTest {
    @Autowired
	private CustomerService customerService;
	@Test
	public void test() {
		/*Customer customer = customerService.findById(5);
		System.out.println("****************"+customer.getCustName());*/
	}

}
