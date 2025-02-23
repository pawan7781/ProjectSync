package com.projectsync.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectsync.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {
	PasswordResetToken findByToken(String token);
}
