package com.loadtest.LoadTest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping("")
    ResponseEntity<?> getApplications() {
        for (int i = 0; i < Integer.MAX_VALUE/2; i++) {
            assert true;
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
