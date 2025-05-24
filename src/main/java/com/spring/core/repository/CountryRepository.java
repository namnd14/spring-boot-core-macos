package com.spring.core.repository;

import com.spring.core.entity.Country;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
    @Query(
            nativeQuery = true,
            value = "SELECT * FROM country c WHERE (:countryName IS NULL OR c.country_name LIKE  %:countryName%)"
    )
    Page<Country> search(Pageable pageable, String countryName);
}
