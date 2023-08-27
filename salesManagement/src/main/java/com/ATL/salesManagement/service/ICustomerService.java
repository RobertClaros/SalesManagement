package com.ATL.salesManagement.service;

import com.ATL.salesManagement.model.Customer;

import java.util.List;

public interface ICustomerService {
    public List<Customer> findAll();
    public void saveCustomer(Customer customer);
    public Customer findById( Long id_customer);
    public void deleteCustomer(Long id_customer);
    public void editCustomer(Long id_customer, String newName, String newDni,String newEmail);

}
