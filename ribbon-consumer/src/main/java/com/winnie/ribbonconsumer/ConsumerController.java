package com.winnie.ribbonconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author : winnie
 * @date : 2019/3/15
 * @desc
 */
@RestController
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping(value = "/ribbon-consumer")
    public String helloController() {
        return restTemplate.getForEntity("http://TEST-SERVICE/demo/hello", String.class).getBody();
    }
}
