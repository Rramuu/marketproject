package fr.acensi.catalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.acensi.catalog.entities.ManufacturerEntity;

@Repository
public interface ManufacturerRepository extends JpaRepository<ManufacturerEntity, Long>{
}
