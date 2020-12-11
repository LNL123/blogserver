/*
package org.sang.mapper.mapperXml;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static org.sang.mapper.mapperXml.AccountPostDynamicSqlSupport.*;

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
import org.sang.bean.AccountPost;

@Mapper
public interface AccountPostMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_post")
    BasicColumn[] selectList = BasicColumn.columnList(postid, accountid, title, content, circleid, dictionaryid, location, viewnum, likenum, commentnum, forwardnum, remark1, remark2, remark3, remark4, remark5, createtime, updatetime, delete, createby);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_post")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_post")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_post")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<AccountPost> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_post")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<AccountPost> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_post")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="AccountPostResult", value = {
        @Result(column="postId", property="postid", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="accountId", property="accountid", jdbcType=JdbcType.VARCHAR),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="circleId", property="circleid", jdbcType=JdbcType.VARCHAR),
        @Result(column="dictionaryId", property="dictionaryid", jdbcType=JdbcType.VARCHAR),
        @Result(column="location", property="location", jdbcType=JdbcType.VARCHAR),
        @Result(column="viewNum", property="viewnum", jdbcType=JdbcType.VARCHAR),
        @Result(column="likeNum", property="likenum", jdbcType=JdbcType.VARCHAR),
        @Result(column="commentNum", property="commentnum", jdbcType=JdbcType.VARCHAR),
        @Result(column="forwardNum", property="forwardnum", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark1", property="remark1", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark2", property="remark2", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark3", property="remark3", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark4", property="remark4", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark5", property="remark5", jdbcType=JdbcType.VARCHAR),
        @Result(column="createTime", property="createtime", jdbcType=JdbcType.CHAR),
        @Result(column="updateTime", property="updatetime", jdbcType=JdbcType.VARCHAR),
        @Result(column="delete", property="delete", jdbcType=JdbcType.VARCHAR),
        @Result(column="createBy", property="createby", jdbcType=JdbcType.VARCHAR)
    })
    Optional<AccountPost> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_post")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="AccountPostResult", value = {
        @Result(column="postId", property="postid", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="accountId", property="accountid", jdbcType=JdbcType.VARCHAR),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="circleId", property="circleid", jdbcType=JdbcType.VARCHAR),
        @Result(column="dictionaryId", property="dictionaryid", jdbcType=JdbcType.VARCHAR),
        @Result(column="location", property="location", jdbcType=JdbcType.VARCHAR),
        @Result(column="viewNum", property="viewnum", jdbcType=JdbcType.VARCHAR),
        @Result(column="likeNum", property="likenum", jdbcType=JdbcType.VARCHAR),
        @Result(column="commentNum", property="commentnum", jdbcType=JdbcType.VARCHAR),
        @Result(column="forwardNum", property="forwardnum", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark1", property="remark1", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark2", property="remark2", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark3", property="remark3", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark4", property="remark4", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark5", property="remark5", jdbcType=JdbcType.VARCHAR),
        @Result(column="createTime", property="createtime", jdbcType=JdbcType.CHAR),
        @Result(column="updateTime", property="updatetime", jdbcType=JdbcType.VARCHAR),
        @Result(column="delete", property="delete", jdbcType=JdbcType.VARCHAR),
        @Result(column="createBy", property="createby", jdbcType=JdbcType.VARCHAR)
    })
    List<AccountPost> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_post")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_post")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, accountPost, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_post")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, accountPost, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_post")
    default int deleteByPrimaryKey(String postid_) {
        return delete(c -> 
            c.where(postid, isEqualTo(postid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_post")
    default int insert(AccountPost record) {
        return MyBatis3Utils.insert(this::insert, record, accountPost, c ->
            c.map(postid).toProperty("postid")
            .map(accountid).toProperty("accountid")
            .map(title).toProperty("title")
            .map(content).toProperty("content")
            .map(circleid).toProperty("circleid")
            .map(dictionaryid).toProperty("dictionaryid")
            .map(location).toProperty("location")
            .map(viewnum).toProperty("viewnum")
            .map(likenum).toProperty("likenum")
            .map(commentnum).toProperty("commentnum")
            .map(forwardnum).toProperty("forwardnum")
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

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_post")
    default int insertMultiple(Collection<AccountPost> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, accountPost, c ->
            c.map(postid).toProperty("postid")
            .map(accountid).toProperty("accountid")
            .map(title).toProperty("title")
            .map(content).toProperty("content")
            .map(circleid).toProperty("circleid")
            .map(dictionaryid).toProperty("dictionaryid")
            .map(location).toProperty("location")
            .map(viewnum).toProperty("viewnum")
            .map(likenum).toProperty("likenum")
            .map(commentnum).toProperty("commentnum")
            .map(forwardnum).toProperty("forwardnum")
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

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_post")
    default int insertSelective(AccountPost record) {
        return MyBatis3Utils.insert(this::insert, record, accountPost, c ->
            c.map(postid).toPropertyWhenPresent("postid", record::getPostid)
            .map(accountid).toPropertyWhenPresent("accountid", record::getAccountid)
            .map(title).toPropertyWhenPresent("title", record::getTitle)
            .map(content).toPropertyWhenPresent("content", record::getContent)
            .map(circleid).toPropertyWhenPresent("circleid", record::getCircleid)
            .map(dictionaryid).toPropertyWhenPresent("dictionaryid", record::getDictionaryid)
            .map(location).toPropertyWhenPresent("location", record::getLocation)
            .map(viewnum).toPropertyWhenPresent("viewnum", record::getViewnum)
            .map(likenum).toPropertyWhenPresent("likenum", record::getLikenum)
            .map(commentnum).toPropertyWhenPresent("commentnum", record::getCommentnum)
            .map(forwardnum).toPropertyWhenPresent("forwardnum", record::getForwardnum)
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

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_post")
    default Optional<AccountPost> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, accountPost, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_post")
    default List<AccountPost> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, accountPost, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_post")
    default List<AccountPost> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, accountPost, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_post")
    default Optional<AccountPost> selectByPrimaryKey(String postid_) {
        return selectOne(c ->
            c.where(postid, isEqualTo(postid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_post")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, accountPost, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_post")
    static UpdateDSL<UpdateModel> updateAllColumns(AccountPost record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(postid).equalTo(record::getPostid)
                .set(accountid).equalTo(record::getAccountid)
                .set(title).equalTo(record::getTitle)
                .set(content).equalTo(record::getContent)
                .set(circleid).equalTo(record::getCircleid)
                .set(dictionaryid).equalTo(record::getDictionaryid)
                .set(location).equalTo(record::getLocation)
                .set(viewnum).equalTo(record::getViewnum)
                .set(likenum).equalTo(record::getLikenum)
                .set(commentnum).equalTo(record::getCommentnum)
                .set(forwardnum).equalTo(record::getForwardnum)
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

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_post")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(AccountPost record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(postid).equalToWhenPresent(record::getPostid)
                .set(accountid).equalToWhenPresent(record::getAccountid)
                .set(title).equalToWhenPresent(record::getTitle)
                .set(content).equalToWhenPresent(record::getContent)
                .set(circleid).equalToWhenPresent(record::getCircleid)
                .set(dictionaryid).equalToWhenPresent(record::getDictionaryid)
                .set(location).equalToWhenPresent(record::getLocation)
                .set(viewnum).equalToWhenPresent(record::getViewnum)
                .set(likenum).equalToWhenPresent(record::getLikenum)
                .set(commentnum).equalToWhenPresent(record::getCommentnum)
                .set(forwardnum).equalToWhenPresent(record::getForwardnum)
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

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_post")
    default int updateByPrimaryKey(AccountPost record) {
        return update(c ->
            c.set(accountid).equalTo(record::getAccountid)
            .set(title).equalTo(record::getTitle)
            .set(content).equalTo(record::getContent)
            .set(circleid).equalTo(record::getCircleid)
            .set(dictionaryid).equalTo(record::getDictionaryid)
            .set(location).equalTo(record::getLocation)
            .set(viewnum).equalTo(record::getViewnum)
            .set(likenum).equalTo(record::getLikenum)
            .set(commentnum).equalTo(record::getCommentnum)
            .set(forwardnum).equalTo(record::getForwardnum)
            .set(remark1).equalTo(record::getRemark1)
            .set(remark2).equalTo(record::getRemark2)
            .set(remark3).equalTo(record::getRemark3)
            .set(remark4).equalTo(record::getRemark4)
            .set(remark5).equalTo(record::getRemark5)
            .set(createtime).equalTo(record::getCreatetime)
            .set(updatetime).equalTo(record::getUpdatetime)
            .set(delete).equalTo(record::getDelete)
            .set(createby).equalTo(record::getCreateby)
            .where(postid, isEqualTo(record::getPostid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_post")
    default int updateByPrimaryKeySelective(AccountPost record) {
        return update(c ->
            c.set(accountid).equalToWhenPresent(record::getAccountid)
            .set(title).equalToWhenPresent(record::getTitle)
            .set(content).equalToWhenPresent(record::getContent)
            .set(circleid).equalToWhenPresent(record::getCircleid)
            .set(dictionaryid).equalToWhenPresent(record::getDictionaryid)
            .set(location).equalToWhenPresent(record::getLocation)
            .set(viewnum).equalToWhenPresent(record::getViewnum)
            .set(likenum).equalToWhenPresent(record::getLikenum)
            .set(commentnum).equalToWhenPresent(record::getCommentnum)
            .set(forwardnum).equalToWhenPresent(record::getForwardnum)
            .set(remark1).equalToWhenPresent(record::getRemark1)
            .set(remark2).equalToWhenPresent(record::getRemark2)
            .set(remark3).equalToWhenPresent(record::getRemark3)
            .set(remark4).equalToWhenPresent(record::getRemark4)
            .set(remark5).equalToWhenPresent(record::getRemark5)
            .set(createtime).equalToWhenPresent(record::getCreatetime)
            .set(updatetime).equalToWhenPresent(record::getUpdatetime)
            .set(delete).equalToWhenPresent(record::getDelete)
            .set(createby).equalToWhenPresent(record::getCreateby)
            .where(postid, isEqualTo(record::getPostid))
        );
    }
}*/
