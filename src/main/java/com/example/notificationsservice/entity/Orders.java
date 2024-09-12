package com.example.notificationsservice.entity;

import lombok.Getter;

import java.util.Objects;
import java.util.UUID;

@Getter
public class Orders {

    private final UUID orderId;
    private final String description;
    private final String status;


    public Orders(UUID orderId, String description, String status) {
        this.orderId = orderId;
        this.description = description;
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orders orders = (Orders) o;
        return orderId.equals(orders.orderId) && description.equals(orders.description) && status.equals(orders.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, description, status);
    }
}
