package com.winnie.ribbonconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : winnie
 * @date : 2019/3/15
 * @desc
 */
@RestController
public class ConsumerController {
    @Autowired
    ConsumerService service;

    @GetMapping(value = "/ribbon-consumer")
    public String helloController() {
        return service.hello();
    }
}
