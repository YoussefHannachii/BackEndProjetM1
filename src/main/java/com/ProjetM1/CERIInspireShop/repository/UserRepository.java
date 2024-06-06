package com.ProjetM1.CERIInspireShop.repository;

import com.ProjetM1.CERIInspireShop.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findUserByEmail(String email);
    User findUserByUsername(String username);

}
