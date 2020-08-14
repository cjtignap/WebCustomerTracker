package com.cjtignap.springdemo.controller;

import com.cjtignap.springdemo.DAO.CustomerDAO;
import com.cjtignap.springdemo.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    private CustomerDAO customerDAO;
    @RequestMapping("/list")
    public String listCustomer(Model model){

        List<Customer> customers = customerDAO.getCustomerList();

        model.addAttribute("customers",customers);

        return "list-customers";
    }
}
