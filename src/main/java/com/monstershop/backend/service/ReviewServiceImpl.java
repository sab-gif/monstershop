package com.monstershop.backend.service;

import com.monstershop.backend.exception.ResourceNotFoundException;
import com.monstershop.backend.model.Review;
import com.monstershop.backend.model.Product;
import com.monstershop.backend.repository.ReviewRepository;
import com.monstershop.backend.repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {
    private final ReviewRepository reviewRepository;
    private final ProductRepository productRepository;

    public ReviewServiceImpl(ReviewRepository reviewRepository, ProductRepository productRepository) {
        this.reviewRepository = reviewRepository;
        this.productRepository = productRepository;
    }

    @Override
    public List<Review> getReviewsByProductId(Long productId) {
        return reviewRepository.findByProductId(productId);
    }

    @Override
    public Review createReview(Long productId, Review review) {
        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found"));
        review.setProduct(product);
        Review savedReview = reviewRepository.save(review);

        return savedReview;
    }

    @Override
    public Review saveReview(Review review) {
        return reviewRepository.save(review);
    }
}

