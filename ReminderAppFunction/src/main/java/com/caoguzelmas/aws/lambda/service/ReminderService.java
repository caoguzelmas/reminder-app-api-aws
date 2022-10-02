package com.caoguzelmas.aws.lambda.service;

import com.caoguzelmas.aws.lambda.dto.CreateReminderRequest;
import com.caoguzelmas.aws.lambda.dto.ReminderDto;

public interface ReminderService {

    ReminderDto createReminder(final CreateReminderRequest request);
    ReminderDto getReminder(String reminderId);
    ReminderDto updateReminder();
}
