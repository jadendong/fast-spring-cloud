package com.jadendong.vultr.config;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

/**
 * @author jaden
 */
@Configuration
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ClientConfig {

    private final ActionTrackInterceptor actionTrackInterceptor;

    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();

        // 把自定义的ClientHttpRequestInterceptor添加到RestTemplate，可添加多个
        restTemplate.setInterceptors(Collections.singletonList(actionTrackInterceptor));
        return restTemplate;
    }
}
