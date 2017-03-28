package com.perepelitsya.dao.route.impl;

import com.perepelitsya.dao.route.interfaces.IDaoRoute;
import com.perepelitsya.model.route.Route;
import com.perepelitsya.model.voucher.Voucher;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andriu on 28.03.2017.
 */
public class DaoRouteImpl implements IDaoRoute {
    public  List<Route> routeList = new ArrayList<>();

    public List<Route> getRouteList() {
        return routeList;
    }

    public void setRouteList(List<Route> routeList) {
        this.routeList = routeList;
    }

    public DaoRouteImpl(List<Route> routeList) {
        this.routeList = routeList;
    }

    public DaoRouteImpl() {
    }

    public List<Route> getAll() {
        return routeList;
    }

    public Route getRoute(int id) {
        Route result = null;
        for (Route _item : routeList) {
            if (_item.getRoute_id() == id) {
                result = new Route(
                        _item.getRoute_id(),
                        _item.getCountry(),
                        _item.getClimate(),
                        _item.getDays(),
                        _item.getHotel(),
                        _item.getPrice());
            }
        }
        return  result;
    }

    public void createRoute(Route route) {
        routeList.add(route);
    }

    public void updateRoute(Route route) {
        Route updateRoute = null;
        for (Route item : routeList) {
            if (item.getRoute_id() == route.getRoute_id()) {
                updateRoute = item;
                break;

            }
        }
        updateRoute = route;
    }

    public void deleteRoute(int id) {

        boolean a = false;
        a = routeList.removeIf(voucher -> voucher.getRoute_id() == id);
        if (a == true) {
            routeList.remove(getRoute(id));
        }
    }

    public void showAll() {
        for (Route route1 : routeList) {
            System.out.println(route1.toString());
        }
    }
}
