package com.finx.demounleash.service.notification;

import io.getunleash.UnleashContext;
import org.unleash.features.annotation.Toggle;

public interface NotificationService {
    @Toggle(name = "notificationServiceFlag", alterBean = "emailNotificationService")
    String sendMessage(UnleashContext unleashContext, String message);
}
