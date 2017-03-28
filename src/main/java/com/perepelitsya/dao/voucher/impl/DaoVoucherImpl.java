package com.perepelitsya.dao.voucher.impl;

import com.perepelitsya.dao.voucher.interfaces.IDaoVoucher;
import com.perepelitsya.model.voucher.Voucher;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andriu on 28.03.2017.
 */
public class DaoVoucherImpl implements IDaoVoucher {

    public List<Voucher> voucherList = new ArrayList<Voucher>();

    public List<Voucher> getVoucherList() {
        return voucherList;
    }

    public void setVoucherList(List<Voucher> voucherList) {
        this.voucherList = voucherList;
    }

    public DaoVoucherImpl(List<Voucher> voucherList) {
        this.voucherList = voucherList;
    }

    public DaoVoucherImpl() {
    }

    public List<Voucher> getAll() {
        return voucherList;
    }

    public Voucher getVoucher(int id) {
        Voucher result = null;
        for (Voucher _item : voucherList) {
            if (_item.getId() == id) {
                result = new Voucher(
                        _item.getId(),
                        _item.getCustomer_id(),
                        _item.getDate(),
                        _item.getDiscount(),
                        _item.getNumber());
            }
        }
        return result;
    }

    public void createVoucher(Voucher voucher) {
        voucherList.add(voucher);
    }

    public void updateVoucher(Voucher voucher) {
        Voucher updateVoucher = null;
        for (Voucher item : voucherList) {
            if (item.getId() == voucher.getId()) {
                updateVoucher = item;
                break;

            }
        }
        updateVoucher = voucher;
    }

    public void deleteVoucher(int id) {

        boolean a = false;
        a = voucherList.removeIf(voucher -> voucher.getId() == id);
        if (a == true) {
            voucherList.remove(getVoucher(id));
        }
//
//        voucherList.stream()
//                .filter(p -> p.getId() == (id))
//                .findFirst()
//                .map(p -> {
//                    voucherList.remove(id);
//                    return p;
//                });
    }

    public void showAll() {
        for (Voucher voucher1 : voucherList) {
            System.out.println(voucher1.toString());
        }
    }
}