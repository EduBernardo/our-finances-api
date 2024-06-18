package com.ourfinances.ourfinancesapi.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/health")
public class HealthController {

@GetMapping("/")
public String getMethodStatus() {
    return "Is UP on..." ;
}

}
