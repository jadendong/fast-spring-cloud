package com.jadendong.vultr.domain.entity.account;

import lombok.Data;

/**
 * 帐号-信息
 *
 * @author jaden
 */
@Data
public class Info {

    private String balance;

    private String pending_charges;

    private String last_payment_date;

    private String last_payment_amount;
}
