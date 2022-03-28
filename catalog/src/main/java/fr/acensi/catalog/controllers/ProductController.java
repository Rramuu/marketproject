package fr.acensi.catalog.controllers;

import fr.acensi.catalog.entities.ProductEntity;
import fr.acensi.catalog.resources.ProductResource;
import fr.acensi.catalog.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/products")
    public Page<ProductResource> getAllProducts(Pageable pageable) {
        return productService.retrieveAllProducts(pageable);
    }

    @GetMapping("/products/{productId}")
    public ProductResource getProductById(@PathVariable Long productId) {
        return productService.retrieveProductById(productId);
    }

    @PostMapping("/products")
    public ProductEntity postProduct(@RequestBody ProductEntity productEntity) {
        return null;
    }

    @PatchMapping("/products/{productId}")
    public ProductEntity patchProductById(@PathVariable Long productId, @RequestBody ProductEntity productEntity) {
        return null;
    }

    @DeleteMapping("/products/{productId}")
    public Void deleteProductById(@PathVariable Long productId) {
        return null;
    }


}
