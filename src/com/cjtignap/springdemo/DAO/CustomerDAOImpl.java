package com.cjtignap.springdemo.DAO;

import com.cjtignap.springdemo.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Customer> getCustomerList() {
        List<Customer> customers;
        Session session = sessionFactory.getCurrentSession();
        Query<Customer> query = session.createQuery("from Customer",Customer.class);
        customers = query.getResultList();
        return customers;
    }
}