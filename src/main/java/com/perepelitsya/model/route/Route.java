package com.perepelitsya.model.route;

import com.perepelitsya.model.route.enums.*;

/**
 * Created by Andriu on 12.03.2017.
 */
public class Route {
    int route_id;
    String country;
    String climate;
    int days;
    Hotels hotel;
    int price;

    public Route() {
    }

    public Route(int route_id, String country, String climate, int days, Hotels hotel, int price) {
        this.route_id = route_id;
        this.country = country;
        this.climate = climate;
        this.days = days;
        this.hotel = hotel;
        this.price = price;
    }

    public int getRoute_id() {
        return route_id;
    }

    public void setRoute_id(int route_id) {
        this.route_id = route_id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public Hotels getHotel() {
        return hotel;
    }

    public void setHotel(Hotels hotel) {
        this.hotel = hotel;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Route{" +
                "route_id=" + route_id +
                ", country='" + country + '\'' +
                ", climate='" + climate + '\'' +
                ", days=" + days +
                ", hotel=" + hotel +
                ", price=" + price +
                '}'  + "\n";
    }
}