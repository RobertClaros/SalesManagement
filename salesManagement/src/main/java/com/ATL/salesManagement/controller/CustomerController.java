package com.ATL.salesManagement.controller;

import com.ATL.salesManagement.model.Customer;
import com.ATL.salesManagement.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
    @Autowired
    ICustomerService customerService;

    @GetMapping("")
    public List<Customer> findAll(){
        return customerService.findAll();
    }
    @PostMapping("/create")
    public String saveCustomer(@RequestBody Customer customer){
        customerService.saveCustomer(customer);
        return "Customer created";
    }

    @GetMapping("/id_customer")
    public Customer findCustomerById(@PathVariable Long id_customer){
        return customerService.findById(id_customer);
    }

    @DeleteMapping("/delete{id_customer}")
    public String deleteCustomer(@PathVariable Long id_customer){
        customerService.deleteCustomer(id_customer);
        return "Customer deleted";
    }

    public String editCustomer(@PathVariable Long id_customer,
                               @RequestParam(required = false,name = "name") String newName,
                               @RequestParam(required = false,name = "dni") String newDni,
                               @RequestParam(required = false,name = "email") String newEmail)
    {
        customerService.editCustomer(id_customer,newName,newDni,newEmail);
        return "Customer updated";


    }


}
