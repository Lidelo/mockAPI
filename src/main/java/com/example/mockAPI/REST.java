package com.example.mockAPI;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class REST {

    @PostMapping("/1")
    public ResponseEntity<?> one() {
        return new ResponseEntity<>("1", HttpStatus.OK);
    }

    @PostMapping("/2")
    public ResponseEntity<?> two() throws InterruptedException {
        Thread.sleep(1000);
        return new ResponseEntity<>("2", HttpStatus.OK);
    }

    @PostMapping("/3")
    public ResponseEntity<?> three(@RequestBody @NonNull Long howManyMilliseconds) throws InterruptedException {
        Thread.sleep(howManyMilliseconds);
        return new ResponseEntity<>("3", HttpStatus.OK);
    }
}
