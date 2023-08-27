package com.ATL.salesManagement.service;

import com.ATL.salesManagement.model.Customer;
import com.ATL.salesManagement.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService{

    @Autowired
    ICustomerRepository customerRepository;
    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = customerRepository.findAll();
        return null;
    }

    @Override
    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);

    }

    @Override
    public Customer findById(Long id_customer) {
        Customer customer = customerRepository.findById(id_customer).orElse(null);
        return customer;
    }

    @Override
    public void deleteCustomer(Long id_customer) {
        customerRepository.deleteById(id_customer);
    }

    @Override
    public void editCustomer(Long id_customer, String newName, String newDni, String newEmail) {
            Customer customer = this.findById(id_customer);
            customer.setName(newName);
            customer.setDni(newDni);
            customer.setEmail(newEmail);
            this.saveCustomer(customer);
    }
}
