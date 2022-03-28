package fr.acensi.basket.service;

import fr.acensi.basket.entities.BasketEntity;
import fr.acensi.basket.entities.BasketItemEntity;
import fr.acensi.basket.repositories.BasketRepository;
import fr.acensi.basket.resources.BasketItemResource;
import fr.acensi.basket.resources.BasketResource;
import fr.acensi.basket.resources.ProductResource;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BasketService {

    private final BasketRepository basketRepository;
    private final ProductFeign productFeign;

    public BasketResource retrieveBasketById(Long basketId) {

        BasketEntity basketEntity = basketRepository.findById(basketId).orElseThrow(RuntimeException::new);

        List<BasketItemResource> basketItemResources = new ArrayList<>();

        for (BasketItemEntity basketItemEntity : basketEntity.getBasketItems()
        ) {

            ProductResource productResource = productFeign.getProductById(basketItemEntity.getProductId());
            basketItemResources.add(new BasketItemResource(basketItemEntity.getId(), productResource.getName(),
                    productResource.getImage(),
                    basketItemEntity.getQuantity(), basketItemEntity.getQuantity() * productResource.getPrice()));


        }

        return new BasketResource(basketEntity.getId(), basketItemResources.stream().mapToDouble(
                BasketItemResource::getPrice).sum(), basketItemResources);
    }
}
