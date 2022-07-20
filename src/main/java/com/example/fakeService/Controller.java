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

        return ResponseEntity.ok("깃 허브 웹 훅 연결 성공");
    }

    @GetMapping ("/no-hook-deploy")
    public ResponseEntity<String> noHookDeploy() throws IOException {

        System.out.println("no-hook-deploy API 시작");

        Process process = Runtime.getRuntime().exec("/home/ubuntu/deploy.sh");

        System.out.println("쉘 스크립트 배포 실패");

        return ResponseEntity.ok("노 훅 배포");
    }

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("FUCK YOU");
    }
}
