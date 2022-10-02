package com.caoguzelmas.aws.lambda.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class User {

    private String userId;
    private String email;
    private String phoneNumber;
    private String firstName;
    private String middleName;
    private String lastName;
    private Boolean isActive;
}
