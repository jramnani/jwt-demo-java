package com.example.jwtdemo.security;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountCredentials {

    @JsonProperty
    private String username;

    @JsonProperty
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
