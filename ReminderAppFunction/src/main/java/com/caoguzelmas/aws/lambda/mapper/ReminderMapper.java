package com.caoguzelmas.aws.lambda.mapper;

import com.caoguzelmas.aws.lambda.dto.ReminderDto;
import com.caoguzelmas.aws.lambda.model.Reminder;

import java.util.List;
import java.util.stream.Collectors;

public class ReminderMapper {

    public ReminderDto map(Reminder from) {
        return ReminderDto.builder()
                .reminderId(from.getReminderId())
                .email(from.getEmail())
                .header(from.getHeader())
                .message(from.getMessage())
                .timeToLive(from.getTimeToLive())
                .build();
    }

    public List<ReminderDto> map(List<Reminder> fromList) {
        return fromList.stream()
                .map(this::map).collect(Collectors.toList());
    }
}
