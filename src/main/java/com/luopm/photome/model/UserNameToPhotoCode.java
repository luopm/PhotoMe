package com.luopm.photome.model;

public class UserNameToPhotoCode {
    private Integer id;

    private String username;

    private String photocode;

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

    public String getPhotocode() {
        return photocode;
    }

    public void setPhotocode(String photocode) {
        this.photocode = photocode == null ? null : photocode.trim();
    }
}