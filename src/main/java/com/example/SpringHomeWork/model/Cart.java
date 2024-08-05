package com.example.SpringHomeWork.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Component
@SessionScope
public class Cart {
    private final Set<Long> items = new HashSet<>();

    public void add(Set<Long> items) {
        this.items.addAll(items);
    }

    public Set<Long> getAll() {
        return Collections.unmodifiableSet(items);
    }
}
