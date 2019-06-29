package com.jadendong.vultr.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author jaden
 */

@Data
@Component
public class VultrConfig {

    @Value("${vultr.api-key}")
    private String apiKey;
}
