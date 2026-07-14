package com.microservices.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class LoadBalancerController {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/invoke")
    public String invokeService() {
        return restTemplate.getForObject("http://account-service/accounts/123", String.class);
    }
}
