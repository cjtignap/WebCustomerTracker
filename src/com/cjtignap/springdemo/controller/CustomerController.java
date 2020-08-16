package com.cjtignap.springdemo.controller;

import com.cjtignap.springdemo.DAO.CustomerDAO;
import com.cjtignap.springdemo.Service.CustomerService;
import com.cjtignap.springdemo.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    CustomerService customerServiceImpl;

    @GetMapping(value = "/list")
    public String listCustomer(Model model){

        List<Customer> customers = customerServiceImpl.getCustomerList();

        model.addAttribute("customers",customers);

        return "list-customers";
    }
    @GetMapping(value = "/add-customer")
    public String addCustomer(Model model){
        Customer customer = new Customer();
        model.addAttribute("customer",customer);

        return "add-customer";
    }
    @PostMapping(value="saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Customer customer){
        customerServiceImpl.saveCustomer(customer);
        return "redirect:/customer/list";
    }

    @GetMapping(value="updateCustomer")
    public String updateCustomer(@RequestParam("customerId")int id,Model model){
        Customer customer = customerServiceImpl.getCustomer(id);
        model.addAttribute("customer",customer);
        return "add-customer";
    }
    @GetMapping(value="deleteCustomer")
    public String deleteCustomer(@RequestParam("customerId")int id){
        customerServiceImpl.deleteCustomer(id);

        return "redirect:/customer/list";
    }
}
