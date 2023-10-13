package com.lcwd.hotel;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RequestMapping("/staffs")
@RestController
public class StaffController {

    @GetMapping
    public ResponseEntity<List<String>> getStaffs(){
        List<String> List= Arrays.asList("Ram","shyam","Sita","krishna");
        return new ResponseEntity<>(List, HttpStatus.OK);
    }
}
