package fr.acensi.catalog.controllers;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import fr.acensi.catalog.resources.ManufacturerResource;
import fr.acensi.catalog.services.ManufacturerService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ManufacturerController {
	
	private final ManufacturerService manufacturerService;
	
	@GetMapping("/manufacturers")
	public Page<ManufacturerResource> getAllManufacturers(Pageable pageable){
		return manufacturerService.retrieveAllManufacturers(pageable);
	}
	
	@GetMapping("/manufacturer{manufacturerId}")
	public ManufacturerResource getManufacturerById(Long manufacturerId) {
		return manufacturerService.retrieveManufacturerById(manufacturerId);
	}

}
