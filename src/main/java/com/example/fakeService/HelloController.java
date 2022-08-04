package com.example.fakeService;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloController {

    private final HelloService helloService;

    @GetMapping(value = {"/hello", "/hello/{comment}"})
    public ResponseEntity<String> hello(@PathVariable(required = false) String comment) {
        return ResponseEntity.ok(helloService.sayHello(comment));
    }
}
