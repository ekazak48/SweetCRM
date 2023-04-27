package ru.ekz48.own.sweetcrm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ekz48.own.sweetcrm.db.CustomerRepository;
import ru.ekz48.own.sweetcrm.entities.db.CustomerEntity;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    CustomerRepository customerRepository;

    @Autowired
    CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<CustomerEntity> getCustomers() {
        List<CustomerEntity> customerEntityList = new ArrayList<>();
        customerRepository.findAll().forEach(customerEntityList::add);
        return customerEntityList;
    }

    public CustomerEntity getCustomer(Long id) {
        return customerRepository.findById(id).orElse(new CustomerEntity());
    }

    public CustomerEntity updateCustomer(CustomerEntity c) {
        return customerRepository.save(c);
    }

}
