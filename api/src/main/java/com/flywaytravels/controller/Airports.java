package com.flywaytravels.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flywaytravels.service.AmadeusAuthService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/airports")
public class Airports{
    private final AmadeusAuthService AmadeusAuthService;
    @GetMapping     
    public String getAirports(){
        AmadeusAuthService.getAmadeusToken();
        return "Hello World";
    }
}
