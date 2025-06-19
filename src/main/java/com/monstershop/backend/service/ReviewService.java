package com.monstershop.backend.service;

import com.monstershop.backend.model.Review;
import java.util.List;

public interface ReviewService {
    List<Review> getReviewsByProductId(Long productId);
    Review createReview(Long productId, Review review);
    Review saveReview(Review review);
}
