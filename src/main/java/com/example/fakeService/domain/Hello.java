package com.example.fakeService.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Hello {

    @Id
    @GeneratedValue
    private Long id;

    private String comment;

    public Hello(String comment) {
        this.comment = comment;
    }

    public String SayHello() {
        return "HaHa~ " + comment;
    }
}
