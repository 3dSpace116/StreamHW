package com.example.SpringHomeWork.controller;

import com.example.SpringHomeWork.service.StoreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/store/order")
public class StoreController {
    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/add")
    public void add(@RequestParam("item") Set<Long> item) {
        storeService.add(item);
    }

    @GetMapping("/get")
    public Set<Long> get() {
        return storeService.getAll();
    }

}
