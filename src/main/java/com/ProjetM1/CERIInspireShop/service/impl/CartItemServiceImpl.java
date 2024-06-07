package com.ProjetM1.CERIInspireShop.service.impl;

import com.ProjetM1.CERIInspireShop.model.Cart;
import com.ProjetM1.CERIInspireShop.model.CartItem;
import com.ProjetM1.CERIInspireShop.model.Product;
import com.ProjetM1.CERIInspireShop.repository.CartItemRepository;
import com.ProjetM1.CERIInspireShop.service.CartItemService;
import com.ProjetM1.CERIInspireShop.service.CartService;
import com.ProjetM1.CERIInspireShop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartItemServiceImpl implements CartItemService {

    @Autowired
    CartItemRepository cartItemRepository;

    CartService cartService;

    @Autowired
    ProductService productService;

    @Override
    public void addCartItemToCart(int quantity,Long cartId, Long productId) {
        CartItem cartItem = new CartItem(quantity,
                productService.getProductById(productId),
                cartService.findCartById(cartId)) ;
        cartItemRepository.save(cartItem);
    }

    @Override
    public CartItem getCartItemById(Long cartItemId) {
        return cartItemRepository.findById(cartItemId).orElseThrow(()-> new RuntimeException("CartItem not found"));
    }

    @Override
    public void deleteCartItemById(Long cartItemId) {
        CartItem cartItem = getCartItemById(cartItemId);
        cartItemRepository.deleteById(cartItemId);
    }
}
