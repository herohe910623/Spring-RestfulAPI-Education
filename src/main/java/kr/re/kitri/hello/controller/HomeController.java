package kr.re.kitri.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/hello")//endpoint에 해당된다. http://localhost:8080/hello
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/hello/hello2/hi/good")
    public String hello2() {
        return "안녕하세요";
    }
}
