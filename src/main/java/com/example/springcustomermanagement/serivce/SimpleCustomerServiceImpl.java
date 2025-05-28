package com.example.springcustomermanagement.serivce;

import com.example.springcustomermanagement.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class SimpleCustomerServiceImpl implements ICustomerService<Customer> {

    private final List<Customer> customers;

    public SimpleCustomerServiceImpl() {
        customers = new ArrayList<Customer>();
        customers.add(new Customer(1, "Nguyen Van A", "NguyenVanA@gmail.com", "Ha Noi"));
        customers.add(new Customer(2, "Jerry", "Jerry1@gmail.com", "Ha Noi"));
        customers.add(new Customer(3, "Tom", "Tom34@gmail.com", "Hai Phong"));
        customers.add(new Customer(4, "Peter", "peter2@gmail.com", "Thai Binh"));
    }

    @Override
    public List<Customer> findAll() {
        return customers;
    }

    @Override
    public Customer findById(int id) {
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }

    @Override
    public Customer save(Customer entity) {
        Customer c = findById(entity.getId());
        c.setName(entity.getName());
        c.setEmail(entity.getEmail());
        c.setAddress(entity.getAddress());
        return c;
    }
}
