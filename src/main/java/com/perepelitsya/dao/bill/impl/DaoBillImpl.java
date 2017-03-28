package com.perepelitsya.dao.bill.impl;

import com.perepelitsya.dao.bill.interfaces.IDaoBill;
import com.perepelitsya.model.bill.Bill;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andriu on 28.03.2017.
 */
public class DaoBillImpl implements IDaoBill {
    public List<Bill> billList = new ArrayList<>();

    public List<Bill> getBillList() {
        return billList;
    }

    public void setBillList(List<Bill> billList) {
        this.billList = billList;
    }

    public DaoBillImpl(List<Bill> billList) {
        this.billList = billList;
    }

    public DaoBillImpl() {
    }

    public List<Bill> getAll() {
        return billList;
    }

    public Bill getBill(int id) {
        Bill result = null;
        for (Bill item : billList) {
            if (item.getId() == id) {
                result = new Bill(
                        item.getId(),
                        item.getCustomer(),
                        item.getVoucher(),
                        item.getRoute());
            }
        }
        return result;
    }

    public void createBill(Bill bill) {
        billList.add(bill);
    }

    public void updateBill(Bill bill) {
        Bill updateBill = null;
        for (Bill item : billList) {
            if (item.getId() == bill.getId()) {
                updateBill = item;
                break;

            }
        }
        updateBill = bill;
    }

    public void deleteBill(int id) {
        boolean a = false;
        a = billList.removeIf(voucher -> voucher.getId() == id);
        if (a == true) {
            billList.remove(getBill(id));
        }
    }

    public void showAll() {
        for (Bill item : billList) {
            System.out.println(item.toString());
        }
    }
}