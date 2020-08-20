package com.jojoldu.bookspringboot.web;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello") //http 메소드인 Get 요청을 받을 수 있는 API임  // @RequestMapping(method = RequestMethod.GET) 과 동일
    public String hello() {
        return "hello";
    }
}
