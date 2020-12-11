package org.sang.bean;

import javax.annotation.Generated;

public class AccountDictionary {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_dictionary.id")
    private String id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_dictionary.dictionaryId")
    private String dictionaryid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_dictionary.accountId")
    private String accountid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_dictionary.type")
    private String type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_dictionary.id")
    public String getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_dictionary.id")
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_dictionary.dictionaryId")
    public String getDictionaryid() {
        return dictionaryid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_dictionary.dictionaryId")
    public void setDictionaryid(String dictionaryid) {
        this.dictionaryid = dictionaryid == null ? null : dictionaryid.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_dictionary.accountId")
    public String getAccountid() {
        return accountid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_dictionary.accountId")
    public void setAccountid(String accountid) {
        this.accountid = accountid == null ? null : accountid.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_dictionary.type")
    public String getType() {
        return type;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_dictionary.type")
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}