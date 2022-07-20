package com.example.fakeService;

import com.example.fakeService.dto.GitHubWebHookRequest;
import java.io.IOException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @PostMapping("/deploy")
    public ResponseEntity<String> deploy(@RequestBody GitHubWebHookRequest gitHubWebHookRequest) throws IOException {

        Process process = Runtime.getRuntime().exec("/home/ubuntu/deploy.sh");

        return ResponseEntity.ok("배포 스크립트 실행 성공");
    }

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("FUCK YOU");
    }
}
