package net.elenX;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloElenX {

    @RequestMapping("/")
    public String hello() {
        return "Hello World!";

    }
}
