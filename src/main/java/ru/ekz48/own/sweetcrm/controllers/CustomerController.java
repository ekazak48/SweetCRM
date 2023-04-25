package ru.ekz48.own.sweetcrm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.ekz48.own.sweetcrm.entities.api.CustomerEntity;
import ru.ekz48.own.sweetcrm.entities.db.Customer;
import ru.ekz48.own.sweetcrm.services.CustomerService;

import java.util.List;


@RestController
@RequestMapping("/customer")
public class CustomerController {

    CustomerService customerService;

    @Autowired
    CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(name = "/getAll")
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @PostMapping(name = "/update")
    public Object updateCustomer(@RequestBody CustomerEntity ce) {
        Customer customer = new Customer(ce.name, ce.phone, ce.email);
        return customerService.updateCustomer(customer);
    }

    @PostMapping("/getCustomer")
    public Customer getById(Long id) {
        return customerService.getCustomer(id);
    }
}
