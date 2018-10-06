package com.luopm.photome.model;

public class UserNameToMusicCode {
    private Integer id;

    private String username;

    private String musiccode;

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
        this.username = username == null ? null : username.trim();
    }

    public String getMusiccode() {
        return musiccode;
    }

    public void setMusiccode(String musiccode) {
        this.musiccode = musiccode == null ? null : musiccode.trim();
    }
}