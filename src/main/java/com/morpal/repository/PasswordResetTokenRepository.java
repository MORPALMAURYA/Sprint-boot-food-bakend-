package com.morpal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.morpal.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {
	PasswordResetToken findByToken(String token);
}
