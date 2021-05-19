package com.github.alexanderoliveira.citiesapi.states;

import com.github.alexanderoliveira.citiesapi.countries.Country;

import java.util.List;

public class State {
    private Long id;
    private String name;
    private String uf;
    private Integer ibge;
    private Country country;
    private List<Integer> ddd;

    public State() {
    }
}
