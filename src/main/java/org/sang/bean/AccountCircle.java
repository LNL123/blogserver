package org.sang.bean;

import java.util.Date;
import javax.annotation.Generated;

public class AccountCircle {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_circle.id")
    private String id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_circle.accountId")
    private String accountid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_circle.view")
    private String view;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_circle.circleId")
    private String circleid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_circle.createTime")
    private Date createtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_circle.updateTime")
    private Date updatetime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_circle.delete")
    private String delete;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_circle.createBy")
    private String createby;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_circle.id")
    public String getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_circle.id")
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_circle.accountId")
    public String getAccountid() {
        return accountid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_circle.accountId")
    public void setAccountid(String accountid) {
        this.accountid = accountid == null ? null : accountid.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_circle.view")
    public String getView() {
        return view;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_circle.view")
    public void setView(String view) {
        this.view = view == null ? null : view.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_circle.circleId")
    public String getCircleid() {
        return circleid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_circle.circleId")
    public void setCircleid(String circleid) {
        this.circleid = circleid == null ? null : circleid.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_circle.createTime")
    public Date getCreatetime() {
        return createtime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_circle.createTime")
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_circle.updateTime")
    public Date getUpdatetime() {
        return updatetime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_circle.updateTime")
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_circle.delete")
    public String getDelete() {
        return delete;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_circle.delete")
    public void setDelete(String delete) {
        this.delete = delete == null ? null : delete.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_circle.createBy")
    public String getCreateby() {
        return createby;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_circle.createBy")
    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }
}