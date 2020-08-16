package com.cjtignap.springdemo.Service;

import com.cjtignap.springdemo.DAO.CustomerDAO;
import com.cjtignap.springdemo.entity.Customer;

import java.util.List;

public interface CustomerService {
    public List<Customer> getCustomerList();

    public void saveCustomer(Customer customer);

    public Customer getCustomer(int id);
    public void deleteCustomer(int id);
}
