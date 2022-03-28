package fr.acensi.catalog.services;

import fr.acensi.catalog.entities.ProductEntity;
import fr.acensi.catalog.repositories.ProductRepository;
import fr.acensi.catalog.resources.ProductResource;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public Page<ProductResource> retrieveAllProducts(Pageable pageable) {
        Page<ProductEntity> productEntityPage = productRepository.findAll(pageable);
        return productEntityPage.map(this::mapToResource);
    }

    private ProductResource mapToResource(ProductEntity productEntity) {
        return new ProductResource(productEntity.getId().toString(), productEntity.getName(),
                null, productEntity.getImage(), productEntity.getPrice());
    }

    public ProductResource retrieveProductById(Long productId) {
        ProductEntity productEntity = productRepository.findById(productId).orElseThrow(RuntimeException::new);
        return this.mapToResource(productEntity);
    }
}
