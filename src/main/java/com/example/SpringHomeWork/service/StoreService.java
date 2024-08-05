package com.example.SpringHomeWork.service;

import com.example.SpringHomeWork.model.Cart;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class StoreService {
    private final Cart cart;

    public StoreService(Cart cart) {
        this.cart = cart;
    }

    public void add(Set<Long> items) {
        cart.add(items);
    }

    public Set<Long> getAll() {
       return cart.getAll();
    }
}
