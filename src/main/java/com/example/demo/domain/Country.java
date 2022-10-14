package com.example.demo.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity

public class Country extends Model {
    @OneToMany(mappedBy = "country")
    private Set<City> cities;
    private  String name;


    public Country(String name) {
        this.name = name;
    }
    public Set<City> getCities() {
        return cities;
    }

    public String getName() {
        return name;
    }

    Country(){
        super();
    }


}
