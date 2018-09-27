package com.it.dao.impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.it.dao.CustomerDao;
import com.it.model.Customer;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

	@Override
	public Customer findById(int id) {
		return this.getHibernateTemplate().get(Customer.class, id);
	}

}
