package com.luopm.photome.model;

import java.util.Date;

public class UserComment {
    private Integer photomeUsercommentId;

    private String photomeUsercommentCommentcode;

    private String photomeUsercommentCommenteduser;

    private String photomeUsercommentCommentuser;

    private Date photomeUsercommentCommentdate;

    private String photomeUsercommentCommentcontent;

    public Integer getPhotomeUsercommentId() {
        return photomeUsercommentId;
    }

    public void setPhotomeUsercommentId(Integer photomeUsercommentId) {
        this.photomeUsercommentId = photomeUsercommentId;
    }

    public String getPhotomeUsercommentCommentcode() {
        return photomeUsercommentCommentcode;
    }

    public void setPhotomeUsercommentCommentcode(String photomeUsercommentCommentcode) {
        this.photomeUsercommentCommentcode = photomeUsercommentCommentcode == null ? null : photomeUsercommentCommentcode.trim();
    }

    public String getPhotomeUsercommentCommenteduser() {
        return photomeUsercommentCommenteduser;
    }

    public void setPhotomeUsercommentCommenteduser(String photomeUsercommentCommenteduser) {
        this.photomeUsercommentCommenteduser = photomeUsercommentCommenteduser == null ? null : photomeUsercommentCommenteduser.trim();
    }

    public String getPhotomeUsercommentCommentuser() {
        return photomeUsercommentCommentuser;
    }

    public void setPhotomeUsercommentCommentuser(String photomeUsercommentCommentuser) {
        this.photomeUsercommentCommentuser = photomeUsercommentCommentuser == null ? null : photomeUsercommentCommentuser.trim();
    }

    public Date getPhotomeUsercommentCommentdate() {
        return photomeUsercommentCommentdate;
    }

    public void setPhotomeUsercommentCommentdate(Date photomeUsercommentCommentdate) {
        this.photomeUsercommentCommentdate = photomeUsercommentCommentdate;
    }

    public String getPhotomeUsercommentCommentcontent() {
        return photomeUsercommentCommentcontent;
    }

    public void setPhotomeUsercommentCommentcontent(String photomeUsercommentCommentcontent) {
        this.photomeUsercommentCommentcontent = photomeUsercommentCommentcontent == null ? null : photomeUsercommentCommentcontent.trim();
    }
}