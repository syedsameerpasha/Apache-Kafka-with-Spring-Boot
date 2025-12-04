package com.endUser.endUser.config;

import com.endUser.endUser.constants.AppConstants;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class ConsumerConfig {
    @KafkaListener(topics = AppConstants.LOCATION_UPDATE_TOPIC, groupId= AppConstants.GROUP_ID)
    public void updatedLocation(String message){
        System.out.println("message");

        //do as per your reuqirments


    }

}
