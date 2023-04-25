package ru.ekz48.own.sweetcrm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ekz48.own.sweetcrm.db.CustomerRepository;
import ru.ekz48.own.sweetcrm.entities.db.Customer;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    CustomerRepository customerRepository;

    @Autowired
    CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getCustomers() {
        List<Customer> customerList = new ArrayList<>();
        customerRepository.findAll().forEach(customerList::add);
        return customerList;
    }

    public Customer getCustomer(Long id) {
        return customerRepository.findById(id).orElse(new Customer());
    }

    public Customer updateCustomer(Customer c) {
        return customerRepository.save(c);
    }

}
