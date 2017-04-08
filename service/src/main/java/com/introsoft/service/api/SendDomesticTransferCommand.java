package com.introsoft.service.api;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class SendDomesticTransferCommand {

    private Long amount;
    private String title;
    private Date accountingDate;

    private String payeeAccount;

    private String beneficiaryName;
    private String beneficiaryAccount;

}
