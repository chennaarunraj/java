package com.demo.arun.springboot.Layer3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.arun.springboot.Layer1.Resturant;
import com.demo.arun.springboot.Layer2.ResturantRespository;

@Service

public class ResturantServiceImpl implements ResturantService{

    @Autowired
    ResturantRespository resturantrepo;

    @Override
    public Resturant addResturant(Resturant resturant) {
        return resturantrepo.save(resturant);
       
    }

    @Override
    public Resturant updResturant(int id, Resturant resturant) {
        Resturant r2=resturantrepo.findById(id);
        if(resturant.getPname()!=null){
            r2.setPname(resturant.getPname());
        }
        if(resturant.getFoodprice()!=0){
            r2.setFoodprice(resturant.getFoodprice());
        }
        return resturantrepo.save(resturant);
    }

    @Override
    public void remove(int id) {
        resturantrepo.deleteById(id);
       
    }

    @Override
    public Resturant getByIdResturant(int id) {
       return  resturantrepo.findById(id);
       
    }

    @Override
    public List<Resturant> getAllResturants() {
        return resturantrepo.findAll();
       
    }
    
}