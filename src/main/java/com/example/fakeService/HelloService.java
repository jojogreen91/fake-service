package com.example.fakeService;


import com.example.fakeService.domain.Hello;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String sayHello(String comment) {
        return new Hello(comment).SayHello();
    }
}
