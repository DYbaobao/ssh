package com.it.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.it.model.Customer;
import com.it.service.CustomerService;
import com.opensymphony.xwork2.ActionSupport;

public class CustomerAction extends ActionSupport {

	
	
	private static final long serialVersionUID = -378401550681701041L;
	@Autowired
	private CustomerService customerService;
	private Customer customer;
	private Integer custId;
	public Integer getCustId() {
		return custId;
	}
	public void setCustId(Integer custId) {
		this.custId = custId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
    public String findCustomerById(){
		
		
	   customer = customerService.findById(custId);
		
		System.out.println("前端传过来的客户id是："+custId);
		
		return SUCCESS;
	}
	
	
}
