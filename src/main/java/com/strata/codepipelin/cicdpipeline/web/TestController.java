package com.strata.codepipelin.cicdpipeline.web;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path="/test")
public class TestController {
    
    @GetMapping
    public ResponseEntity<Map<String, String>> test() {
        return ResponseEntity.ok().body(Map.of("testing", "up and running"));
    }

    @GetMapping("/isactive")
    public ResponseEntity<Map<String, String>> isActived() {
        return ResponseEntity.ok().body(Map.of("active", "true"));
    }
}
