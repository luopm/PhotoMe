package com.luopm.photome.model;

import java.util.Date;

public class UserPhoto {
    private Integer photomeUserphotoId;

    private String photomeUserphotoPhotocode;

    private String photomeUserphotoPhotoname;

    private String photomeUserphotoPhotourl;

    private String photomeUserphotoPhotoiscover;

    private String photomeUserphotoPhotointroduction;

    private Date photomeUserphotoPhotocreatdate;

    private Date photomeUserphotoPhotomodifydate;

    public Integer getPhotomeUserphotoId() {
        return photomeUserphotoId;
    }

    public void setPhotomeUserphotoId(Integer photomeUserphotoId) {
        this.photomeUserphotoId = photomeUserphotoId;
    }

    public String getPhotomeUserphotoPhotocode() {
        return photomeUserphotoPhotocode;
    }

    public void setPhotomeUserphotoPhotocode(String photomeUserphotoPhotocode) {
        this.photomeUserphotoPhotocode = photomeUserphotoPhotocode == null ? null : photomeUserphotoPhotocode.trim();
    }

    public String getPhotomeUserphotoPhotoname() {
        return photomeUserphotoPhotoname;
    }

    public void setPhotomeUserphotoPhotoname(String photomeUserphotoPhotoname) {
        this.photomeUserphotoPhotoname = photomeUserphotoPhotoname == null ? null : photomeUserphotoPhotoname.trim();
    }

    public String getPhotomeUserphotoPhotourl() {
        return photomeUserphotoPhotourl;
    }

    public void setPhotomeUserphotoPhotourl(String photomeUserphotoPhotourl) {
        this.photomeUserphotoPhotourl = photomeUserphotoPhotourl == null ? null : photomeUserphotoPhotourl.trim();
    }

    public String getPhotomeUserphotoPhotoiscover() {
        return photomeUserphotoPhotoiscover;
    }

    public void setPhotomeUserphotoPhotoiscover(String photomeUserphotoPhotoiscover) {
        this.photomeUserphotoPhotoiscover = photomeUserphotoPhotoiscover == null ? null : photomeUserphotoPhotoiscover.trim();
    }

    public String getPhotomeUserphotoPhotointroduction() {
        return photomeUserphotoPhotointroduction;
    }

    public void setPhotomeUserphotoPhotointroduction(String photomeUserphotoPhotointroduction) {
        this.photomeUserphotoPhotointroduction = photomeUserphotoPhotointroduction == null ? null : photomeUserphotoPhotointroduction.trim();
    }

    public Date getPhotomeUserphotoPhotocreatdate() {
        return photomeUserphotoPhotocreatdate;
    }

    public void setPhotomeUserphotoPhotocreatdate(Date photomeUserphotoPhotocreatdate) {
        this.photomeUserphotoPhotocreatdate = photomeUserphotoPhotocreatdate;
    }

    public Date getPhotomeUserphotoPhotomodifydate() {
        return photomeUserphotoPhotomodifydate;
    }

    public void setPhotomeUserphotoPhotomodifydate(Date photomeUserphotoPhotomodifydate) {
        this.photomeUserphotoPhotomodifydate = photomeUserphotoPhotomodifydate;
    }
}