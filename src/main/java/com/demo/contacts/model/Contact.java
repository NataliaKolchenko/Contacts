package com.demo.contacts.model;

import jdk.jshell.Snippet;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

//@Builder
//@Data
@Getter
@Setter
public class Contact {
    private UUID id;
    private String name;
    private String email;

    public Contact(UUID id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
