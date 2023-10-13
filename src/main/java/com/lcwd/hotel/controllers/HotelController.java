package com.lcwd.hotel.controllers;

import com.lcwd.hotel.entity.Hotel;
import com.lcwd.hotel.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    @Autowired
    private HotelService hotelService;

    //create
    @PostMapping
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
    return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.create(hotel));
//        Hotel createHotel = hotelService.create(hotel);
//        return new ResponseEntity<>(createHotel,HttpStatus.CREATED);
    }



    //get single
    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> getHotelById(@PathVariable("hotelId") String hotelId){
//        return ResponseEntity.ok(hotelService.get(hotelId));
        return ResponseEntity.status(HttpStatus.OK).body(hotelService.get(hotelId));
    }

    // get all
    @GetMapping
    public ResponseEntity<List<Hotel>> getAllHotel(){
        return ResponseEntity.ok(hotelService.getAll());
    }
}
