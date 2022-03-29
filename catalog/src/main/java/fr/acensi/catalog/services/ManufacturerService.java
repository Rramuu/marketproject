package fr.acensi.catalog.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import fr.acensi.catalog.entities.ManufacturerEntity;
import fr.acensi.catalog.repositories.ManufacturerRepository;
import fr.acensi.catalog.resources.ManufacturerResource;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ManufacturerService {
	
	private final ManufacturerRepository manufacturerRepository;
	
	public Page<ManufacturerResource> retrieveAllManufacturers(Pageable pageable) {
		Page<ManufacturerEntity> manufacturerEntityPage = manufacturerRepository.findAll(pageable);
		return manufacturerEntityPage.map(this::mapToResource);
	}
	
	private ManufacturerResource mapToResource(ManufacturerEntity manufacturerEntity) {
		return new ManufacturerResource(manufacturerEntity.getManufacturerId(), manufacturerEntity.getName());
	}

	
	public ManufacturerResource retrieveManufacturerById(Long ManufacturerId) {
		ManufacturerEntity manufacturerEntity = manufacturerRepository.findById(ManufacturerId).orElseThrow(RuntimeException::new);
		return this.mapToResource(manufacturerEntity);
	}
}
