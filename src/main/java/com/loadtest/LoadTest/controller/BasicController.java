package com.loadtest.LoadTest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping("")
    ResponseEntity<?> getApplications() {
        (new LoadThread()).start();
        (new LoadThread()).start();
        (new LoadThread()).start();
        (new LoadThread()).start();
        (new LoadThread()).start();
        (new LoadThread()).start();
        (new LoadThread()).start();
        (new LoadThread()).start();
        (new LoadThread()).start();
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
