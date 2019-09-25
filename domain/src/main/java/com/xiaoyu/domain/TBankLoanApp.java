package com.xiaoyu.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
/*
* 业务登记表
* */
public class TBankLoanApp implements Serializable {


    private static final long serialVersionUID = 2143799148150227290L;

    private Long id;

    private String serialnumber;

    private String businesstype;

    private String unitname;

    private String bankname;

    private String currencycode;

    private String currencyname;

    private BigDecimal money;

    private Date dates;

    private String applicant;

    private Integer applicationformstatus;

    private String createby;

    private String createbyname;

    private Date createtime;

    private String updateby;

    private String updatebyname;

    private Date updatetime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber == null ? null : serialnumber.trim();
    }

    public String getBusinesstype() {
        return businesstype;
    }

    public void setBusinesstype(String businesstype) {
        this.businesstype = businesstype == null ? null : businesstype.trim();
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname == null ? null : unitname.trim();
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname == null ? null : bankname.trim();
    }

    public String getCurrencycode() {
        return currencycode;
    }

    public void setCurrencycode(String currencycode) {
        this.currencycode = currencycode == null ? null : currencycode.trim();
    }

    public String getCurrencyname() {
        return currencyname;
    }

    public void setCurrencyname(String currencyname) {
        this.currencyname = currencyname == null ? null : currencyname.trim();
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Date getDates() {
        return dates;
    }

    public void setDates(Date dates) {
        this.dates = dates;
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant == null ? null : applicant.trim();
    }

    public Integer getApplicationformstatus() {
        return applicationformstatus;
    }

    public void setApplicationformstatus(Integer applicationformstatus) {
        this.applicationformstatus = applicationformstatus;
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    public String getCreatebyname() {
        return createbyname;
    }

    public void setCreatebyname(String createbyname) {
        this.createbyname = createbyname == null ? null : createbyname.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getUpdateby() {
        return updateby;
    }

    public void setUpdateby(String updateby) {
        this.updateby = updateby == null ? null : updateby.trim();
    }

    public String getUpdatebyname() {
        return updatebyname;
    }

    public void setUpdatebyname(String updatebyname) {
        this.updatebyname = updatebyname == null ? null : updatebyname.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    @Override
    public String toString() {
        return "TBankLoanApp{" +
                "id=" + id +
                ", serialnumber='" + serialnumber + '\'' +
                ", businesstype='" + businesstype + '\'' +
                ", unitname='" + unitname + '\'' +
                ", bankname='" + bankname + '\'' +
                ", currencycode='" + currencycode + '\'' +
                ", currencyname='" + currencyname + '\'' +
                ", money=" + money +
                ", dates=" + dates +
                ", applicant='" + applicant + '\'' +
                ", applicationformstatus=" + applicationformstatus +
                ", createby='" + createby + '\'' +
                ", createbyname='" + createbyname + '\'' +
                ", createtime=" + createtime +
                ", updateby='" + updateby + '\'' +
                ", updatebyname='" + updatebyname + '\'' +
                ", updatetime=" + updatetime +
                '}';
    }
}