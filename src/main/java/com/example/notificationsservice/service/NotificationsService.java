package com.example.notificationsservice.service;

import com.example.notificationsservice.entity.Notifications;
import com.example.notificationsservice.entity.Orders;
import com.example.notificationsservice.entity.User;
import com.example.notificationsservice.repository.NotificationsRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import java.util.UUID;

@Service
public class NotificationsService {

    private final NotificationsRepository notificationsRepository;

    public NotificationsService(NotificationsRepository notificationsRepository) {
        this.notificationsRepository = notificationsRepository;
    }

    public Mono<Notifications> createNotification (Notifications notification){
        return notificationsRepository.save(notification);
    }

    public Flux<Notifications> getAllNotifications(){
        return notificationsRepository.findAll();
    }

    public Mono<Void> cleanAllBeforeNotifications(UUID userId) {
        return notificationsRepository.deleteOldNotificationsByUserId(userId);
    }

    public Mono<Notifications> getNotificationsByUser (User user){
        return notificationsRepository.findById(user.getUserId());
    }

    public Mono<Notifications> getNotificationsByOrder (Orders order){
        return notificationsRepository.findById(order.getOrderId());
    }


}
