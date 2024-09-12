package com.example.notificationsservice.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Table("notifications")
public class Notifications {

    @Id
    private UUID id;
    private String message;
    private User user;
    private LocalDateTime sendDate;
    private Orders order;
    private String content;

    public Notifications(UUID id,
                         String message,
                         LocalDateTime sendDate,
                         Orders order,
                         User user) {
        this.id = id;
        this.message = message;
        this.user = user;
        this.sendDate = sendDate;
        this.order = order;
    }


}
