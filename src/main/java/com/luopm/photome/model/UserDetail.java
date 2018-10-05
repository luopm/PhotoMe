package com.luopm.photome.model;

public class UserDetail {
    private Integer photomeUserdetailId;

    private String photomeUserdetailUsername;

    private String photomeUserdetailUserintroduction;

    private String photomeUserdetailUsercovername;

    private String photomeUserdetailUsercovercode;

    private String photomeUserdetailUsermusicname;

    private String photomeUserdetailUsermusiccode;

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

    public String getPhotomeUserdetailUserintroduction() {
        return photomeUserdetailUserintroduction;
    }

    public void setPhotomeUserdetailUserintroduction(String photomeUserdetailUserintroduction) {
        this.photomeUserdetailUserintroduction = photomeUserdetailUserintroduction == null ? null : photomeUserdetailUserintroduction.trim();
    }

    public String getPhotomeUserdetailUsercovername() {
        return photomeUserdetailUsercovername;
    }

    public void setPhotomeUserdetailUsercovername(String photomeUserdetailUsercovername) {
        this.photomeUserdetailUsercovername = photomeUserdetailUsercovername == null ? null : photomeUserdetailUsercovername.trim();
    }

    public String getPhotomeUserdetailUsercovercode() {
        return photomeUserdetailUsercovercode;
    }

    public void setPhotomeUserdetailUsercovercode(String photomeUserdetailUsercovercode) {
        this.photomeUserdetailUsercovercode = photomeUserdetailUsercovercode == null ? null : photomeUserdetailUsercovercode.trim();
    }

    public String getPhotomeUserdetailUsermusicname() {
        return photomeUserdetailUsermusicname;
    }

    public void setPhotomeUserdetailUsermusicname(String photomeUserdetailUsermusicname) {
        this.photomeUserdetailUsermusicname = photomeUserdetailUsermusicname == null ? null : photomeUserdetailUsermusicname.trim();
    }

    public String getPhotomeUserdetailUsermusiccode() {
        return photomeUserdetailUsermusiccode;
    }

    public void setPhotomeUserdetailUsermusiccode(String photomeUserdetailUsermusiccode) {
        this.photomeUserdetailUsermusiccode = photomeUserdetailUsermusiccode == null ? null : photomeUserdetailUsermusiccode.trim();
    }
}