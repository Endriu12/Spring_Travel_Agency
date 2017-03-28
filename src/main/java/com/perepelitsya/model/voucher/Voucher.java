package com.perepelitsya.model.voucher;


/**
 * Created by Andriu on 12.03.2017.
 */

public class Voucher {
    int id;
    int customer_id;
    String date;
    int number;//the number of peple with me, number of tikets
    int discount;

    public Voucher(int id, int customer_id, String date, int number, int discount) {
        this.id = id;
        this.customer_id = customer_id;
        this.date = date;
        this.number = number;
        this.discount = discount;
    }

    public Voucher() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Voucher{" + "id=" + id + ", customer_id=" + customer_id + ", date='" + date + '\'' +
                ", number=" + number + ", discount=" + discount + '}' + "\n";
    }
}