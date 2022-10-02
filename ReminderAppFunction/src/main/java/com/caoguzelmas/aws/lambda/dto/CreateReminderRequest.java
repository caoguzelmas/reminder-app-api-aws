package com.caoguzelmas.aws.lambda.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CreateReminderRequest {
    private String reminderId;
    private String email;
    private String header;
    private String message;
    private Long timeToLive;
}
