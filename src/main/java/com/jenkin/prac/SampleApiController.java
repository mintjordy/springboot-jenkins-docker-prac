package com.jenkin.prac;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleApiController {
    @GetMapping("/sample")
    public String sample() {
        return "sample";
    }
}
