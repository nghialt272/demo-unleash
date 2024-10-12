package com.finx.demounleash.service.notification.impl;

import com.finx.demounleash.service.notification.NotificationService;
import io.getunleash.UnleashContext;
import org.springframework.stereotype.Service;

@Service("emailNotificationService")
public class EmailNotificationService implements NotificationService {
    @Override
    public String sendMessage(UnleashContext unleashContext, String message) {
        return "Sent email to " + unleashContext.getUserId();
    }
}
