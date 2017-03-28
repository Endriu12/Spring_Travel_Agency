package com.perepelitsya.service.bill.impl;

import com.perepelitsya.dao.bill.impl.DaoBillImpl;
import com.perepelitsya.dao.bill.interfaces.IDaoBill;
import com.perepelitsya.model.bill.Bill;
import com.perepelitsya.service.bill.interfaces.IBillService;

import java.util.List;

/**
 * Created by Andriu on 28.03.2017.
 */
public class BillServiceImpl implements IBillService {
    IDaoBill iDaoBill;

    public IDaoBill getiDaoBill() {
        return iDaoBill;
    }

    public void setiDaoBill(IDaoBill iDaoBill) {
        this.iDaoBill = iDaoBill;
    }

    public BillServiceImpl(IDaoBill iDaoBill) {
        this.iDaoBill = iDaoBill;
    }

    public BillServiceImpl(DaoBillImpl daoBill) {
    }

    public List<Bill> getAll() {
        return iDaoBill.getAll();

    }

    public Bill getBill(int id) {
        return iDaoBill.getBill(id);
    }

    public void createBill(Bill bill) {
        iDaoBill.createBill(bill);
    }

    public void updateBill(Bill bill) {
        iDaoBill.updateBill(bill);
    }

    public void deleteBill(int id) {
        iDaoBill.deleteBill(id);
    }

    public void showAll() {
        iDaoBill.showAll();
    }


}
