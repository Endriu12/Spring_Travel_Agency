package com.perepelitsya.dao.customer.interfaces;

import com.perepelitsya.model.customers.Customer;

import java.util.List;

/**
 * Created by Andriu on 28.03.2017.
 */
public interface IDaoCustomer {
    List<Customer> getAll();
    Customer getCustomer(int id);
    void createCustomer(Customer customer);
    void updateCustomer(Customer customer);
    void deleteCustomer(int id);
    void showAll();
}
