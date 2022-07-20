package com.example.fakeService;

import com.example.fakeService.dto.GitHubWebHookRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @PostMapping("/deploy")
    public ResponseEntity<String> deploy(@RequestBody GitHubWebHookRequest gitHubWebHookRequest) {
        System.out.println("gitHubWebHookRequest - REF = " + gitHubWebHookRequest.getRef());
        System.out.println("deploy API 시작");

        try {
            Runtime.getRuntime().exec("/home/ubuntu/deploy.sh");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("deploy API 종료");
        return ResponseEntity.ok("deploy API 종료");
    }

    @GetMapping ("/noHookDeploy")
    public ResponseEntity<String> noHookDeploy() {
        System.out.println("noHookDeploy API 시작");

        try {
            Runtime.getRuntime().exec("/home/ubuntu/deploy.sh");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("쉘 스크립트 실행 종료");
        return ResponseEntity.ok("noHookDeploy API 종료");
    }

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("FUCK YOU");
    }

    @GetMapping("/check")
    public ResponseEntity<String> check() {
        return ResponseEntity.ok("NEW VERSION IS ARRIVED!!!");
    }
}
