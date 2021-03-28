package com.rgtm.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class Greet {

    private String msg= "Hello, %s%s";
    private AtomicLong id= new AtomicLong();





    @GetMapping("/greet")
    Greeting greet(@RequestParam(name="nm",defaultValue = "World!") String nm, @RequestParam(name="s",required = false) Character s){
//        oll=s;
        return new Greeting(id.incrementAndGet(),String.format(msg,nm,s),s);
    }
	
	
}
