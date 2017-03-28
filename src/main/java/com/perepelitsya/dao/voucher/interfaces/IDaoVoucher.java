package com.perepelitsya.dao.voucher.interfaces;

import com.perepelitsya.model.voucher.Voucher;

import java.util.List;

/**
 * Created by Andriu on 28.03.2017.
 */
public interface IDaoVoucher {
    List<Voucher> getAll();
    Voucher getVoucher(int id);
    void createVoucher(Voucher voucher);
    void updateVoucher(Voucher voucher);
    void deleteVoucher(int id);
    void showAll();
}
