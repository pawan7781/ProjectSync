package com.projectsync.service;

import com.projectsync.domain.PlanType;
import com.projectsync.model.Subscription;
import com.projectsync.model.User;

public interface SubscriptionService {
    Subscription createSubscription(User user);
    Subscription getUserSubscription(Long userId) throws Exception;
    Subscription upgradeSubscription(Long userId, PlanType planType);

    boolean isValid(Subscription subscription);
}
