package com.ProjetM1.CERIInspireShop.service;

import com.ProjetM1.CERIInspireShop.model.CartItem;

public interface CartItemService {
    void addCartItemToCart(int quantity,Long cartId,Long productId);
    CartItem getCartItemById(Long cartItemId);
    void deleteCartItemById(Long cartItemId);
}
