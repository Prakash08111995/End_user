package com.enduser.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {

    @KafkaListener(topics = AppConstants.location_Topic_Name,groupId =AppConstants.Group_Id )
    public void updateLocation(String value)
    {
        System.out.println(value);
    }
}
