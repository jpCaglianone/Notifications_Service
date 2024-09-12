package com.example.notificationsservice.entity;


import lombok.Getter;

import java.util.Objects;
import java.util.UUID;

@Getter
public class User {

    private final UUID userId;
    private final String name;
    private final String email;
    private final String telephone;

    public User(UUID userId, String name, String email, String telephone) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.telephone = telephone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User User = (User) o;
        return userId.equals(User.userId)
                && name.equals(User.name)
                && email.equals(User.email)
                && telephone.equals(User.telephone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, name, email, telephone);
    }
}
