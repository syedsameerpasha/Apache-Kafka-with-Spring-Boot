package com.deliveryBoy.deliveryBoy.controller;

import com.deliveryBoy.deliveryBoy.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class LocationController {
    @Autowired
    private KafkaService kafkaService;

    @PostMapping("/update")
    public ResponseEntity<?> updateLocation(){
        double lat = Math.random() * 100;
        double lon = Math.random() * 100;

        String location = String.format("(%.2f, %.2f)", lat, lon);
        kafkaService.updateLocation(location);
        return new ResponseEntity<>(Map.of("message","Location Updated"), HttpStatus.OK);

    }
}
