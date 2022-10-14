package com.example.demo.controller;

import com.example.demo.domain.Country;
import com.example.demo.persistence.CountryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/country")
public class MainController {
   @Autowired
   private CountryRepo repo;


    @GetMapping
    public List<Country> Countries(){
        return repo.findAll();
    }

}
