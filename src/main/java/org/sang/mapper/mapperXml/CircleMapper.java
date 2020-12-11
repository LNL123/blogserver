/*
package org.sang.mapper.mapperXml;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static org.sang.mapper.mapperXml.CircleDynamicSqlSupport.*;

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
import org.sang.bean.Circle;

@Mapper
public interface CircleMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_circle")
    BasicColumn[] selectList = BasicColumn.columnList(circleid, accountid, name, isverify, isquestion, question3, question2, question1, location, remark1, remark2, remark3, remark4, remark5, creattime, updatetime, delete, createby);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_circle")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_circle")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_circle")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Circle> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_circle")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Circle> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_circle")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="CircleResult", value = {
        @Result(column="circleId", property="circleid", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="accountId", property="accountid", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="isVerify", property="isverify", jdbcType=JdbcType.VARCHAR),
        @Result(column="isQuestion", property="isquestion", jdbcType=JdbcType.VARCHAR),
        @Result(column="question3", property="question3", jdbcType=JdbcType.VARCHAR),
        @Result(column="question2", property="question2", jdbcType=JdbcType.VARCHAR),
        @Result(column="question1", property="question1", jdbcType=JdbcType.VARCHAR),
        @Result(column="location", property="location", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark1", property="remark1", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark2", property="remark2", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark3", property="remark3", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark4", property="remark4", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark5", property="remark5", jdbcType=JdbcType.VARCHAR),
        @Result(column="creatTime", property="creattime", jdbcType=JdbcType.VARCHAR),
        @Result(column="updateTime", property="updatetime", jdbcType=JdbcType.VARCHAR),
        @Result(column="delete", property="delete", jdbcType=JdbcType.CHAR),
        @Result(column="createBy", property="createby", jdbcType=JdbcType.VARCHAR)
    })
    Optional<Circle> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_circle")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="CircleResult", value = {
        @Result(column="circleId", property="circleid", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="accountId", property="accountid", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="isVerify", property="isverify", jdbcType=JdbcType.VARCHAR),
        @Result(column="isQuestion", property="isquestion", jdbcType=JdbcType.VARCHAR),
        @Result(column="question3", property="question3", jdbcType=JdbcType.VARCHAR),
        @Result(column="question2", property="question2", jdbcType=JdbcType.VARCHAR),
        @Result(column="question1", property="question1", jdbcType=JdbcType.VARCHAR),
        @Result(column="location", property="location", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark1", property="remark1", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark2", property="remark2", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark3", property="remark3", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark4", property="remark4", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark5", property="remark5", jdbcType=JdbcType.VARCHAR),
        @Result(column="creatTime", property="creattime", jdbcType=JdbcType.VARCHAR),
        @Result(column="updateTime", property="updatetime", jdbcType=JdbcType.VARCHAR),
        @Result(column="delete", property="delete", jdbcType=JdbcType.CHAR),
        @Result(column="createBy", property="createby", jdbcType=JdbcType.VARCHAR)
    })
    List<Circle> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_circle")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_circle")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, circle, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_circle")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, circle, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_circle")
    default int deleteByPrimaryKey(String circleid_) {
        return delete(c -> 
            c.where(circleid, isEqualTo(circleid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_circle")
    default int insert(Circle record) {
        return MyBatis3Utils.insert(this::insert, record, circle, c ->
            c.map(circleid).toProperty("circleid")
            .map(accountid).toProperty("accountid")
            .map(name).toProperty("name")
            .map(isverify).toProperty("isverify")
            .map(isquestion).toProperty("isquestion")
            .map(question3).toProperty("question3")
            .map(question2).toProperty("question2")
            .map(question1).toProperty("question1")
            .map(location).toProperty("location")
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

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_circle")
    default int insertMultiple(Collection<Circle> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, circle, c ->
            c.map(circleid).toProperty("circleid")
            .map(accountid).toProperty("accountid")
            .map(name).toProperty("name")
            .map(isverify).toProperty("isverify")
            .map(isquestion).toProperty("isquestion")
            .map(question3).toProperty("question3")
            .map(question2).toProperty("question2")
            .map(question1).toProperty("question1")
            .map(location).toProperty("location")
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

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_circle")
    default int insertSelective(Circle record) {
        return MyBatis3Utils.insert(this::insert, record, circle, c ->
            c.map(circleid).toPropertyWhenPresent("circleid", record::getCircleid)
            .map(accountid).toPropertyWhenPresent("accountid", record::getAccountid)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(isverify).toPropertyWhenPresent("isverify", record::getIsverify)
            .map(isquestion).toPropertyWhenPresent("isquestion", record::getIsquestion)
            .map(question3).toPropertyWhenPresent("question3", record::getQuestion3)
            .map(question2).toPropertyWhenPresent("question2", record::getQuestion2)
            .map(question1).toPropertyWhenPresent("question1", record::getQuestion1)
            .map(location).toPropertyWhenPresent("location", record::getLocation)
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

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_circle")
    default Optional<Circle> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, circle, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_circle")
    default List<Circle> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, circle, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_circle")
    default List<Circle> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, circle, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_circle")
    default Optional<Circle> selectByPrimaryKey(String circleid_) {
        return selectOne(c ->
            c.where(circleid, isEqualTo(circleid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_circle")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, circle, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_circle")
    static UpdateDSL<UpdateModel> updateAllColumns(Circle record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(circleid).equalTo(record::getCircleid)
                .set(accountid).equalTo(record::getAccountid)
                .set(name).equalTo(record::getName)
                .set(isverify).equalTo(record::getIsverify)
                .set(isquestion).equalTo(record::getIsquestion)
                .set(question3).equalTo(record::getQuestion3)
                .set(question2).equalTo(record::getQuestion2)
                .set(question1).equalTo(record::getQuestion1)
                .set(location).equalTo(record::getLocation)
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

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_circle")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Circle record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(circleid).equalToWhenPresent(record::getCircleid)
                .set(accountid).equalToWhenPresent(record::getAccountid)
                .set(name).equalToWhenPresent(record::getName)
                .set(isverify).equalToWhenPresent(record::getIsverify)
                .set(isquestion).equalToWhenPresent(record::getIsquestion)
                .set(question3).equalToWhenPresent(record::getQuestion3)
                .set(question2).equalToWhenPresent(record::getQuestion2)
                .set(question1).equalToWhenPresent(record::getQuestion1)
                .set(location).equalToWhenPresent(record::getLocation)
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

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_circle")
    default int updateByPrimaryKey(Circle record) {
        return update(c ->
            c.set(accountid).equalTo(record::getAccountid)
            .set(name).equalTo(record::getName)
            .set(isverify).equalTo(record::getIsverify)
            .set(isquestion).equalTo(record::getIsquestion)
            .set(question3).equalTo(record::getQuestion3)
            .set(question2).equalTo(record::getQuestion2)
            .set(question1).equalTo(record::getQuestion1)
            .set(location).equalTo(record::getLocation)
            .set(remark1).equalTo(record::getRemark1)
            .set(remark2).equalTo(record::getRemark2)
            .set(remark3).equalTo(record::getRemark3)
            .set(remark4).equalTo(record::getRemark4)
            .set(remark5).equalTo(record::getRemark5)
            .set(creattime).equalTo(record::getCreattime)
            .set(updatetime).equalTo(record::getUpdatetime)
            .set(delete).equalTo(record::getDelete)
            .set(createby).equalTo(record::getCreateby)
            .where(circleid, isEqualTo(record::getCircleid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_circle")
    default int updateByPrimaryKeySelective(Circle record) {
        return update(c ->
            c.set(accountid).equalToWhenPresent(record::getAccountid)
            .set(name).equalToWhenPresent(record::getName)
            .set(isverify).equalToWhenPresent(record::getIsverify)
            .set(isquestion).equalToWhenPresent(record::getIsquestion)
            .set(question3).equalToWhenPresent(record::getQuestion3)
            .set(question2).equalToWhenPresent(record::getQuestion2)
            .set(question1).equalToWhenPresent(record::getQuestion1)
            .set(location).equalToWhenPresent(record::getLocation)
            .set(remark1).equalToWhenPresent(record::getRemark1)
            .set(remark2).equalToWhenPresent(record::getRemark2)
            .set(remark3).equalToWhenPresent(record::getRemark3)
            .set(remark4).equalToWhenPresent(record::getRemark4)
            .set(remark5).equalToWhenPresent(record::getRemark5)
            .set(creattime).equalToWhenPresent(record::getCreattime)
            .set(updatetime).equalToWhenPresent(record::getUpdatetime)
            .set(delete).equalToWhenPresent(record::getDelete)
            .set(createby).equalToWhenPresent(record::getCreateby)
            .where(circleid, isEqualTo(record::getCircleid))
        );
    }
}*/
