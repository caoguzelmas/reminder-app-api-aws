package com.caoguzelmas.aws.lambda.service.impl;

import com.caoguzelmas.aws.lambda.dao.ReminderDao;
import com.caoguzelmas.aws.lambda.dto.CreateReminderRequest;
import com.caoguzelmas.aws.lambda.dto.ReminderDto;
import com.caoguzelmas.aws.lambda.service.ReminderService;

public class ReminderServiceImpl implements ReminderService {
    private final ReminderDao reminderDao;

    public ReminderServiceImpl(ReminderDao reminderDao) {
        this.reminderDao = reminderDao;
    }


    @Override
    public ReminderDto createReminder(CreateReminderRequest request) {
        return null;
    }

    @Override
    public ReminderDto getReminder(String reminderId) {
        return null;
    }

    @Override
    public ReminderDto updateReminder() {
        return null;
    }
}
