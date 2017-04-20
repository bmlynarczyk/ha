package com.introsoft.service.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TransferControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void send_transfer_should_fail_on_null_in_amount() {
        //given
        SendTransferCommand request = new SendTransferCommand();
        //when
        ResponseEntity<String> responseEntity = restTemplate.postForEntity("/send", request, String.class);
        //then
        assertEquals(HttpStatus.BAD_REQUEST, responseEntity.getStatusCode());
    }

    @Test
    public void send_transfer_should_fail_on_invalid_iban_in_beneficiary_account() {
        //given
        SendTransferCommand request = new SendTransferCommand();
        request.setAmount("100");
        request.setTitle("title");
        request.setAccountingDate(new Date());
        request.setBeneficiaryAccount("PL1911609588468926048300390");
        request.setPayeeAccount("PL19116095884689260483003902");
        //when
        ResponseEntity<String> responseEntity = restTemplate.postForEntity("/send", request, String.class);
        //then
        assertEquals(HttpStatus.BAD_REQUEST, responseEntity.getStatusCode());
    }

}