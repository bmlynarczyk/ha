package com.introsoft;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
public class GatewayController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(method = RequestMethod.POST, value = "/send")
    public void send(@RequestParam(name = "value") String value) {
        LinkedMultiValueMap<String, String> map = new LinkedMultiValueMap<>();
        map.add("value", value);
        restTemplate.postForObject("http://dispatcher/dispatch", map, Void.class);
    }

}