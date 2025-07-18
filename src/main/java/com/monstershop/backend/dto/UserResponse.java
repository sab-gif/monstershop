package com.monstershop.backend.dto;

import com.monstershop.backend.model.Review;
import com.monstershop.backend.model.User;

import java.util.List;

public record UserResponse (
        String username,
        String email,
        List<String> reviewsBodies
){
}
