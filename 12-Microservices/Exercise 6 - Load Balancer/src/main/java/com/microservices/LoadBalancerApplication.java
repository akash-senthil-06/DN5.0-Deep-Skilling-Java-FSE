package com.microservices;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class LoadBalancerApplication {
    public static void main(String[] args) {
        SpringApplication.run(LoadBalancerApplication.class, args);
        System.out.println("Load Balancer App Started on Port 8084!");
    }
}
