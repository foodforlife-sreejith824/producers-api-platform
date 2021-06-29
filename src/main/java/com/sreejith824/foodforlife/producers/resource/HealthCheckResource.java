package com.sreejith824.foodforlife.producers.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (value = "/")
public class HealthCheckResource {

    @GetMapping("healthcheck")
    public String healthCheck() {
        return  "Healthy - 0.0.3-snapshot";
    }
}
