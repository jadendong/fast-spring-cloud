package com.jadendong.vultr.config;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @author jaden
 */
@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ActionTrackInterceptor implements ClientHttpRequestInterceptor {

    private final VultrConfig config;

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
            throws IOException {
        HttpHeaders headers = request.getHeaders();
        headers.add("API-Key", config.getApiKey());

        return execution.execute(request, body);
    }
}
