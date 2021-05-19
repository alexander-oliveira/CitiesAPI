package com.github.alexanderoliveira.citiesapi.states;

import com.github.alexanderoliveira.citiesapi.countries.Country;
import org.hibernate.annotations.Table;
import javax.persistence.*;
import java.util.List;

@Entity(name = "State")
@Table(name = "estado")
public class State {

    @Id
    private Long id;

    @Column(name = "nome")
    private String name;

    private String uf;

    private Integer ibge;

    @ManyToOne
    @JoinColumn(name = "pais", referencedColumnName = "id")
    private Country country;

    private List<Integer> ddd;

    public State() {
    }
}
