package com.morpal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.morpal.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}
