package com.luopm.photome.model;

import java.util.Date;

public class User {
    private Integer photomeUserId;

    private String photomeUserUsername;

    private String photomeUserUserpassword;

    private String photomeUserUserphone;

    private String photomeUserUsermail;

    private String photomeUserUserismaster;

    private String photomeUserUserisvip;

    private Date photomeUserUsercreatdate;

    public Integer getPhotomeUserId() {
        return photomeUserId;
    }

    public void setPhotomeUserId(Integer photomeUserId) {
        this.photomeUserId = photomeUserId;
    }

    public String getPhotomeUserUsername() {
        return photomeUserUsername;
    }

    public void setPhotomeUserUsername(String photomeUserUsername) {
        this.photomeUserUsername = photomeUserUsername == null ? null : photomeUserUsername.trim();
    }

    public String getPhotomeUserUserpassword() {
        return photomeUserUserpassword;
    }

    public void setPhotomeUserUserpassword(String photomeUserUserpassword) {
        this.photomeUserUserpassword = photomeUserUserpassword == null ? null : photomeUserUserpassword.trim();
    }

    public String getPhotomeUserUserphone() {
        return photomeUserUserphone;
    }

    public void setPhotomeUserUserphone(String photomeUserUserphone) {
        this.photomeUserUserphone = photomeUserUserphone == null ? null : photomeUserUserphone.trim();
    }

    public String getPhotomeUserUsermail() {
        return photomeUserUsermail;
    }

    public void setPhotomeUserUsermail(String photomeUserUsermail) {
        this.photomeUserUsermail = photomeUserUsermail == null ? null : photomeUserUsermail.trim();
    }

    public String getPhotomeUserUserismaster() {
        return photomeUserUserismaster;
    }

    public void setPhotomeUserUserismaster(String photomeUserUserismaster) {
        this.photomeUserUserismaster = photomeUserUserismaster == null ? null : photomeUserUserismaster.trim();
    }

    public String getPhotomeUserUserisvip() {
        return photomeUserUserisvip;
    }

    public void setPhotomeUserUserisvip(String photomeUserUserisvip) {
        this.photomeUserUserisvip = photomeUserUserisvip == null ? null : photomeUserUserisvip.trim();
    }

    public Date getPhotomeUserUsercreatdate() {
        return photomeUserUsercreatdate;
    }

    public void setPhotomeUserUsercreatdate(Date photomeUserUsercreatdate) {
        this.photomeUserUsercreatdate = photomeUserUsercreatdate;
    }
}