package com.jadendong.vultr;

import com.jadendong.vultr.domain.dto.Summary;
import com.jadendong.vultr.service.SummaryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jaden
 */
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TestController {
    private final SummaryService summaryService;

    @GetMapping("/get")
    public Summary config() {
        return summaryService.get();
    }
}
