package fr.acensi.basket.controllers;

import fr.acensi.basket.resources.BasketResource;
import fr.acensi.basket.service.BasketService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BasketController {

    private final BasketService basketService;

    @GetMapping("/baskets/{basketId}")
    public BasketResource getBasketById(@PathVariable Long basketId){

        return basketService.retrieveBasketById(basketId);

    }

}
