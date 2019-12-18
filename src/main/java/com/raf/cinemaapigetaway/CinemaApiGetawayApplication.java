package com.raf.cinemaapigetaway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class CinemaApiGetawayApplication {

    public static void main(String[] args) {
        SpringApplication.run(CinemaApiGetawayApplication.class, args);
    }

}
