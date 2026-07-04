package com.cognizant.country_web_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.country_web_service.model.Country;
import com.cognizant.country_web_service.service.CountryService;

@RestController
public class CountryController {

	@Autowired
	private CountryService countryService;

	@GetMapping("/countries/{code}")
	public Country getCountry(@PathVariable String code) {

		return countryService.getCountry(code);
	}
}