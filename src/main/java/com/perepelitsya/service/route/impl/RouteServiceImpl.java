package com.perepelitsya.service.route.impl;

import com.perepelitsya.dao.route.impl.DaoRouteImpl;
import com.perepelitsya.dao.route.interfaces.IDaoRoute;
import com.perepelitsya.model.route.Route;
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

    public RouteServiceImpl() {}

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
}
