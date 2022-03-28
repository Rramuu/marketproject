package fr.acensi.basket.resources;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BasketResource {

    private Long id;
    private double total;
    private List<BasketItemResource> items;
}
