package com.luopm.photome.model;

public class UserMusicWithBLOBs extends UserMusic {
    private String photomeUsermusicMusiclrc;

    private String photomeUsermusicMusicuser;

    public String getPhotomeUsermusicMusiclrc() {
        return photomeUsermusicMusiclrc;
    }

    public void setPhotomeUsermusicMusiclrc(String photomeUsermusicMusiclrc) {
        this.photomeUsermusicMusiclrc = photomeUsermusicMusiclrc == null ? null : photomeUsermusicMusiclrc.trim();
    }

    public String getPhotomeUsermusicMusicuser() {
        return photomeUsermusicMusicuser;
    }

    public void setPhotomeUsermusicMusicuser(String photomeUsermusicMusicuser) {
        this.photomeUsermusicMusicuser = photomeUsermusicMusicuser == null ? null : photomeUsermusicMusicuser.trim();
    }
}