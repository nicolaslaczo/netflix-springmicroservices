package com.homepage.Homepage_Service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/home")
public class HomePageController {

    @GetMapping
    public ResponseEntity<String> get() {
        return ResponseEntity.ok().body("VSETKO JE OK");
    }
}
