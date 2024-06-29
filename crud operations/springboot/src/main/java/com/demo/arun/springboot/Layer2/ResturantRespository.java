package com.demo.arun.springboot.Layer2;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import  com.demo.arun.springboot.Layer1.Resturant;
@Repository
public interface ResturantRespository extends CrudRepository <Resturant ,Integer> {
  Resturant findById(int id);
List<Resturant>findAll();
    
} 