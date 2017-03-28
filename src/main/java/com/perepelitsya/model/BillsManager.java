package com.perepelitsya.model;

import com.perepelitsya.model.bill.Bill;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andriu on 28.03.2017.
 */
public class BillsManager {
    private List<Bill> bills = new ArrayList<Bill>();

    public List<Bill> getBills() {
        return bills;
    }

    public void setBills(List<Bill> bills) {
        this.bills = bills;
    }

    public BillsManager() {
    }

    public BillsManager(ArrayList<Bill> bills) {
        this.bills = bills;
    }

}