package com.spring.core.controller;

import com.spring.core.dto.request.PagingRequestDTO;
import com.spring.core.entity.Country;
import com.spring.core.service.CountryService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {
    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        return countryService.getAllCountries();
    }

    // default when don't specific for GET is @ModelAttribute
    @GetMapping("/countries/paginated")
    public String getPaginatedCountries(@Valid @ModelAttribute PagingRequestDTO requestDTO) {
        // Assuming you have a method in your service to handle pagination
        // You can replace this with actual pagination logic
        return "Paginated countries";
    }
}
