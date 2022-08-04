package com.example.fakeService;


import com.example.fakeService.domain.Hello;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class HelloService {

    private final HelloRepository helloRepository;

    @Transactional
    public String sayHello(String comment) {
        if (comment == null) {
            return "Where is your comment?";
        }
        Hello hello = new Hello(comment);
        helloRepository.save(hello);
        return hello.SayHello();
    }
}
