package com.example.fakeService.dto;

public class GitHubWebHookRequest {

    private String ref;

    public GitHubWebHookRequest() {
    }

    public GitHubWebHookRequest(final String ref) {
        this.ref = ref;
    }

    public String getRef() {
        return ref;
    }
}
