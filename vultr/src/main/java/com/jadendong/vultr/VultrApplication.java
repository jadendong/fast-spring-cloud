package com.jadendong.vultr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author jaden
 */
@SpringBootApplication
public class VultrApplication {

    public static void main(String[] args) {
        SpringApplication.run(VultrApplication.class, args);
    }
}
