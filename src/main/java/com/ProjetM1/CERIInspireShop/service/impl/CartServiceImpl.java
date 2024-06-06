package com.ProjetM1.CERIInspireShop.service.impl;

import com.ProjetM1.CERIInspireShop.dto.CartItemDto;
import com.ProjetM1.CERIInspireShop.model.Cart;
import com.ProjetM1.CERIInspireShop.model.CartItem;
import com.ProjetM1.CERIInspireShop.repository.CartRepository;
import com.ProjetM1.CERIInspireShop.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartRepository cartRepository;

    @Override
    public List<CartItemDto> getAllCartItems(Long cartId) {
        Cart cart = findCartById(cartId);
        List<CartItem> cartItems = cart.getCartItems();
        return cartItems.stream()
                .map(this::mapCartItemToCartItemDto)
                .collect(Collectors.toList());
    }

    public Cart findCartById(Long cartId){
        return cartRepository.findById(cartId)
                .orElseThrow(() -> new RuntimeException("Cart not found"));
    }

    public CartItemDto mapCartItemToCartItemDto(CartItem cartItem){
        return new CartItemDto(cartItem);
    }
}
