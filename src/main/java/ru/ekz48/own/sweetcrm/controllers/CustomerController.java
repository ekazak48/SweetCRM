package ru.ekz48.own.sweetcrm.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ru.ekz48.own.sweetcrm.entities.api.Customer;
import ru.ekz48.own.sweetcrm.entities.db.CustomerEntity;
import ru.ekz48.own.sweetcrm.services.CustomerService;

import java.util.List;


@RestController
@RequestMapping("/customer")
public class CustomerController {

    CustomerService customerService;
    ObjectMapper objectMapper;

    @Autowired
    CustomerController(CustomerService customerService) {
        this.customerService = customerService;
        this.objectMapper = new ObjectMapper();
    }

    @GetMapping(name = "/getAll")
    public List<CustomerEntity> getCustomers() {
        return customerService.getCustomers();
    }

    @PostMapping(name = "/update")
    public Object updateCustomer(@RequestBody String ce) throws JsonProcessingException {
        Customer customerEntity = objectMapper.readValue(ce, Customer.class);
        CustomerEntity customer = new CustomerEntity(customerEntity.name, customerEntity.phone, customerEntity.email);
        return customerService.updateCustomer(customer);
    }

    @GetMapping("/getCustomer")
    public CustomerEntity getById(@RequestParam(name = "id") Long id) {
        return customerService.getCustomer(id);
    }
}
