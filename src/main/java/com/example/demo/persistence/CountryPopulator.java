package com.example.demo.persistence;

import com.example.demo.domain.City;
import com.example.demo.domain.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Repository;

@Repository
public class CountryPopulator implements CommandLineRunner {
    @Autowired
    CountryRepo repo;
    @Autowired
    CityRepo cityRepo;
    @Override
    public void run(String... args) throws Exception{
        final var country=repo.save(new Country("India"));
//        repo.save(country);
        cityRepo.save(new City(country,"New Delhi"));
        cityRepo.save(new City(country,"Mumbai"));
        cityRepo.save(new City(country,"Banglore"));
        cityRepo.save(new City(country,"Punjab"));
        cityRepo.save(new City(country,"Chennai"));


    }

}
