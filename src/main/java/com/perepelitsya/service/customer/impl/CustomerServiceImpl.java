package com.perepelitsya.service.customer.impl;

import com.perepelitsya.dao.customer.interfaces.IDaoCustomer;
import com.perepelitsya.model.customers.Customer;
import com.perepelitsya.service.customer.interfaces.ICustomerService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andriu on 28.03.2017.
 */
public class CustomerServiceImpl implements ICustomerService {

    IDaoCustomer iDaoCustomer;

    public CustomerServiceImpl() {}

    public CustomerServiceImpl(IDaoCustomer iDaoCustomer) {
        this.iDaoCustomer = iDaoCustomer;
    }

    public IDaoCustomer getiDaoCustomer() {
        return iDaoCustomer;
    }

    public void setiDaoCustomer(IDaoCustomer iDaoCustomer) {
        this.iDaoCustomer = iDaoCustomer;
    }

    public List<Customer> getAll() {
        return iDaoCustomer.getAll();
    }

    public Customer getCustomer(int id) {
        return iDaoCustomer.getCustomer(id);
    }

    public void createCustomer(Customer customer) {
        iDaoCustomer.createCustomer(customer);
    }

    public void updateCustomer(Customer customer) {
        iDaoCustomer.updateCustomer(customer);
    }

    public void deleteCustomer(int id) {
        iDaoCustomer.deleteCustomer(id);
    }

    public void showAll() {
        iDaoCustomer.showAll();
    }

    @Override
    public void getCustomerIdWhoHaveMobilePhone(String mobilePhone) {
        for(Customer customer : iDaoCustomer.getAll()){
           if(customer.getMobilePhone().equals(mobilePhone)){
               System.out.println("Customer who have this mobilePhone " + mobilePhone + " " + "ID: = " + customer.getCustomer_id());
           }
        }
    }

    @Override
    public int getSizeOfListCustomer() {
        return iDaoCustomer.getAll().size();
    }

    @Override
    public List<String> getAllMobilePhoneCustomer() {
        ArrayList<String> customerArrayList =  new ArrayList<>();
        for(Customer customer : getAll()) {
            customerArrayList.add(customer.getMobilePhone());
        }
        return customerArrayList;
    }

    @Override
    public void getAddressOfCustomerWhoLastnameIs(String lastname) {
        for(Customer customer : iDaoCustomer.getAll()){
            if(customer.getLastname().equals(lastname)){
                System.out.println("Customer who lastname is " + lastname + "  " + "her address is " + customer.getAddress());
            }
        }
    }
}