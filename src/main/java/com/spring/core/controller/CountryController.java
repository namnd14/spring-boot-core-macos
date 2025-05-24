package com.spring.core.controller;

import com.spring.core.dto.request.PagingRequestDTO;
import com.spring.core.dto.request.SearchCountryRequestDTO;
import com.spring.core.entity.Country;
import com.spring.core.service.CountryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name = "Country", description = "Country management APIs")
public class CountryController {
    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @Operation(summary = "Get all countries")
    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        return countryService.getAllCountries();
    }

    // default when don't specific for GET is @ModelAttribute
    @Operation(summary = "Get paginated countries")
    @GetMapping("/countries/paginated")
    public String getPaginatedCountries(@Valid @ModelAttribute PagingRequestDTO requestDTO) {
        // Assuming you have a method in your service to handle pagination
        // You can replace this with actual pagination logic
        return "Paginated countries";
    }

    @Operation(summary = "Search country")
    @PostMapping("/countries/search")
    public Page<Country> searchCountry(@Valid @RequestBody SearchCountryRequestDTO requestDTO) {
        return countryService.searchCountry(requestDTO);
    }
}
