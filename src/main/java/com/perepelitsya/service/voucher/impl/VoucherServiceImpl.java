package com.perepelitsya.service.voucher.impl;

import com.perepelitsya.dao.voucher.interfaces.IDaoVoucher;
import com.perepelitsya.model.voucher.Voucher;
import com.perepelitsya.service.voucher.interfaces.IVoucherService;

import java.util.List;

/**
 * Created by Andriu on 28.03.2017.
 */
public class VoucherServiceImpl implements IVoucherService {
    IDaoVoucher iDaoVoucher;

    public IDaoVoucher getiDaoVoucher() {
        return iDaoVoucher;
    }

    public void setiDaoVoucher(IDaoVoucher iDaoVoucher) {
        this.iDaoVoucher = iDaoVoucher;
    }

    public VoucherServiceImpl() {
    }

    public VoucherServiceImpl(IDaoVoucher iDaoVoucher) {
        this.iDaoVoucher = iDaoVoucher;
    }

    public List<Voucher> getAll() {
        return iDaoVoucher.getAll();
    }

    public Voucher getVoucher(int id) {
        return iDaoVoucher.getVoucher(id);
    }

    public void createVoucher(Voucher voucher) {
        iDaoVoucher.createVoucher(voucher);
    }

    public void updateVoucher(Voucher voucher) {
        iDaoVoucher.updateVoucher(voucher);
    }

    public void deleteVoucher(int id) {
        iDaoVoucher.deleteVoucher(id);
    }

    public void showAll() {
        iDaoVoucher.showAll();
    }


    @Override
    public int getSizeOfList() {
        return iDaoVoucher.getAll().size();
    }

    @Override
    public void getAllVoucherWhoIsEnable(String date) {
        Voucher a = null;
        for(Voucher v : iDaoVoucher.getAll()){
            if(v.getDate().equals(date)){
                System.out.println(v);
            }
        }
    }

    @Override
    public int getSumOfAllDiscount() {
//        int sum  = 0;
//        for (Bill bill:this.bills) {
//            sum+=bill.getPriceWithDiscount();
//        }
//        return sum;
        int sum = 0;
        for(Voucher voucher : iDaoVoucher.getAll()){
            sum+=voucher.getDiscount();
        }
        return sum;
    }

    @Override
    public int getSumOfAllVoucherPeopleWhoWasToday() {
        int sum = 0;
        for(Voucher voucher : iDaoVoucher.getAll()){
            sum+=voucher.getNumber();
        }
        return  sum;
    }
}