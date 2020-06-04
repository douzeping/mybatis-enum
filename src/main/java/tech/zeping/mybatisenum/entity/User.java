package tech.zeping.mybatisenum.entity;

import tech.zeping.mybatisenum.enums.UserState;

public class User {
    private Integer id;

    private String username;

    private UserState state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UserState getState() {
        return state;
    }

    public void setState(UserState state) {
        this.state = state;
    }
}