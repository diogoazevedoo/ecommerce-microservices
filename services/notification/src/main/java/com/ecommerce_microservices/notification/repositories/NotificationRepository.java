package com.ecommerce_microservices.notification.repositories;

import com.ecommerce_microservices.notification.entities.Notification;
import com.ecommerce_microservices.notification.entities.PaymentMethod;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NotificationRepository extends MongoRepository<Notification, String> {}
