package com.finx.demounleash.api;

import com.finx.demounleash.service.notification.NotificationService;
import io.getunleash.UnleashContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class NotificationController {
    @Autowired
    @Qualifier("smsNotificationService")
    NotificationService notificationService;

    @PostMapping("/sendNoti")
    String sendNoti(@RequestBody Map<String, String> payload) {
        UnleashContext context = UnleashContext.builder().userId(payload.get("userId")).build();
        return notificationService.sendMessage(context, payload.get("message"));
    }
}
