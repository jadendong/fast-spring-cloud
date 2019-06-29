package com.jadendong.vultr.service;

import com.jadendong.vultr.config.Constant;
import com.jadendong.vultr.domain.dto.Summary;
import com.jadendong.vultr.domain.entity.account.Info;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author jaden
 */
@Slf4j
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class SummaryService {

    private final RestTemplate restTemplate;

    public Summary get() {
        Info info = restTemplate.getForObject(Constant.ACCOUNT_INFO_URL, Info.class);
        log.info("info: " + info);

        assert info != null;
        return Summary.builder()
                .balance(-Double.parseDouble(info.getBalance()) - Double.parseDouble(info.getPending_charges()))
                .lastPaymentAmount(-Double.parseDouble(info.getLast_payment_amount()))
                .lastPaymentDate(info.getLast_payment_date())
                .build();
    }
}
