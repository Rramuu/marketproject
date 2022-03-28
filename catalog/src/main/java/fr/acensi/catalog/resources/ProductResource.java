package fr.acensi.catalog.resources;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductResource {
    private String id;
    private String name;
    private String description;
    private String image;
    private double price;
}
