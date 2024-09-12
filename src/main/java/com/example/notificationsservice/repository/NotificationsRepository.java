package com.example.notificationsservice.repository;

import com.example.notificationsservice.entity.Notifications;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Repository
public interface NotificationsRepository extends R2dbcRepository<Notifications, UUID> {

    @Query("DELETE FROM notifications WHERE recipient = :userId AND send_date < NOW() - INTERVAL '1 MONTH'")
    Mono<Void> deleteOldNotificationsByUserId(UUID userId);

}
