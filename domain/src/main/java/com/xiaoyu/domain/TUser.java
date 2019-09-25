package com.xiaoyu.domain;

import java.io.Serializable;
import java.util.Date;

/*
* 用户表
* */
public class TUser implements Serializable {
    private static final long serialVersionUID = 6587923157559786381L;
    private Long id;

    private String userid;

    private String username;

    private String userpassword;

    private Integer usergender;

    private Integer userage;

    private String useraddress;

    private Integer userpower;

    private String createbyid;

    private String createbyname;

    private Date createtime;

    private String updatebyid;

    private String updatebyname;

    private Date updatetime;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public Integer getUsergender() {
        return usergender;
    }

    public void setUsergender(Integer usergender) {
        this.usergender = usergender;
    }

    public Integer getUserage() {
        return userage;
    }

    public void setUserage(Integer userage) {
        this.userage = userage;
    }

    public String getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress;
    }

    public Integer getUserpower() {
        return userpower;
    }

    public void setUserpower(Integer userpower) {
        this.userpower = userpower;
    }

    public String getCreatebyid() {
        return createbyid;
    }

    public void setCreatebyid(String createbyid) {
        this.createbyid = createbyid;
    }

    public String getCreatebyname() {
        return createbyname;
    }

    public void setCreatebyname(String createbyname) {
        this.createbyname = createbyname;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getUpdatebyid() {
        return updatebyid;
    }

    public void setUpdatebyid(String updatebyid) {
        this.updatebyid = updatebyid;
    }

    public String getUpdatebyname() {
        return updatebyname;
    }

    public void setUpdatebyname(String updatebyname) {
        this.updatebyname = updatebyname;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    @Override
    public String toString() {
        return "TUser{" +
                "id=" + id +
                ", userid='" + userid + '\'' +
                ", username='" + username + '\'' +
                ", userpassword='" + userpassword + '\'' +
                ", usergender=" + usergender +
                ", userage=" + userage +
                ", useraddress='" + useraddress + '\'' +
                ", userpower=" + userpower +
                ", createbyid='" + createbyid + '\'' +
                ", createbyname='" + createbyname + '\'' +
                ", createtime=" + createtime +
                ", updatebyid='" + updatebyid + '\'' +
                ", updatebyname='" + updatebyname + '\'' +
                ", updatetime=" + updatetime +
                '}';
    }
}