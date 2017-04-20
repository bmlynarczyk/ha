package com.introsoft.service.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@RestController
public class TransferController {

    @RequestMapping(method = RequestMethod.POST, value = "/send")
    public void send(@RequestBody @Valid SendTransferCommand transferCommand){
        log.info("sending transfer {}", transferCommand);
    }

}
