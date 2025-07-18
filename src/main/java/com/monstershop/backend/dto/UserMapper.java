package com.monstershop.backend.dto;

import com.monstershop.backend.model.Review;
import com.monstershop.backend.model.User;

import java.util.List;

public class UserMapper {
    public  static User dtoToEntity (UserRequest dto) {
        return new User(dto.username(),dto.email(),dto.password());
    }

    public static UserResponse entityToDto (User user){
        List<String> reviewBodies = user.getReviews() != null
                ? user.getReviews().stream().map(Review::getBody).toList()
                : List.of();
        return new UserResponse(
                user.getUsername(),
                user.getEmail(),
                reviewBodies);
    }
}
