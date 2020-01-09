package com.aaa.mbm.springcloud.model;

import java.io.Serializable;

public class User implements Serializable {
    private Long id;

    private String username;

    private Long userage;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Long getUserage() {
        return userage;
    }

    public void setUserage(Long userage) {
        this.userage = userage;
    }
}