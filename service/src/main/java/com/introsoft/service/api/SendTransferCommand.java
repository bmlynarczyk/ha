package com.introsoft.service.api;

import de.malkusch.validation.constraints.banking.IBAN;
import lombok.Data;
import lombok.ToString;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@ToString
public class SendTransferCommand {

    @NotEmpty
    @Min(value = 1)
    private String amount;

    @NotEmpty
    private String title;

    @NotNull
    private Date accountingDate;

    @IBAN
    private String payeeAccount;

    private String beneficiaryName;

    @IBAN
    private String beneficiaryAccount;

}
