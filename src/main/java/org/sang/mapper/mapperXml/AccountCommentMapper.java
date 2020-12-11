/*
package org.sang.mapper.mapperXml;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static org.sang.mapper.mapperXml.AccountCommentDynamicSqlSupport.*;

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
import org.sang.bean.AccountComment;

@Mapper
public interface AccountCommentMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_comment")
    BasicColumn[] selectList = BasicColumn.columnList(commentid, content, remark1, remark2, remark3, remark4, remark5, createtime, updatetime, delete, createby);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_comment")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_comment")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_comment")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<AccountComment> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_comment")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<AccountComment> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_comment")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="AccountCommentResult", value = {
        @Result(column="commentId", property="commentid", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
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
    Optional<AccountComment> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_comment")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="AccountCommentResult", value = {
        @Result(column="commentId", property="commentid", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
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
    List<AccountComment> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_comment")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_comment")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, accountComment, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_comment")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, accountComment, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_comment")
    default int deleteByPrimaryKey(String commentid_) {
        return delete(c -> 
            c.where(commentid, isEqualTo(commentid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_comment")
    default int insert(AccountComment record) {
        return MyBatis3Utils.insert(this::insert, record, accountComment, c ->
            c.map(commentid).toProperty("commentid")
            .map(content).toProperty("content")
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

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_comment")
    default int insertMultiple(Collection<AccountComment> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, accountComment, c ->
            c.map(commentid).toProperty("commentid")
            .map(content).toProperty("content")
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

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_comment")
    default int insertSelective(AccountComment record) {
        return MyBatis3Utils.insert(this::insert, record, accountComment, c ->
            c.map(commentid).toPropertyWhenPresent("commentid", record::getCommentid)
            .map(content).toPropertyWhenPresent("content", record::getContent)
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

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_comment")
    default Optional<AccountComment> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, accountComment, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_comment")
    default List<AccountComment> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, accountComment, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_comment")
    default List<AccountComment> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, accountComment, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_comment")
    default Optional<AccountComment> selectByPrimaryKey(String commentid_) {
        return selectOne(c ->
            c.where(commentid, isEqualTo(commentid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_comment")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, accountComment, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_comment")
    static UpdateDSL<UpdateModel> updateAllColumns(AccountComment record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(commentid).equalTo(record::getCommentid)
                .set(content).equalTo(record::getContent)
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

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_comment")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(AccountComment record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(commentid).equalToWhenPresent(record::getCommentid)
                .set(content).equalToWhenPresent(record::getContent)
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

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_comment")
    default int updateByPrimaryKey(AccountComment record) {
        return update(c ->
            c.set(content).equalTo(record::getContent)
            .set(remark1).equalTo(record::getRemark1)
            .set(remark2).equalTo(record::getRemark2)
            .set(remark3).equalTo(record::getRemark3)
            .set(remark4).equalTo(record::getRemark4)
            .set(remark5).equalTo(record::getRemark5)
            .set(createtime).equalTo(record::getCreatetime)
            .set(updatetime).equalTo(record::getUpdatetime)
            .set(delete).equalTo(record::getDelete)
            .set(createby).equalTo(record::getCreateby)
            .where(commentid, isEqualTo(record::getCommentid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_comment")
    default int updateByPrimaryKeySelective(AccountComment record) {
        return update(c ->
            c.set(content).equalToWhenPresent(record::getContent)
            .set(remark1).equalToWhenPresent(record::getRemark1)
            .set(remark2).equalToWhenPresent(record::getRemark2)
            .set(remark3).equalToWhenPresent(record::getRemark3)
            .set(remark4).equalToWhenPresent(record::getRemark4)
            .set(remark5).equalToWhenPresent(record::getRemark5)
            .set(createtime).equalToWhenPresent(record::getCreatetime)
            .set(updatetime).equalToWhenPresent(record::getUpdatetime)
            .set(delete).equalToWhenPresent(record::getDelete)
            .set(createby).equalToWhenPresent(record::getCreateby)
            .where(commentid, isEqualTo(record::getCommentid))
        );
    }
}*/
