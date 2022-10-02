package com.caoguzelmas.aws.lambda.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
//@Builder
public class CreateReminderRequest {
    private String reminderId;
    private String email;
    private String header;
    private String message;
    private LocalDateTime timeToLive;
}
