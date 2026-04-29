package com.morpal.service;

import java.util.List;

import com.morpal.Exception.ReviewException;
import com.morpal.model.Review;
import com.morpal.model.User;
import com.morpal.request.ReviewRequest;

public interface ReviewSerive {
	
    public Review submitReview(ReviewRequest review,User user);
    public void deleteReview(Long reviewId) throws ReviewException;
    public double calculateAverageRating(List<Review> reviews);
}
