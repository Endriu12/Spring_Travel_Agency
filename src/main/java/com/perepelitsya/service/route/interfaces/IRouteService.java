package com.perepelitsya.service.route.interfaces;

import com.perepelitsya.model.route.Route;

import java.util.List;

/**
 * Created by Andriu on 28.03.2017.
 */
public interface IRouteService {
    List<Route> getAll();
    Route getRoute(int id);
    void createRoute(Route route);
    void updateRoute(Route  route);
    void deleteRoute(int id);
    void showAll();
}
