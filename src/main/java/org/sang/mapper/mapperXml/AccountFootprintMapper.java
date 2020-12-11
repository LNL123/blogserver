/*
package org.sang.mapper.mapperXml;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static org.sang.mapper.mapperXml.AccountFootprintDynamicSqlSupport.*;

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
import org.sang.bean.AccountFootprint;

@Mapper
public interface AccountFootprintMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_footprint")
    BasicColumn[] selectList = BasicColumn.columnList(id, accountid, forward, postid, remark1, remark2, remark3, remark4, remark5, createtime, updatetime, delete, createby);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_footprint")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_footprint")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_footprint")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<AccountFootprint> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_footprint")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<AccountFootprint> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_footprint")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="AccountFootprintResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="accountId", property="accountid", jdbcType=JdbcType.VARCHAR),
        @Result(column="forward", property="forward", jdbcType=JdbcType.VARCHAR),
        @Result(column="postId", property="postid", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark1", property="remark1", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark2", property="remark2", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark3", property="remark3", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark4", property="remark4", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark5", property="remark5", jdbcType=JdbcType.VARCHAR),
        @Result(column="createTime", property="createtime", jdbcType=JdbcType.VARCHAR),
        @Result(column="updateTime", property="updatetime", jdbcType=JdbcType.VARCHAR),
        @Result(column="delete", property="delete", jdbcType=JdbcType.VARCHAR),
        @Result(column="createBy", property="createby", jdbcType=JdbcType.VARCHAR)
    })
    Optional<AccountFootprint> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_footprint")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="AccountFootprintResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="accountId", property="accountid", jdbcType=JdbcType.VARCHAR),
        @Result(column="forward", property="forward", jdbcType=JdbcType.VARCHAR),
        @Result(column="postId", property="postid", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark1", property="remark1", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark2", property="remark2", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark3", property="remark3", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark4", property="remark4", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark5", property="remark5", jdbcType=JdbcType.VARCHAR),
        @Result(column="createTime", property="createtime", jdbcType=JdbcType.VARCHAR),
        @Result(column="updateTime", property="updatetime", jdbcType=JdbcType.VARCHAR),
        @Result(column="delete", property="delete", jdbcType=JdbcType.VARCHAR),
        @Result(column="createBy", property="createby", jdbcType=JdbcType.VARCHAR)
    })
    List<AccountFootprint> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_footprint")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_footprint")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, accountFootprint, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_footprint")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, accountFootprint, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_footprint")
    default int deleteByPrimaryKey(String id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_footprint")
    default int insert(AccountFootprint record) {
        return MyBatis3Utils.insert(this::insert, record, accountFootprint, c ->
            c.map(id).toProperty("id")
            .map(accountid).toProperty("accountid")
            .map(forward).toProperty("forward")
            .map(postid).toProperty("postid")
            .map(remark1).toProperty("remark1")
            .map(remark2).toProperty("remark2")
            .map(remark3).toProperty("remark3")
            .map(remark4).toProperty("remark4")
            .map(remark5).toProperty("remark5")
            .map(createtime).toProperty("createtime")
            .map(updatetime).toProperty("updatetime")
            .map(delete).toProperty("delete")
            .map(createby).toProperty("createby")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_footprint")
    default int insertMultiple(Collection<AccountFootprint> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, accountFootprint, c ->
            c.map(id).toProperty("id")
            .map(accountid).toProperty("accountid")
            .map(forward).toProperty("forward")
            .map(postid).toProperty("postid")
            .map(remark1).toProperty("remark1")
            .map(remark2).toProperty("remark2")
            .map(remark3).toProperty("remark3")
            .map(remark4).toProperty("remark4")
            .map(remark5).toProperty("remark5")
            .map(createtime).toProperty("createtime")
            .map(updatetime).toProperty("updatetime")
            .map(delete).toProperty("delete")
            .map(createby).toProperty("createby")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_footprint")
    default int insertSelective(AccountFootprint record) {
        return MyBatis3Utils.insert(this::insert, record, accountFootprint, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(accountid).toPropertyWhenPresent("accountid", record::getAccountid)
            .map(forward).toPropertyWhenPresent("forward", record::getForward)
            .map(postid).toPropertyWhenPresent("postid", record::getPostid)
            .map(remark1).toPropertyWhenPresent("remark1", record::getRemark1)
            .map(remark2).toPropertyWhenPresent("remark2", record::getRemark2)
            .map(remark3).toPropertyWhenPresent("remark3", record::getRemark3)
            .map(remark4).toPropertyWhenPresent("remark4", record::getRemark4)
            .map(remark5).toPropertyWhenPresent("remark5", record::getRemark5)
            .map(createtime).toPropertyWhenPresent("createtime", record::getCreatetime)
            .map(updatetime).toPropertyWhenPresent("updatetime", record::getUpdatetime)
            .map(delete).toPropertyWhenPresent("delete", record::getDelete)
            .map(createby).toPropertyWhenPresent("createby", record::getCreateby)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_footprint")
    default Optional<AccountFootprint> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, accountFootprint, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_footprint")
    default List<AccountFootprint> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, accountFootprint, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_footprint")
    default List<AccountFootprint> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, accountFootprint, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_footprint")
    default Optional<AccountFootprint> selectByPrimaryKey(String id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_footprint")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, accountFootprint, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_footprint")
    static UpdateDSL<UpdateModel> updateAllColumns(AccountFootprint record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(accountid).equalTo(record::getAccountid)
                .set(forward).equalTo(record::getForward)
                .set(postid).equalTo(record::getPostid)
                .set(remark1).equalTo(record::getRemark1)
                .set(remark2).equalTo(record::getRemark2)
                .set(remark3).equalTo(record::getRemark3)
                .set(remark4).equalTo(record::getRemark4)
                .set(remark5).equalTo(record::getRemark5)
                .set(createtime).equalTo(record::getCreatetime)
                .set(updatetime).equalTo(record::getUpdatetime)
                .set(delete).equalTo(record::getDelete)
                .set(createby).equalTo(record::getCreateby);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_footprint")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(AccountFootprint record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(accountid).equalToWhenPresent(record::getAccountid)
                .set(forward).equalToWhenPresent(record::getForward)
                .set(postid).equalToWhenPresent(record::getPostid)
                .set(remark1).equalToWhenPresent(record::getRemark1)
                .set(remark2).equalToWhenPresent(record::getRemark2)
                .set(remark3).equalToWhenPresent(record::getRemark3)
                .set(remark4).equalToWhenPresent(record::getRemark4)
                .set(remark5).equalToWhenPresent(record::getRemark5)
                .set(createtime).equalToWhenPresent(record::getCreatetime)
                .set(updatetime).equalToWhenPresent(record::getUpdatetime)
                .set(delete).equalToWhenPresent(record::getDelete)
                .set(createby).equalToWhenPresent(record::getCreateby);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_footprint")
    default int updateByPrimaryKey(AccountFootprint record) {
        return update(c ->
            c.set(accountid).equalTo(record::getAccountid)
            .set(forward).equalTo(record::getForward)
            .set(postid).equalTo(record::getPostid)
            .set(remark1).equalTo(record::getRemark1)
            .set(remark2).equalTo(record::getRemark2)
            .set(remark3).equalTo(record::getRemark3)
            .set(remark4).equalTo(record::getRemark4)
            .set(remark5).equalTo(record::getRemark5)
            .set(createtime).equalTo(record::getCreatetime)
            .set(updatetime).equalTo(record::getUpdatetime)
            .set(delete).equalTo(record::getDelete)
            .set(createby).equalTo(record::getCreateby)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_footprint")
    default int updateByPrimaryKeySelective(AccountFootprint record) {
        return update(c ->
            c.set(accountid).equalToWhenPresent(record::getAccountid)
            .set(forward).equalToWhenPresent(record::getForward)
            .set(postid).equalToWhenPresent(record::getPostid)
            .set(remark1).equalToWhenPresent(record::getRemark1)
            .set(remark2).equalToWhenPresent(record::getRemark2)
            .set(remark3).equalToWhenPresent(record::getRemark3)
            .set(remark4).equalToWhenPresent(record::getRemark4)
            .set(remark5).equalToWhenPresent(record::getRemark5)
            .set(createtime).equalToWhenPresent(record::getCreatetime)
            .set(updatetime).equalToWhenPresent(record::getUpdatetime)
            .set(delete).equalToWhenPresent(record::getDelete)
            .set(createby).equalToWhenPresent(record::getCreateby)
            .where(id, isEqualTo(record::getId))
        );
    }
}*/
