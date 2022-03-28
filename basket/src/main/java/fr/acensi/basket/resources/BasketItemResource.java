package fr.acensi.basket.resources;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BasketItemResource {
    private Long id;
    private String name;
    private String image;
    private int quantity;
    private double price;
}
