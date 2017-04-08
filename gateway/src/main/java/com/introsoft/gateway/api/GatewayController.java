package com.introsoft.gateway.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
public class GatewayController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(method = RequestMethod.POST, value = "/send")
    public void send(@RequestBody SendDomesticTransferCommand transferCommand) {
        restTemplate.postForObject("http://service/send", transferCommand, Void.class);
    }

}