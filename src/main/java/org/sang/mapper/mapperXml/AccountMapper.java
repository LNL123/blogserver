/*
package org.sang.mapper.mapperXml;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static org.sang.mapper.mapperXml.AccountDynamicSqlSupport.*;

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
import org.sang.bean.Account;

@Mapper
public interface AccountMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account")
    BasicColumn[] selectList = BasicColumn.columnList(id, name, phonenum, email, sex, img, nickname, area, single, university, company, creattime, updatetime, delete, createby);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Account> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Account> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="AccountResult", value = {
        @Result(column="Id", property="id", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="phoneNum", property="phonenum", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="sex", property="sex", jdbcType=JdbcType.VARCHAR),
        @Result(column="img", property="img", jdbcType=JdbcType.VARCHAR),
        @Result(column="nickName", property="nickname", jdbcType=JdbcType.VARCHAR),
        @Result(column="area", property="area", jdbcType=JdbcType.VARCHAR),
        @Result(column="single", property="single", jdbcType=JdbcType.VARCHAR),
        @Result(column="university", property="university", jdbcType=JdbcType.VARCHAR),
        @Result(column="company", property="company", jdbcType=JdbcType.VARCHAR),
        @Result(column="creatTime", property="creattime", jdbcType=JdbcType.VARCHAR),
        @Result(column="updateTime", property="updatetime", jdbcType=JdbcType.VARCHAR),
        @Result(column="delete", property="delete", jdbcType=JdbcType.VARCHAR),
        @Result(column="createBy", property="createby", jdbcType=JdbcType.VARCHAR)
    })
    Optional<Account> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="AccountResult", value = {
        @Result(column="Id", property="id", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="phoneNum", property="phonenum", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="sex", property="sex", jdbcType=JdbcType.VARCHAR),
        @Result(column="img", property="img", jdbcType=JdbcType.VARCHAR),
        @Result(column="nickName", property="nickname", jdbcType=JdbcType.VARCHAR),
        @Result(column="area", property="area", jdbcType=JdbcType.VARCHAR),
        @Result(column="single", property="single", jdbcType=JdbcType.VARCHAR),
        @Result(column="university", property="university", jdbcType=JdbcType.VARCHAR),
        @Result(column="company", property="company", jdbcType=JdbcType.VARCHAR),
        @Result(column="creatTime", property="creattime", jdbcType=JdbcType.VARCHAR),
        @Result(column="updateTime", property="updatetime", jdbcType=JdbcType.VARCHAR),
        @Result(column="delete", property="delete", jdbcType=JdbcType.VARCHAR),
        @Result(column="createBy", property="createby", jdbcType=JdbcType.VARCHAR)
    })
    List<Account> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, account, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, account, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account")
    default int deleteByPrimaryKey(String id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account")
    default int insert(Account record) {
        return MyBatis3Utils.insert(this::insert, record, account, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(phonenum).toProperty("phonenum")
            .map(email).toProperty("email")
            .map(sex).toProperty("sex")
            .map(img).toProperty("img")
            .map(nickname).toProperty("nickname")
            .map(area).toProperty("area")
            .map(single).toProperty("single")
            .map(university).toProperty("university")
            .map(company).toProperty("company")
            .map(creattime).toProperty("creattime")
            .map(updatetime).toProperty("updatetime")
            .map(delete).toProperty("delete")
            .map(createby).toProperty("createby")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account")
    default int insertMultiple(Collection<Account> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, account, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(phonenum).toProperty("phonenum")
            .map(email).toProperty("email")
            .map(sex).toProperty("sex")
            .map(img).toProperty("img")
            .map(nickname).toProperty("nickname")
            .map(area).toProperty("area")
            .map(single).toProperty("single")
            .map(university).toProperty("university")
            .map(company).toProperty("company")
            .map(creattime).toProperty("creattime")
            .map(updatetime).toProperty("updatetime")
            .map(delete).toProperty("delete")
            .map(createby).toProperty("createby")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account")
    default int insertSelective(Account record) {
        return MyBatis3Utils.insert(this::insert, record, account, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(phonenum).toPropertyWhenPresent("phonenum", record::getPhonenum)
            .map(email).toPropertyWhenPresent("email", record::getEmail)
            .map(sex).toPropertyWhenPresent("sex", record::getSex)
            .map(img).toPropertyWhenPresent("img", record::getImg)
            .map(nickname).toPropertyWhenPresent("nickname", record::getNickname)
            .map(area).toPropertyWhenPresent("area", record::getArea)
            .map(single).toPropertyWhenPresent("single", record::getSingle)
            .map(university).toPropertyWhenPresent("university", record::getUniversity)
            .map(company).toPropertyWhenPresent("company", record::getCompany)
            .map(creattime).toPropertyWhenPresent("creattime", record::getCreattime)
            .map(updatetime).toPropertyWhenPresent("updatetime", record::getUpdatetime)
            .map(delete).toPropertyWhenPresent("delete", record::getDelete)
            .map(createby).toPropertyWhenPresent("createby", record::getCreateby)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account")
    default Optional<Account> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, account, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account")
    default List<Account> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, account, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account")
    default List<Account> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, account, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account")
    default Optional<Account> selectByPrimaryKey(String id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, account, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account")
    static UpdateDSL<UpdateModel> updateAllColumns(Account record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(name).equalTo(record::getName)
                .set(phonenum).equalTo(record::getPhonenum)
                .set(email).equalTo(record::getEmail)
                .set(sex).equalTo(record::getSex)
                .set(img).equalTo(record::getImg)
                .set(nickname).equalTo(record::getNickname)
                .set(area).equalTo(record::getArea)
                .set(single).equalTo(record::getSingle)
                .set(university).equalTo(record::getUniversity)
                .set(company).equalTo(record::getCompany)
                .set(creattime).equalTo(record::getCreattime)
                .set(updatetime).equalTo(record::getUpdatetime)
                .set(delete).equalTo(record::getDelete)
                .set(createby).equalTo(record::getCreateby);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Account record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(name).equalToWhenPresent(record::getName)
                .set(phonenum).equalToWhenPresent(record::getPhonenum)
                .set(email).equalToWhenPresent(record::getEmail)
                .set(sex).equalToWhenPresent(record::getSex)
                .set(img).equalToWhenPresent(record::getImg)
                .set(nickname).equalToWhenPresent(record::getNickname)
                .set(area).equalToWhenPresent(record::getArea)
                .set(single).equalToWhenPresent(record::getSingle)
                .set(university).equalToWhenPresent(record::getUniversity)
                .set(company).equalToWhenPresent(record::getCompany)
                .set(creattime).equalToWhenPresent(record::getCreattime)
                .set(updatetime).equalToWhenPresent(record::getUpdatetime)
                .set(delete).equalToWhenPresent(record::getDelete)
                .set(createby).equalToWhenPresent(record::getCreateby);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account")
    default int updateByPrimaryKey(Account record) {
        return update(c ->
            c.set(name).equalTo(record::getName)
            .set(phonenum).equalTo(record::getPhonenum)
            .set(email).equalTo(record::getEmail)
            .set(sex).equalTo(record::getSex)
            .set(img).equalTo(record::getImg)
            .set(nickname).equalTo(record::getNickname)
            .set(area).equalTo(record::getArea)
            .set(single).equalTo(record::getSingle)
            .set(university).equalTo(record::getUniversity)
            .set(company).equalTo(record::getCompany)
            .set(creattime).equalTo(record::getCreattime)
            .set(updatetime).equalTo(record::getUpdatetime)
            .set(delete).equalTo(record::getDelete)
            .set(createby).equalTo(record::getCreateby)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account")
    default int updateByPrimaryKeySelective(Account record) {
        return update(c ->
            c.set(name).equalToWhenPresent(record::getName)
            .set(phonenum).equalToWhenPresent(record::getPhonenum)
            .set(email).equalToWhenPresent(record::getEmail)
            .set(sex).equalToWhenPresent(record::getSex)
            .set(img).equalToWhenPresent(record::getImg)
            .set(nickname).equalToWhenPresent(record::getNickname)
            .set(area).equalToWhenPresent(record::getArea)
            .set(single).equalToWhenPresent(record::getSingle)
            .set(university).equalToWhenPresent(record::getUniversity)
            .set(company).equalToWhenPresent(record::getCompany)
            .set(creattime).equalToWhenPresent(record::getCreattime)
            .set(updatetime).equalToWhenPresent(record::getUpdatetime)
            .set(delete).equalToWhenPresent(record::getDelete)
            .set(createby).equalToWhenPresent(record::getCreateby)
            .where(id, isEqualTo(record::getId))
        );
    }
}*/
