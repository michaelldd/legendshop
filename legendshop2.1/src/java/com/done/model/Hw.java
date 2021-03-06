package com.done.model;

import java.util.Date;

/**
 * Hw generated by MyEclipse Persistence Tools
 */

public class Hw implements java.io.Serializable {

    // Fields

    private Integer hwId;

    private Integer sortId;

    private Integer nsortId;

    private Integer subNsortId;

    private String hwName;

    private Long hwPrice;

    private Long hwCash;

    private String hwBrief;

    private String hwContent;

    private Integer hwViews;

    private Integer hwBuys;

    private Date hwDate;

    private String hwPic;

    private String commend;

    private Integer status;

    private Date modifyDate;

    private String userId;

    private String userName;

    // Constructors

    /** default constructor */
    public Hw() {
    }

    /** minimal constructor */
    public Hw(Integer hwId) {
        this.hwId = hwId;
    }

    /** full constructor */
    public Hw(Integer hwId, Integer sortId, Integer nsortId, String hwName, Long hwPrice, Long hwCash, String hwBrief,
            String hwContent, Integer hwViews, Integer hwBuys, Date hwDate, String hwPic, String commend,
            Integer status, Date modifyDate, String userId, String userName) {
        this.hwId = hwId;
        this.sortId = sortId;
        this.nsortId = nsortId;
        this.hwName = hwName;
        this.hwPrice = hwPrice;
        this.hwCash = hwCash;
        this.hwBrief = hwBrief;
        this.hwContent = hwContent;
        this.hwViews = hwViews;
        this.hwBuys = hwBuys;
        this.hwDate = hwDate;
        this.hwPic = hwPic;
        this.commend = commend;
        this.status = status;
        this.modifyDate = modifyDate;
        this.userId = userId;
        this.userName = userName;
    }

    // Property accessors

    public Integer getHwId() {
        return this.hwId;
    }

    public void setHwId(Integer hwId) {
        this.hwId = hwId;
    }

    public Integer getSortId() {
        return this.sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }

    public Integer getNsortId() {
        return this.nsortId;
    }

    public void setNsortId(Integer nsortId) {
        this.nsortId = nsortId;
    }

    public String getHwName() {
        return this.hwName;
    }

    public void setHwName(String hwName) {
        this.hwName = hwName;
    }

    public Long getHwPrice() {
        return this.hwPrice;
    }

    public void setHwPrice(Long hwPrice) {
        this.hwPrice = hwPrice;
    }

    public Long getHwCash() {
        return this.hwCash;
    }

    public void setHwCash(Long hwCash) {
        this.hwCash = hwCash;
    }

    public String getHwBrief() {
        return this.hwBrief;
    }

    public void setHwBrief(String hwBrief) {
        this.hwBrief = hwBrief;
    }

    public String getHwContent() {
        return this.hwContent;
    }

    public void setHwContent(String hwContent) {
        this.hwContent = hwContent;
    }

    public Integer getHwViews() {
        return this.hwViews;
    }

    public void setHwViews(Integer hwViews) {
        this.hwViews = hwViews;
    }

    public Integer getHwBuys() {
        return this.hwBuys;
    }

    public void setHwBuys(Integer hwBuys) {
        this.hwBuys = hwBuys;
    }

    public Date getHwDate() {
        return this.hwDate;
    }

    public void setHwDate(Date hwDate) {
        this.hwDate = hwDate;
    }

    public String getHwPic() {
        return this.hwPic;
    }

    public void setHwPic(String hwPic) {
        this.hwPic = hwPic;
    }

    public String getCommend() {
        return this.commend;
    }

    public void setCommend(String commend) {
        this.commend = commend;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getModifyDate() {
        return this.modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getSubNsortId() {
        return subNsortId;
    }

    public void setSubNsortId(Integer subNsortId) {
        this.subNsortId = subNsortId;
    }

}