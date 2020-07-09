package com.stackextend.websocketbackendexample.controller;

import com.stackextend.websocketbackendexample.model.Notifications;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;


@Component
public class AutoScheduledTasks {

    @Autowired
    private SimpMessagingTemplate template;

    private Notifications notifications = new Notifications(0, 0, 0);

    @Scheduled(fixedRate = 1000)
    public void start() {
        notifications.random();

        this.template.convertAndSend("/topic/notification", notifications);
    }
}
