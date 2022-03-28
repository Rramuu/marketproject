package fr.acensi.basket.service;

import fr.acensi.basket.resources.ProductResource;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "catalog")
public interface ProductFeign {

    @GetMapping("/products/{productId}")
    public ProductResource getProductById(@PathVariable Long productId);

}
