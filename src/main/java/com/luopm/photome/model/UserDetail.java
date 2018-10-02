package com.luopm.photome.model;

public class UserDetail {
    private Integer photomeUserdetailId;

    private String photomeUserdetailUsername;

    private String photomeUserdetailUsercover;

    private String photomeUserdetailUserintroduction;

    private String photomeUserdetailUsercomment;

    private String photomeUserdetailUsermusic;

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

    public String getPhotomeUserdetailUsercover() {
        return photomeUserdetailUsercover;
    }

    public void setPhotomeUserdetailUsercover(String photomeUserdetailUsercover) {
        this.photomeUserdetailUsercover = photomeUserdetailUsercover == null ? null : photomeUserdetailUsercover.trim();
    }

    public String getPhotomeUserdetailUserintroduction() {
        return photomeUserdetailUserintroduction;
    }

    public void setPhotomeUserdetailUserintroduction(String photomeUserdetailUserintroduction) {
        this.photomeUserdetailUserintroduction = photomeUserdetailUserintroduction == null ? null : photomeUserdetailUserintroduction.trim();
    }

    public String getPhotomeUserdetailUsercomment() {
        return photomeUserdetailUsercomment;
    }

    public void setPhotomeUserdetailUsercomment(String photomeUserdetailUsercomment) {
        this.photomeUserdetailUsercomment = photomeUserdetailUsercomment == null ? null : photomeUserdetailUsercomment.trim();
    }

    public String getPhotomeUserdetailUsermusic() {
        return photomeUserdetailUsermusic;
    }

    public void setPhotomeUserdetailUsermusic(String photomeUserdetailUsermusic) {
        this.photomeUserdetailUsermusic = photomeUserdetailUsermusic == null ? null : photomeUserdetailUsermusic.trim();
    }
}