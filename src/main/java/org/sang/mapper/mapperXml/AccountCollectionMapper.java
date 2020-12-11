/*
package org.sang.mapper.mapperXml;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static org.sang.mapper.mapperXml.AccountCollectionDynamicSqlSupport.*;

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
import org.sang.bean.AccountCollection;

@Mapper
public interface AccountCollectionMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_collection")
    BasicColumn[] selectList = BasicColumn.columnList(collectionid, accountid, postid, title, content, remark1, remark2, remark3, remark4, remark5, creattime, updatetime, delete, createby);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_collection")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_collection")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_collection")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<AccountCollection> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_collection")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<AccountCollection> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_collection")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="AccountCollectionResult", value = {
        @Result(column="collectionId", property="collectionid", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="accountId", property="accountid", jdbcType=JdbcType.VARCHAR),
        @Result(column="postId", property="postid", jdbcType=JdbcType.VARCHAR),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
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
    Optional<AccountCollection> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_collection")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="AccountCollectionResult", value = {
        @Result(column="collectionId", property="collectionid", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="accountId", property="accountid", jdbcType=JdbcType.VARCHAR),
        @Result(column="postId", property="postid", jdbcType=JdbcType.VARCHAR),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
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
    List<AccountCollection> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_collection")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_collection")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, accountCollection, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_collection")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, accountCollection, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_collection")
    default int deleteByPrimaryKey(String collectionid_) {
        return delete(c -> 
            c.where(collectionid, isEqualTo(collectionid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_collection")
    default int insert(AccountCollection record) {
        return MyBatis3Utils.insert(this::insert, record, accountCollection, c ->
            c.map(collectionid).toProperty("collectionid")
            .map(accountid).toProperty("accountid")
            .map(postid).toProperty("postid")
            .map(title).toProperty("title")
            .map(content).toProperty("content")
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

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_collection")
    default int insertMultiple(Collection<AccountCollection> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, accountCollection, c ->
            c.map(collectionid).toProperty("collectionid")
            .map(accountid).toProperty("accountid")
            .map(postid).toProperty("postid")
            .map(title).toProperty("title")
            .map(content).toProperty("content")
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

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_collection")
    default int insertSelective(AccountCollection record) {
        return MyBatis3Utils.insert(this::insert, record, accountCollection, c ->
            c.map(collectionid).toPropertyWhenPresent("collectionid", record::getCollectionid)
            .map(accountid).toPropertyWhenPresent("accountid", record::getAccountid)
            .map(postid).toPropertyWhenPresent("postid", record::getPostid)
            .map(title).toPropertyWhenPresent("title", record::getTitle)
            .map(content).toPropertyWhenPresent("content", record::getContent)
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

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_collection")
    default Optional<AccountCollection> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, accountCollection, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_collection")
    default List<AccountCollection> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, accountCollection, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_collection")
    default List<AccountCollection> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, accountCollection, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_collection")
    default Optional<AccountCollection> selectByPrimaryKey(String collectionid_) {
        return selectOne(c ->
            c.where(collectionid, isEqualTo(collectionid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_collection")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, accountCollection, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_collection")
    static UpdateDSL<UpdateModel> updateAllColumns(AccountCollection record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(collectionid).equalTo(record::getCollectionid)
                .set(accountid).equalTo(record::getAccountid)
                .set(postid).equalTo(record::getPostid)
                .set(title).equalTo(record::getTitle)
                .set(content).equalTo(record::getContent)
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

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_collection")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(AccountCollection record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(collectionid).equalToWhenPresent(record::getCollectionid)
                .set(accountid).equalToWhenPresent(record::getAccountid)
                .set(postid).equalToWhenPresent(record::getPostid)
                .set(title).equalToWhenPresent(record::getTitle)
                .set(content).equalToWhenPresent(record::getContent)
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

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_collection")
    default int updateByPrimaryKey(AccountCollection record) {
        return update(c ->
            c.set(accountid).equalTo(record::getAccountid)
            .set(postid).equalTo(record::getPostid)
            .set(title).equalTo(record::getTitle)
            .set(content).equalTo(record::getContent)
            .set(remark1).equalTo(record::getRemark1)
            .set(remark2).equalTo(record::getRemark2)
            .set(remark3).equalTo(record::getRemark3)
            .set(remark4).equalTo(record::getRemark4)
            .set(remark5).equalTo(record::getRemark5)
            .set(creattime).equalTo(record::getCreattime)
            .set(updatetime).equalTo(record::getUpdatetime)
            .set(delete).equalTo(record::getDelete)
            .set(createby).equalTo(record::getCreateby)
            .where(collectionid, isEqualTo(record::getCollectionid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_collection")
    default int updateByPrimaryKeySelective(AccountCollection record) {
        return update(c ->
            c.set(accountid).equalToWhenPresent(record::getAccountid)
            .set(postid).equalToWhenPresent(record::getPostid)
            .set(title).equalToWhenPresent(record::getTitle)
            .set(content).equalToWhenPresent(record::getContent)
            .set(remark1).equalToWhenPresent(record::getRemark1)
            .set(remark2).equalToWhenPresent(record::getRemark2)
            .set(remark3).equalToWhenPresent(record::getRemark3)
            .set(remark4).equalToWhenPresent(record::getRemark4)
            .set(remark5).equalToWhenPresent(record::getRemark5)
            .set(creattime).equalToWhenPresent(record::getCreattime)
            .set(updatetime).equalToWhenPresent(record::getUpdatetime)
            .set(delete).equalToWhenPresent(record::getDelete)
            .set(createby).equalToWhenPresent(record::getCreateby)
            .where(collectionid, isEqualTo(record::getCollectionid))
        );
    }
}*/
