package com.ProjetM1.CERIInspireShop.dto;

import com.ProjetM1.CERIInspireShop.model.CartItem;
import com.ProjetM1.CERIInspireShop.model.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CartItemDto {
    private Long cartItemId;
    private int cartQuantity;
    private Long productId;
    private String name;
    private String description;
    private double price;

    public CartItemDto(CartItem cartItem){
        Product product = cartItem.getProduct();
        cartItemId=cartItem.getId();
        cartQuantity=cartItem.getQuantity();
        this.productId = product.getProductId();
        this.name = product.getName();
        this.description = product.getDescription();
        this.price = product.getPrice()*cartQuantity;
    }
}
