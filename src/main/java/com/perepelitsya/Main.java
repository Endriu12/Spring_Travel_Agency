package com.perepelitsya;

import com.perepelitsya.dao.voucher.impl.DaoVoucherImpl;
import com.perepelitsya.dao.voucher.interfaces.IDaoVoucher;
import com.perepelitsya.model.BillsManager;
import com.perepelitsya.service.bill.impl.BillServiceImpl;
import com.perepelitsya.service.voucher.impl.VoucherServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by Andriu on 21.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        //this is 3 Lab
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("model/bill-manager-context.xml");
//        BillsManager v = (BillsManager) applicationContext.getBean("BillsManager");
//        System.out.println(v.getBills());

/**
 *      this is 4 Lab with Service implementetion
 */


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("service/spring-context.xml");

        VoucherServiceImpl i = (VoucherServiceImpl) applicationContext.getBean("service-voucher");
        System.out.println(i.getVoucher(7));
        i.deleteVoucher(2);
        System.out.println(i.getAll());
        System.out.println(i.getSizeOfList());
        i.getAllVoucherWhoIsEnable("03.05.2017");
        System.out.println(i.getSumOfAllDiscount());
        BillServiceImpl billService = (BillServiceImpl) applicationContext.getBean("service-bill");

    }
}