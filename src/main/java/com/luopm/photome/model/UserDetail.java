package com.luopm.photome.model;

public class UserDetail {
    private Integer photomeUserdetailId;

    private String photomeUserdetailUsername;

    private String photomeUserdetailUsercovercode;

    private String photomeUserdetailUserintroduction;

    private String photomeUserdetailUsermusicurl;

    public Integer getPhotomeUserdetailId() {
        return photomeUserdetailId;
    }

    public void setPhotomeUserdetailId(Integer photomeUserdetailId) {
        this.photomeUserdetailId = photomeUserdetailId;
    }

    public String getPhotomeUserdetailUsername() {
        return photomeUserdetailUsername;
    }

    public void setPhotomeUserdetailUsername(String photomeUserdetailUsername) {
        this.photomeUserdetailUsername = photomeUserdetailUsername == null ? null : photomeUserdetailUsername.trim();
    }

    public String getPhotomeUserdetailUsercovercode() {
        return photomeUserdetailUsercovercode;
    }

    public void setPhotomeUserdetailUsercovercode(String photomeUserdetailUsercovercode) {
        this.photomeUserdetailUsercovercode = photomeUserdetailUsercovercode == null ? null : photomeUserdetailUsercovercode.trim();
    }

    public String getPhotomeUserdetailUserintroduction() {
        return photomeUserdetailUserintroduction;
    }

    public void setPhotomeUserdetailUserintroduction(String photomeUserdetailUserintroduction) {
        this.photomeUserdetailUserintroduction = photomeUserdetailUserintroduction == null ? null : photomeUserdetailUserintroduction.trim();
    }

    public String getPhotomeUserdetailUsermusicurl() {
        return photomeUserdetailUsermusicurl;
    }

    public void setPhotomeUserdetailUsermusicurl(String photomeUserdetailUsermusicurl) {
        this.photomeUserdetailUsermusicurl = photomeUserdetailUsermusicurl == null ? null : photomeUserdetailUsermusicurl.trim();
    }
}