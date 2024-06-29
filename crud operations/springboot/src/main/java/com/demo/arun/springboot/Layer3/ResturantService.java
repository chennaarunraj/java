package com.demo.arun.springboot.Layer3;

import java.util.List;

import com.demo.arun.springboot.Layer1.Resturant;

public interface ResturantService {

    Resturant addResturant(Resturant resturant);
    Resturant updResturant(int id,Resturant resturant);
    void remove(int id);
    Resturant getByIdResturant(int id);
    List<Resturant> getAllResturants();
}
