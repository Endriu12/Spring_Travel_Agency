package com.perepelitsya.service.route.impl;

import com.perepelitsya.dao.route.impl.DaoRouteImpl;
import com.perepelitsya.dao.route.interfaces.IDaoRoute;
import com.perepelitsya.model.route.Route;
import com.perepelitsya.model.route.enums.Hotels;
import com.perepelitsya.service.route.interfaces.IRouteService;

import java.util.List;

/**
 * Created by Andriu on 28.03.2017.
 */
public class RouteServiceImpl implements IRouteService {
    IDaoRoute iDaoRoute;

    public RouteServiceImpl(IDaoRoute iDaoRoute) {
        this.iDaoRoute = iDaoRoute;
    }

    public RouteServiceImpl() {
    }

    public IDaoRoute getiDaoRoute() {
        return iDaoRoute;
    }

    public void setiDaoRoute(IDaoRoute iDaoRoute) {
        this.iDaoRoute = iDaoRoute;
    }

    public List<Route> getAll() {
        return iDaoRoute.getAll();
    }

    public Route getRoute(int id) {
        return iDaoRoute.getRoute(id);
    }

    public void createRoute(Route route) {
        iDaoRoute.createRoute(route);
    }

    public void updateRoute(Route route) {
        iDaoRoute.updateRoute(route);
    }

    public void deleteRoute(int id) {
        iDaoRoute.deleteRoute(id);
    }

    public void showAll() {
        iDaoRoute.showAll();
    }

    @Override
    public int getSizeOfList() {
        return iDaoRoute.getAll().size();
    }

    @Override
    public int getCustomerIdWhoLiveInSeventStarHotel() {
        int sum = 0;
        for (Route route : iDaoRoute.getAll()){
            if(route.getHotel().equals(Hotels.SEVENSTAR)){
                sum += route.getRoute_id();
            }
        }
        return  sum;
    }

    @Override
    public void getRouteWhoWillBeIn(String country) {
        Route route = null;
        for (Route r : iDaoRoute.getAll()) {
            if (r.getCountry().equals(country)) {
                System.out.println(r);
            }
        }
    }

    @Override
    public int getAllCustomerPriceWhoLiveFIVESTAR() {
        int sum = 0;
        for(Route r : iDaoRoute.getAll()){
            if(r.getHotel().equals(Hotels.FIVESTAR)){
                sum+=r.getPrice();
            }
        }
        return  sum;
    }
}
