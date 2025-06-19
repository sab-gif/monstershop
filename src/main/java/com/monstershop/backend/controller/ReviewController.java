package com.monstershop.backend.controller;

import com.monstershop.backend.model.Review;
import com.monstershop.backend.service.ReviewService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {
    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping("/{productId}")
    public List<Review> getReviewsByProductId(@PathVariable Long productId) {
        return reviewService.getReviewsByProductId(productId);
    }

    @PostMapping
    public Review createReview(@RequestParam Long productId, @RequestBody Review review) {
        return reviewService.createReview(productId, review);
    }

}
