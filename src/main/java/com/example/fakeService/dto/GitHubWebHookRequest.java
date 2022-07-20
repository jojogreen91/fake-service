package com.example.fakeService.dto;

public class GitHubWebHookRequest {

    private String hook_id;

    public GitHubWebHookRequest() {
    }

    public GitHubWebHookRequest(final String hook_id) {
        this.hook_id = hook_id;
    }

    public String getHook_id() {
        return hook_id;
    }
}
