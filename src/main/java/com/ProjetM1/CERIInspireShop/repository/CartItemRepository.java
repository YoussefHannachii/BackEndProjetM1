package com.ProjetM1.CERIInspireShop.repository;

import com.ProjetM1.CERIInspireShop.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem,Long> {

}
