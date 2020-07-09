package com.stackextend.websocketbackendexample;

import com.stackextend.websocketbackendexample.controller.NotificationController;
import com.stackextend.websocketbackendexample.model.Notifications;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class WebsocketBackendExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebsocketBackendExampleApplication.class, args);


    }
}
