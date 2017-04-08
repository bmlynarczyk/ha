package com.introsoft.gateway.api;

import lombok.Data;

import java.util.Date;

@Data
public class SendDomesticTransferCommand {

    private Long amount;
    private String title;
    private Date accountingDate;

    private String payeeAccount;

    private String beneficiaryName;
    private String beneficiaryAccount;

}
