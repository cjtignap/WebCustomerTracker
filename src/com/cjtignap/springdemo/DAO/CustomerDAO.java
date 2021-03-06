package com.cjtignap.springdemo.DAO;

import com.cjtignap.springdemo.entity.Customer;

import java.util.List;

public interface CustomerDAO {
    public List<Customer> getCustomerList();

    public void saveCustomer(Customer customer);


    public Customer getCustomer(int id);
    public void deleteCustomer(int id);
}
