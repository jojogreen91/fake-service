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
        System.out.println("gitHubWebHookRequest - HOOK_ID = " + gitHubWebHookRequest.getHook_id());

        return ResponseEntity.ok("deploy API 종료");
    }

//    @GetMapping ("/no-hook-deploy")
//    public ResponseEntity<String> noHookDeploy() {
//
//        System.out.println("no-hook-deploy API 시작");
//
//        try {
//            ProcessBuilder processBuilder = new ProcessBuilder();
//            processBuilder.command("/home/ubuntu/deploy.sh");
//            processBuilder.start();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("쉘 스크립트 실행 종료");
//
//        return ResponseEntity.ok("no-hook-deploy API 종료");
//    }

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("FUCK YOU");
    }
}
