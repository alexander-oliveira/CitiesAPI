package com.github.alexanderoliveira.citiesapi.cities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cidade")
public class City {
    @Id;
    private Long id;

    @Column(name = "nome")
    private String name;

    private Integer uf;

    private Integer ibge;

    @Column(name = "lat_lon")
    private String geolocation;

    @Column(name = "lat_lon", updatable = false, insertable = false)
    private Point location;

    public City() {
    }
}
