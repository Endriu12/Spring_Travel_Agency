package com.perepelitsya;

import com.perepelitsya.dao.voucher.impl.DaoVoucherImpl;
import com.perepelitsya.dao.voucher.interfaces.IDaoVoucher;
import com.perepelitsya.model.BillsManager;
import com.perepelitsya.model.bill.Bill;
import com.perepelitsya.model.customers.Customer;
import com.perepelitsya.model.route.Route;
import com.perepelitsya.model.route.enums.Hotels;
import com.perepelitsya.model.voucher.Voucher;
import com.perepelitsya.service.bill.impl.BillServiceImpl;
import com.perepelitsya.service.customer.impl.CustomerServiceImpl;
import com.perepelitsya.service.route.impl.RouteServiceImpl;
import com.perepelitsya.service.voucher.impl.VoucherServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by Andriu on 21.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        //  this is 3 Lab
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("model/bill-manager-context.xml");
//        BillsManager v = (BillsManager) applicationContext.getBean("BillsManager");
//        System.out.println(v.getBills());

/**
 *      this is 4 Lab with Service implementetion
 */


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("service/spring-context.xml");

        VoucherServiceImpl i = (VoucherServiceImpl) applicationContext.getBean("service-voucher");
        Voucher voucher = new Voucher(11, 11, "12.05.2012", 4, 40);
        i.createVoucher(voucher);
        System.out.println(i.getVoucher(7));
        i.deleteVoucher(2);
        System.out.println(i.getAll());
        System.out.println(i.getSizeOfList());
        i.getAllVoucherWhoIsEnable("03.05.2017");
        System.out.println(i.getSumOfAllDiscount());
        System.out.println(i.getSumOfAllVoucherPeopleWhoWasToday());


        RouteServiceImpl routeService = (RouteServiceImpl) applicationContext.getBean("service-route");
        Route route = new Route(11, "Japan", "subtropical", 12, Hotels.FIVESTAR, 10000);
        routeService.createRoute(route);
        System.out.println(routeService.getAll());
        System.out.println(routeService.getRoute(2));
        routeService.getRouteWhoWillBeIn("Kiev");
        System.out.println(routeService.getCustomerIdWhoLiveInSeventStarHotel());
        System.out.println(routeService.getAllCustomerPriceWhoLiveFIVESTAR());


        CustomerServiceImpl customerService = (CustomerServiceImpl) applicationContext.getBean("service-customer");
        System.out.println(customerService.getAll());
        customerService.getCustomerIdWhoHaveMobilePhone("0503495002");
        Customer customer = new Customer(11, "Andriu", "Andriuovuch", "Rivnenska", "0944328554");
        customerService.createCustomer(customer);
        System.out.println(customerService.getAll());
        System.out.println(customerService.getAllMobilePhoneCustomer());
        customerService.getAddressOfCustomerWhoLastnameIs("Andriuovuch");
//
//        BillServiceImpl billService = (BillServiceImpl) applicationContext.getBean("service-bill");
//        Bill bill = new Bill(11, customer, voucher, route);
//        billService.createBill(bill);
//        billService.showAll();
//        System.out.println(billService.getAll());
    }
}