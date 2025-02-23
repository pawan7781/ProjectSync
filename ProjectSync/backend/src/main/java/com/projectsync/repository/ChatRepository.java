package com.projectsync.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectsync.model.Chat;
import com.projectsync.model.Project;

public interface ChatRepository extends JpaRepository<Chat, Long> {
    

	Chat findByProject(Project projectById);
	
//	List<Chat> findByProjectNameContainingIgnoreCase(String projectName);
}

