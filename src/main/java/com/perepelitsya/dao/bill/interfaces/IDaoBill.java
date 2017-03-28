package com.perepelitsya.dao.bill.interfaces;

import com.perepelitsya.model.bill.Bill;

import java.util.List;

/**
 * Created by Andriu on 28.03.2017.
 */
public interface IDaoBill {
    List<Bill> getAll();
    Bill getBill(int id);
    void createBill(Bill bill);
    void updateBill(Bill bill);
    void deleteBill(int id);
    void showAll();
}