/*
package org.sang.mapper.mapperXml;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static org.sang.mapper.mapperXml.AccountFocusDynamicSqlSupport.*;

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
import org.sang.bean.AccountFocus;

@Mapper
public interface AccountFocusMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_focus")
    BasicColumn[] selectList = BasicColumn.columnList(focusid, accountid, focusaccountid, remark1, remark2, remark3, remark4, remark5, createtime, updatetime, delete, createby);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_focus")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_focus")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_focus")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<AccountFocus> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_focus")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<AccountFocus> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_focus")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="AccountFocusResult", value = {
        @Result(column="focusId", property="focusid", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="accountId", property="accountid", jdbcType=JdbcType.VARCHAR),
        @Result(column="focusAccountId", property="focusaccountid", jdbcType=JdbcType.VARCHAR),
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
    Optional<AccountFocus> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_focus")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="AccountFocusResult", value = {
        @Result(column="focusId", property="focusid", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="accountId", property="accountid", jdbcType=JdbcType.VARCHAR),
        @Result(column="focusAccountId", property="focusaccountid", jdbcType=JdbcType.VARCHAR),
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
    List<AccountFocus> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_focus")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_focus")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, accountFocus, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_focus")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, accountFocus, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_focus")
    default int deleteByPrimaryKey(String focusid_) {
        return delete(c -> 
            c.where(focusid, isEqualTo(focusid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_focus")
    default int insert(AccountFocus record) {
        return MyBatis3Utils.insert(this::insert, record, accountFocus, c ->
            c.map(focusid).toProperty("focusid")
            .map(accountid).toProperty("accountid")
            .map(focusaccountid).toProperty("focusaccountid")
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

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_focus")
    default int insertMultiple(Collection<AccountFocus> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, accountFocus, c ->
            c.map(focusid).toProperty("focusid")
            .map(accountid).toProperty("accountid")
            .map(focusaccountid).toProperty("focusaccountid")
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

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_focus")
    default int insertSelective(AccountFocus record) {
        return MyBatis3Utils.insert(this::insert, record, accountFocus, c ->
            c.map(focusid).toPropertyWhenPresent("focusid", record::getFocusid)
            .map(accountid).toPropertyWhenPresent("accountid", record::getAccountid)
            .map(focusaccountid).toPropertyWhenPresent("focusaccountid", record::getFocusaccountid)
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

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_focus")
    default Optional<AccountFocus> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, accountFocus, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_focus")
    default List<AccountFocus> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, accountFocus, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_focus")
    default List<AccountFocus> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, accountFocus, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_focus")
    default Optional<AccountFocus> selectByPrimaryKey(String focusid_) {
        return selectOne(c ->
            c.where(focusid, isEqualTo(focusid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_focus")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, accountFocus, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_focus")
    static UpdateDSL<UpdateModel> updateAllColumns(AccountFocus record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(focusid).equalTo(record::getFocusid)
                .set(accountid).equalTo(record::getAccountid)
                .set(focusaccountid).equalTo(record::getFocusaccountid)
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

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_focus")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(AccountFocus record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(focusid).equalToWhenPresent(record::getFocusid)
                .set(accountid).equalToWhenPresent(record::getAccountid)
                .set(focusaccountid).equalToWhenPresent(record::getFocusaccountid)
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

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_focus")
    default int updateByPrimaryKey(AccountFocus record) {
        return update(c ->
            c.set(accountid).equalTo(record::getAccountid)
            .set(focusaccountid).equalTo(record::getFocusaccountid)
            .set(remark1).equalTo(record::getRemark1)
            .set(remark2).equalTo(record::getRemark2)
            .set(remark3).equalTo(record::getRemark3)
            .set(remark4).equalTo(record::getRemark4)
            .set(remark5).equalTo(record::getRemark5)
            .set(createtime).equalTo(record::getCreatetime)
            .set(updatetime).equalTo(record::getUpdatetime)
            .set(delete).equalTo(record::getDelete)
            .set(createby).equalTo(record::getCreateby)
            .where(focusid, isEqualTo(record::getFocusid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_focus")
    default int updateByPrimaryKeySelective(AccountFocus record) {
        return update(c ->
            c.set(accountid).equalToWhenPresent(record::getAccountid)
            .set(focusaccountid).equalToWhenPresent(record::getFocusaccountid)
            .set(remark1).equalToWhenPresent(record::getRemark1)
            .set(remark2).equalToWhenPresent(record::getRemark2)
            .set(remark3).equalToWhenPresent(record::getRemark3)
            .set(remark4).equalToWhenPresent(record::getRemark4)
            .set(remark5).equalToWhenPresent(record::getRemark5)
            .set(createtime).equalToWhenPresent(record::getCreatetime)
            .set(updatetime).equalToWhenPresent(record::getUpdatetime)
            .set(delete).equalToWhenPresent(record::getDelete)
            .set(createby).equalToWhenPresent(record::getCreateby)
            .where(focusid, isEqualTo(record::getFocusid))
        );
    }
}*/
