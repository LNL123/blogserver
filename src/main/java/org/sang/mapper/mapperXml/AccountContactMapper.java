/*
package org.sang.mapper.mapperXml;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static org.sang.mapper.mapperXml.AccountContactDynamicSqlSupport.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;
import org.sang.bean.AccountContact;

@Mapper
public interface AccountContactMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_contact")
    BasicColumn[] selectList = BasicColumn.columnList(contactid, accountid, nickname, truename, moreinfo, headimg, remark1, remark2, remark3, remark4, remark5, creattime, updatetime, delete, createby);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_contact")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_contact")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_contact")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<AccountContact> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_contact")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<AccountContact> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_contact")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="AccountContactResult", value = {
        @Result(column="contactId", property="contactid", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="accountId", property="accountid", jdbcType=JdbcType.VARCHAR),
        @Result(column="nickName", property="nickname", jdbcType=JdbcType.VARCHAR),
        @Result(column="trueName", property="truename", jdbcType=JdbcType.VARCHAR),
        @Result(column="moreInfo", property="moreinfo", jdbcType=JdbcType.VARCHAR),
        @Result(column="headImg", property="headimg", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark1", property="remark1", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark2", property="remark2", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark3", property="remark3", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark4", property="remark4", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark5", property="remark5", jdbcType=JdbcType.VARCHAR),
        @Result(column="creatTime", property="creattime", jdbcType=JdbcType.VARCHAR),
        @Result(column="updateTime", property="updatetime", jdbcType=JdbcType.VARCHAR),
        @Result(column="delete", property="delete", jdbcType=JdbcType.VARCHAR),
        @Result(column="createBy", property="createby", jdbcType=JdbcType.VARCHAR)
    })
    Optional<AccountContact> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_contact")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="AccountContactResult", value = {
        @Result(column="contactId", property="contactid", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="accountId", property="accountid", jdbcType=JdbcType.VARCHAR),
        @Result(column="nickName", property="nickname", jdbcType=JdbcType.VARCHAR),
        @Result(column="trueName", property="truename", jdbcType=JdbcType.VARCHAR),
        @Result(column="moreInfo", property="moreinfo", jdbcType=JdbcType.VARCHAR),
        @Result(column="headImg", property="headimg", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark1", property="remark1", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark2", property="remark2", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark3", property="remark3", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark4", property="remark4", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark5", property="remark5", jdbcType=JdbcType.VARCHAR),
        @Result(column="creatTime", property="creattime", jdbcType=JdbcType.VARCHAR),
        @Result(column="updateTime", property="updatetime", jdbcType=JdbcType.VARCHAR),
        @Result(column="delete", property="delete", jdbcType=JdbcType.VARCHAR),
        @Result(column="createBy", property="createby", jdbcType=JdbcType.VARCHAR)
    })
    List<AccountContact> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_contact")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_contact")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, accountContact, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_contact")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, accountContact, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_contact")
    default int deleteByPrimaryKey(String contactid_) {
        return delete(c -> 
            c.where(contactid, isEqualTo(contactid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_contact")
    default int insert(AccountContact record) {
        return MyBatis3Utils.insert(this::insert, record, accountContact, c ->
            c.map(contactid).toProperty("contactid")
            .map(accountid).toProperty("accountid")
            .map(nickname).toProperty("nickname")
            .map(truename).toProperty("truename")
            .map(moreinfo).toProperty("moreinfo")
            .map(headimg).toProperty("headimg")
            .map(remark1).toProperty("remark1")
            .map(remark2).toProperty("remark2")
            .map(remark3).toProperty("remark3")
            .map(remark4).toProperty("remark4")
            .map(remark5).toProperty("remark5")
            .map(creattime).toProperty("creattime")
            .map(updatetime).toProperty("updatetime")
            .map(delete).toProperty("delete")
            .map(createby).toProperty("createby")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_contact")
    default int insertMultiple(Collection<AccountContact> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, accountContact, c ->
            c.map(contactid).toProperty("contactid")
            .map(accountid).toProperty("accountid")
            .map(nickname).toProperty("nickname")
            .map(truename).toProperty("truename")
            .map(moreinfo).toProperty("moreinfo")
            .map(headimg).toProperty("headimg")
            .map(remark1).toProperty("remark1")
            .map(remark2).toProperty("remark2")
            .map(remark3).toProperty("remark3")
            .map(remark4).toProperty("remark4")
            .map(remark5).toProperty("remark5")
            .map(creattime).toProperty("creattime")
            .map(updatetime).toProperty("updatetime")
            .map(delete).toProperty("delete")
            .map(createby).toProperty("createby")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_contact")
    default int insertSelective(AccountContact record) {
        return MyBatis3Utils.insert(this::insert, record, accountContact, c ->
            c.map(contactid).toPropertyWhenPresent("contactid", record::getContactid)
            .map(accountid).toPropertyWhenPresent("accountid", record::getAccountid)
            .map(nickname).toPropertyWhenPresent("nickname", record::getNickname)
            .map(truename).toPropertyWhenPresent("truename", record::getTruename)
            .map(moreinfo).toPropertyWhenPresent("moreinfo", record::getMoreinfo)
            .map(headimg).toPropertyWhenPresent("headimg", record::getHeadimg)
            .map(remark1).toPropertyWhenPresent("remark1", record::getRemark1)
            .map(remark2).toPropertyWhenPresent("remark2", record::getRemark2)
            .map(remark3).toPropertyWhenPresent("remark3", record::getRemark3)
            .map(remark4).toPropertyWhenPresent("remark4", record::getRemark4)
            .map(remark5).toPropertyWhenPresent("remark5", record::getRemark5)
            .map(creattime).toPropertyWhenPresent("creattime", record::getCreattime)
            .map(updatetime).toPropertyWhenPresent("updatetime", record::getUpdatetime)
            .map(delete).toPropertyWhenPresent("delete", record::getDelete)
            .map(createby).toPropertyWhenPresent("createby", record::getCreateby)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_contact")
    default Optional<AccountContact> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, accountContact, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_contact")
    default List<AccountContact> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, accountContact, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_contact")
    default List<AccountContact> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, accountContact, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_contact")
    default Optional<AccountContact> selectByPrimaryKey(String contactid_) {
        return selectOne(c ->
            c.where(contactid, isEqualTo(contactid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_contact")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, accountContact, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_contact")
    static UpdateDSL<UpdateModel> updateAllColumns(AccountContact record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(contactid).equalTo(record::getContactid)
                .set(accountid).equalTo(record::getAccountid)
                .set(nickname).equalTo(record::getNickname)
                .set(truename).equalTo(record::getTruename)
                .set(moreinfo).equalTo(record::getMoreinfo)
                .set(headimg).equalTo(record::getHeadimg)
                .set(remark1).equalTo(record::getRemark1)
                .set(remark2).equalTo(record::getRemark2)
                .set(remark3).equalTo(record::getRemark3)
                .set(remark4).equalTo(record::getRemark4)
                .set(remark5).equalTo(record::getRemark5)
                .set(creattime).equalTo(record::getCreattime)
                .set(updatetime).equalTo(record::getUpdatetime)
                .set(delete).equalTo(record::getDelete)
                .set(createby).equalTo(record::getCreateby);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_contact")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(AccountContact record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(contactid).equalToWhenPresent(record::getContactid)
                .set(accountid).equalToWhenPresent(record::getAccountid)
                .set(nickname).equalToWhenPresent(record::getNickname)
                .set(truename).equalToWhenPresent(record::getTruename)
                .set(moreinfo).equalToWhenPresent(record::getMoreinfo)
                .set(headimg).equalToWhenPresent(record::getHeadimg)
                .set(remark1).equalToWhenPresent(record::getRemark1)
                .set(remark2).equalToWhenPresent(record::getRemark2)
                .set(remark3).equalToWhenPresent(record::getRemark3)
                .set(remark4).equalToWhenPresent(record::getRemark4)
                .set(remark5).equalToWhenPresent(record::getRemark5)
                .set(creattime).equalToWhenPresent(record::getCreattime)
                .set(updatetime).equalToWhenPresent(record::getUpdatetime)
                .set(delete).equalToWhenPresent(record::getDelete)
                .set(createby).equalToWhenPresent(record::getCreateby);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_contact")
    default int updateByPrimaryKey(AccountContact record) {
        return update(c ->
            c.set(accountid).equalTo(record::getAccountid)
            .set(nickname).equalTo(record::getNickname)
            .set(truename).equalTo(record::getTruename)
            .set(moreinfo).equalTo(record::getMoreinfo)
            .set(headimg).equalTo(record::getHeadimg)
            .set(remark1).equalTo(record::getRemark1)
            .set(remark2).equalTo(record::getRemark2)
            .set(remark3).equalTo(record::getRemark3)
            .set(remark4).equalTo(record::getRemark4)
            .set(remark5).equalTo(record::getRemark5)
            .set(creattime).equalTo(record::getCreattime)
            .set(updatetime).equalTo(record::getUpdatetime)
            .set(delete).equalTo(record::getDelete)
            .set(createby).equalTo(record::getCreateby)
            .where(contactid, isEqualTo(record::getContactid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_contact")
    default int updateByPrimaryKeySelective(AccountContact record) {
        return update(c ->
            c.set(accountid).equalToWhenPresent(record::getAccountid)
            .set(nickname).equalToWhenPresent(record::getNickname)
            .set(truename).equalToWhenPresent(record::getTruename)
            .set(moreinfo).equalToWhenPresent(record::getMoreinfo)
            .set(headimg).equalToWhenPresent(record::getHeadimg)
            .set(remark1).equalToWhenPresent(record::getRemark1)
            .set(remark2).equalToWhenPresent(record::getRemark2)
            .set(remark3).equalToWhenPresent(record::getRemark3)
            .set(remark4).equalToWhenPresent(record::getRemark4)
            .set(remark5).equalToWhenPresent(record::getRemark5)
            .set(creattime).equalToWhenPresent(record::getCreattime)
            .set(updatetime).equalToWhenPresent(record::getUpdatetime)
            .set(delete).equalToWhenPresent(record::getDelete)
            .set(createby).equalToWhenPresent(record::getCreateby)
            .where(contactid, isEqualTo(record::getContactid))
        );
    }
}*/
