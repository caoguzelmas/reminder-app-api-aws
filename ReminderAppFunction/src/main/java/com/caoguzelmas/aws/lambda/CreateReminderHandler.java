package com.caoguzelmas.aws.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import com.caoguzelmas.aws.lambda.dto.CreateReminderRequest;
import com.caoguzelmas.aws.lambda.dto.ReminderDto;
import com.caoguzelmas.aws.lambda.service.ReminderService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CreateReminderHandler implements RequestHandler<CreateReminderRequest, APIGatewayProxyResponseEvent> {
    private final ReminderService reminderService;
    public CreateReminderHandler(ReminderService reminderService) {
        this.reminderService = reminderService;
    }
    public APIGatewayProxyResponseEvent handleRequest(final CreateReminderRequest request, final Context context) {
        return null;
    }
}
