package com.jadendong.vultr.domain.dto;

import lombok.Builder;
import lombok.Data;

/**
 * @author jaden
 */
@Data
@Builder
public class Summary {

    /**
     * 余额
     */
    private Double balance;

    /**
     * 最近付款时间
     */
    private String lastPaymentDate;

    /**
     * 最后付款金额
     */
    private Double lastPaymentAmount;
}
