package com.sreejith824.foodforlife.producers.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (value = "/")
public class HealthCheckResource {

    @GetMapping("healthcheck")
    public String healthCheck() {
        return  "Health check testing for Food for life - 0.1.2-snapshot";
    }
}
