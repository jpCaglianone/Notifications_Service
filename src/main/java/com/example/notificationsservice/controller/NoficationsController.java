package com.example.notificationsservice.controller;

import com.example.notificationsservice.entity.Notifications;
import com.example.notificationsservice.entity.Orders;
import com.example.notificationsservice.entity.User;
import com.example.notificationsservice.service.NotificationsService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
    @RequestMapping("/notifications")
public class NoficationsController {

    private final NotificationsService notificationsService;
    public NoficationsController(NotificationsService notificationsService) {
        this.notificationsService = notificationsService;
    }

    @GetMapping("/all")
    public Flux<Notifications> getNotifications() {
        return notificationsService.getAllNotifications();
    }

    @PostMapping("/listNotificationsByUser")
    public Mono<Notifications> getNotificationsByUser(@RequestBody User user) {
        return notificationsService.getNotificationsByUser(user);
    }

    @PostMapping("/listNotificationsByOrder")
    public Mono<Notifications> getNotificationsByORder(@RequestBody Orders order) {
        return notificationsService.getNotificationsByOrder(order);
    }

    @PostMapping("/createNotification")
    public Mono<Notifications> createNotification(@RequestBody Notifications notification) {
        return notificationsService.createNotification(notification);
    }


}
