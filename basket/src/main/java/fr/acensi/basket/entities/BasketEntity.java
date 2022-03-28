package fr.acensi.basket.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class BasketEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    private List<BasketItemEntity> basketItems;
}
