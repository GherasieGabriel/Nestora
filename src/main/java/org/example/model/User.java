package org.example.model;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table (name = "users")
public class User extends Person{
    @Column(name = "registered_at", nullable = false, updatable = false)
    private Instant registeredAt;

    @PrePersist
    void onCreate() {
        registeredAt = Instant.now();
    }

    public Instant getRegisteredAt() {
        return registeredAt;
    }

    public void setRegisteredAt(Instant registeredAt) {
        this.registeredAt = registeredAt;
}
}