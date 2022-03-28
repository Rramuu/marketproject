package fr.acensi.basket.repositories;

import fr.acensi.basket.entities.BasketEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasketRepository extends JpaRepository<BasketEntity, Long> {
}
