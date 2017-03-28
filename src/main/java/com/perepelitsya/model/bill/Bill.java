package com.perepelitsya.model.bill;

import com.perepelitsya.model.customers.Customer;
import com.perepelitsya.model.route.Route;
import com.perepelitsya.model.voucher.Voucher;

/**
 * Created by Andriu on 12.03.2017.
 */
public class Bill  {

     int id;
     Customer customer;
     Voucher voucher;
     Route route;

    public Bill() {
    }

    public Bill(int id, Customer customer, Voucher voucher, Route route) {
        this.id = id;
        this.customer = customer;
        this.voucher = voucher;
        this.route = route;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Voucher getVoucher() {
        return voucher;
    }

    public void setVoucher(Voucher voucher) {
        this.voucher = voucher;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    @Override
    public String toString() {
        return  voucher.toString() + route.toString() + customer.toString();
    }
}