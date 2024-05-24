package com.ProjetM1.CERIInspireShop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
    @RequestMapping(value = { "/", "/login", "/signin", "/accueil", "/profile", "/panier", "/home", "/product/**" })
    public String index() {
        return "forward:/index.html";
    }
}

