package com.github.alexanderoliveira.citiesapi.repository;

import com.github.alexanderoliveira.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
