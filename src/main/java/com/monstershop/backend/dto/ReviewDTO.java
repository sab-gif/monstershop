package com.monstershop.backend.dto;

import org.hibernate.property.access.spi.Getter;

public class ReviewDTO {
    private Long id;
    private String username;
    private double rating;
    private String body;

    // Getter and Setter for id
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    // Getter and Setter for username
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter and Setter for rating
    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }

    // Getter and Setter for body
    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }
}
