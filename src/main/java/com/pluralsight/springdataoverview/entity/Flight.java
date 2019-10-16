package com.pluralsight.springdataoverview.entity;

import java.time.LocalDateTime;

public class Flight {
    private String id;
    private String origin;
    private String destination;
    private LocalDateTime scheduledAt;

    public String  getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDateTime getScheduledAt() {
        return scheduledAt;
    }

    public void setScheduledAt(LocalDateTime scheduledAt) {
        this.scheduledAt = scheduledAt;
    }

    @Override
    public String toString() {
        return "Flight{" +
            "id=" + id +
            ", origin='" + origin + '\'' +
            ", destination='" + destination + '\'' +
            ", scheduledAt=" + scheduledAt +
            '}';
    }
}
