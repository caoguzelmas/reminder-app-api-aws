package com.caoguzelmas.aws.lambda.dao.impl;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBQueryExpression;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.spec.PutItemSpec;
import com.caoguzelmas.aws.lambda.dao.ReminderDao;
import com.caoguzelmas.aws.lambda.model.Reminder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReminderDaoImpl implements ReminderDao {
    private String TABLE_NAME = "reminders";
    private static final Logger logger = LoggerFactory.getLogger(ReminderDaoImpl.class);
    AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
            .withRegion(Regions.US_EAST_1)
            .build();

    @Override
    public Reminder save(Reminder reminder) {
        logger.info("ReminderDaoImpl : with body {}", reminder.toString());
        DynamoDBMapper dynamoDBMapper = new DynamoDBMapper(client);
        dynamoDBMapper.save(reminder);

        return null;
    }

    private Reminder getReminderById(String reminderId) {
        DynamoDBMapper dynamoDBMapper = new DynamoDBMapper(client);
        Reminder reminder = Reminder.builder()
                .reminderId(reminderId)
                .build();
        DynamoDBQueryExpression<Reminder> queryExpression = new DynamoDBQueryExpression<Reminder>()
                .withHashKeyValues(reminder);
      //  Reminder reminder1 = dynamoDBMapper..query(Reminder.class, queryExpression);
        return null;
    }
}
