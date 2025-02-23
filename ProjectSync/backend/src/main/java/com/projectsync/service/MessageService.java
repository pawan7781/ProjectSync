package com.projectsync.service;

import java.util.List;

import com.projectsync.exception.ChatException;
import com.projectsync.exception.ProjectException;
import com.projectsync.exception.UserException;
import com.projectsync.model.Message;

public interface MessageService {

    Message sendMessage(Long senderId, Long chatId, String content) throws UserException, ChatException, ProjectException;

    List<Message> getMessagesByProjectId(Long projectId) throws ProjectException, ChatException;
}

