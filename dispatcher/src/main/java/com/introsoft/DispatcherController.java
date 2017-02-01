package com.introsoft;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class DispatcherController {

    @RequestMapping(method = RequestMethod.POST, value = "/dispatch")
    public void dispatch(@RequestParam String value){
        log.info(value);
    }

}
