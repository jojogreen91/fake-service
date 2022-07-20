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
    public ResponseEntity<Void> deploy(@RequestBody GitHubWebHookRequest gitHubWebHookRequest) {
        if (!gitHubWebHookRequest.getHook_id().equals("369605028")) {
            throw new IllegalStateException();
        }
        return ResponseEntity.ok().build();
    }

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("FUCK YOU");
    }
}
