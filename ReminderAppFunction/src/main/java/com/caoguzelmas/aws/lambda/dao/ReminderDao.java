package com.caoguzelmas.aws.lambda.dao;

import com.caoguzelmas.aws.lambda.model.Reminder;

public interface ReminderDao {
    Reminder save(Reminder reminder);
}
