package com.caoguzelmas.aws.lambda.service.impl;

import com.caoguzelmas.aws.lambda.dao.impl.ReminderDaoImpl;
import com.caoguzelmas.aws.lambda.dto.CreateReminderRequest;
import com.caoguzelmas.aws.lambda.dto.ReminderDto;
import com.caoguzelmas.aws.lambda.mapper.ReminderMapper;
import com.caoguzelmas.aws.lambda.model.Reminder;
import com.caoguzelmas.aws.lambda.service.ReminderService;
import com.google.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.ZoneId;

public class ReminderServiceImpl implements ReminderService {
    @Inject
    private ReminderDaoImpl reminderDaoImpl;
    @Inject
    private ReminderMapper reminderMapper;

    private static final Logger logger = LoggerFactory.getLogger(ReminderServiceImpl.class);

    @Override
    public ReminderDto createReminder(CreateReminderRequest request) {
        logger.info("ReminderServiceImpl : {}", request.toString());
        Reminder reminder = Reminder.builder()
                .email(request.getEmail())
                .header(request.getHeader())
                .message(request.getMessage())
                .timeToLive(request.getTimeToLive().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() / 1000)
                .build();
        return reminderMapper.map(reminderDaoImpl.save(reminder));
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
