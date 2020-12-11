package org.sang.mapper.mapperXml;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class AccountValuablesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_valuables")
    public static final AccountValuables accountValuables = new AccountValuables();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_valuables.Id")
    public static final SqlColumn<String> id = accountValuables.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_valuables.accountId")
    public static final SqlColumn<String> accountid = accountValuables.accountid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_valuables.name")
    public static final SqlColumn<String> name = accountValuables.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_valuables.picAddress")
    public static final SqlColumn<String> picaddress = accountValuables.picaddress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_valuables.dictionaryId")
    public static final SqlColumn<String> dictionaryid = accountValuables.dictionaryid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_valuables.remark")
    public static final SqlColumn<String> remark = accountValuables.remark;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_valuables.price")
    public static final SqlColumn<String> price = accountValuables.price;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_valuables.remark1")
    public static final SqlColumn<String> remark1 = accountValuables.remark1;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_valuables.remark2")
    public static final SqlColumn<String> remark2 = accountValuables.remark2;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_valuables.remark3")
    public static final SqlColumn<String> remark3 = accountValuables.remark3;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_valuables.remark4")
    public static final SqlColumn<String> remark4 = accountValuables.remark4;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_valuables.remark5")
    public static final SqlColumn<String> remark5 = accountValuables.remark5;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_valuables.createTime")
    public static final SqlColumn<String> createtime = accountValuables.createtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_valuables.updateTime")
    public static final SqlColumn<String> updatetime = accountValuables.updatetime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_valuables.delete")
    public static final SqlColumn<String> delete = accountValuables.delete;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: jc_account_valuables.createBy")
    public static final SqlColumn<String> createby = accountValuables.createby;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_valuables")
    public static final class AccountValuables extends SqlTable {
        public final SqlColumn<String> id = column("Id", JDBCType.CHAR);

        public final SqlColumn<String> accountid = column("accountId", JDBCType.VARCHAR);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> picaddress = column("picAddress", JDBCType.VARCHAR);

        public final SqlColumn<String> dictionaryid = column("dictionaryId", JDBCType.VARCHAR);

        public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);

        public final SqlColumn<String> price = column("price", JDBCType.VARCHAR);

        public final SqlColumn<String> remark1 = column("remark1", JDBCType.VARCHAR);

        public final SqlColumn<String> remark2 = column("remark2", JDBCType.VARCHAR);

        public final SqlColumn<String> remark3 = column("remark3", JDBCType.VARCHAR);

        public final SqlColumn<String> remark4 = column("remark4", JDBCType.VARCHAR);

        public final SqlColumn<String> remark5 = column("remark5", JDBCType.VARCHAR);

        public final SqlColumn<String> createtime = column("createTime", JDBCType.VARCHAR);

        public final SqlColumn<String> updatetime = column("updateTime", JDBCType.VARCHAR);

        public final SqlColumn<String> delete = column("delete", JDBCType.VARCHAR);

        public final SqlColumn<String> createby = column("createBy", JDBCType.VARCHAR);

        public AccountValuables() {
            super("jc_account_valuables");
        }
    }
}