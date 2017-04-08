package com.introsoft.service.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class TransferController {

    @RequestMapping(method = RequestMethod.POST, value = "/send")
    public void send(@RequestBody SendDomesticTransferCommand transferCommand){
        log.info("sending transfer {}", transferCommand);
    }

}
