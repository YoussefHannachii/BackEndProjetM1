package com.ProjetM1.CERIInspireShop.controller;

import com.ProjetM1.CERIInspireShop.dto.CartItemRequest;
import com.ProjetM1.CERIInspireShop.dto.ProductWithImageDto;
import com.ProjetM1.CERIInspireShop.service.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/privateApi/cartItem")
public class CartItemController {

    @Autowired
    CartItemService cartItemService;

    @PostMapping("/addToCart")
    public ResponseEntity<?> addCartItemToCart(@RequestBody CartItemRequest cartItemRequest) {
        cartItemService.addCartItemToCart(cartItemRequest.getQuantity(),
                cartItemRequest.getCartId(),cartItemRequest.getProductId());
        return ResponseEntity.ok("Cart Item added successfully");
    }

}
