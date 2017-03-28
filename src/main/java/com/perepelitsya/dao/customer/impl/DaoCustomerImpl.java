package com.perepelitsya.dao.customer.impl;

import com.perepelitsya.dao.customer.interfaces.IDaoCustomer;
import com.perepelitsya.model.customers.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andriu on 28.03.2017.
 */
public class DaoCustomerImpl implements IDaoCustomer {
    public List<Customer> customers = new ArrayList<>();

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public DaoCustomerImpl(List<Customer> customers) {
        this.customers = customers;
    }

    public DaoCustomerImpl() {
    }

    public List<Customer> getAll() {
        return customers;
    }

    public Customer getCustomer(int id) {
        Customer result = null;
        for (Customer item : customers) {
            if (item.getCustomer_id() == id) {
                result = new Customer(
                        item.getCustomer_id(),
                        item.getFirstname(),
                        item.getLastname(),
                        item.getAddress(),
                        item.getMobilePhone());
            }
        }
        return result;
    }

    public void createCustomer(Customer customer) {
        customers.add(customer);
    }

    public void updateCustomer(Customer customer) {
        Customer updateCustomer = null;
        for (Customer item : customers) {
            if (item.getCustomer_id() == customer.getCustomer_id()) {
                updateCustomer = item;
                break;
            }
        }
        updateCustomer = customer;

    }

    public void deleteCustomer(int id) {

        boolean a = false;
        a = customers.removeIf(voucher -> voucher.getCustomer_id() == id);
        if (a == true) {
            customers.remove(getCustomer(id));
        }
    }

    public void showAll() {
        for (Customer customer1 : customers) {
            System.out.println(customer1.toString());
        }
    }
}