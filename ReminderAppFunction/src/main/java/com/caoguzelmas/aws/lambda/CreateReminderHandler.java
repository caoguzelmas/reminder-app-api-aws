package com.caoguzelmas.aws.lambda;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import com.caoguzelmas.aws.lambda.dto.CreateReminderRequest;
import com.caoguzelmas.aws.lambda.dto.ReminderDto;
import com.caoguzelmas.aws.lambda.service.ReminderService;
import com.google.inject.Inject;

import java.util.HashMap;
import java.util.Map;

public class CreateReminderHandler implements RequestHandler<CreateReminderRequest, APIGatewayProxyResponseEvent> {
    @Inject
    private ReminderService reminderService;
    public APIGatewayProxyResponseEvent handleRequest(final CreateReminderRequest request, final Context context) {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        LambdaLogger logger = context.getLogger();

        APIGatewayProxyResponseEvent response = new APIGatewayProxyResponseEvent()
                .withHeaders(headers);

        try {
            ReminderDto reminderDto = reminderService.createReminder(request);
            response.withStatusCode(200);
            response.withBody(reminderDto.toString());
        } catch (AmazonServiceException e) {
            logger.log("AwsServiceException " + e.getStatusCode() + " " + e.getMessage());
            response.withStatusCode(e.getStatusCode());
            response.withBody(e.getMessage());
        } catch (Exception e) {
            logger.log("Exception " + e.getMessage());
            response.withStatusCode(500);
            response.withBody(e.getMessage());
        }

        return response;
    }
}
