package com.ProjetM1.CERIInspireShop.controller;

import com.ProjetM1.CERIInspireShop.dto.CartItemDto;
import com.ProjetM1.CERIInspireShop.dto.ParentCategoryDto;
import com.ProjetM1.CERIInspireShop.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/privateApi/cart")
public class CartController {

    @Autowired
    CartService cartService;

    @GetMapping("/allCartItems/{cartId}")
    public ResponseEntity<List<CartItemDto>> getCartItems(@PathVariable Long cartId) {
        List<CartItemDto> cartItems = cartService.getAllCartItems(cartId);
        return ResponseEntity.ok(cartItems);
    }
}
