package fr.acensi.catalog.entities;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long productId;
    
    @ManyToOne(
    		cascade = CascadeType.ALL
    		)
    @JoinColumn(name="manufacturer_id")
    private Long manufacturerId;
    
    private String name;
    private String description;
    private String image;
    private double price;

}
