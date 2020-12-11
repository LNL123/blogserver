/*
package org.sang.mapper.mapperXml;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static org.sang.mapper.mapperXml.AccountDictionaryDynamicSqlSupport.*;

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
import org.sang.bean.AccountDictionary;

@Mapper
public interface AccountDictionaryMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_dictionary")
    BasicColumn[] selectList = BasicColumn.columnList(id, dictionaryid, accountid, type);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_dictionary")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_dictionary")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_dictionary")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<AccountDictionary> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_dictionary")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<AccountDictionary> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_dictionary")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="AccountDictionaryResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="dictionaryId", property="dictionaryid", jdbcType=JdbcType.VARCHAR),
        @Result(column="accountId", property="accountid", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR)
    })
    Optional<AccountDictionary> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_dictionary")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="AccountDictionaryResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="dictionaryId", property="dictionaryid", jdbcType=JdbcType.VARCHAR),
        @Result(column="accountId", property="accountid", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR)
    })
    List<AccountDictionary> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_dictionary")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_dictionary")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, accountDictionary, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_dictionary")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, accountDictionary, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_dictionary")
    default int deleteByPrimaryKey(String id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_dictionary")
    default int insert(AccountDictionary record) {
        return MyBatis3Utils.insert(this::insert, record, accountDictionary, c ->
            c.map(id).toProperty("id")
            .map(dictionaryid).toProperty("dictionaryid")
            .map(accountid).toProperty("accountid")
            .map(type).toProperty("type")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_dictionary")
    default int insertMultiple(Collection<AccountDictionary> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, accountDictionary, c ->
            c.map(id).toProperty("id")
            .map(dictionaryid).toProperty("dictionaryid")
            .map(accountid).toProperty("accountid")
            .map(type).toProperty("type")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_dictionary")
    default int insertSelective(AccountDictionary record) {
        return MyBatis3Utils.insert(this::insert, record, accountDictionary, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(dictionaryid).toPropertyWhenPresent("dictionaryid", record::getDictionaryid)
            .map(accountid).toPropertyWhenPresent("accountid", record::getAccountid)
            .map(type).toPropertyWhenPresent("type", record::getType)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_dictionary")
    default Optional<AccountDictionary> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, accountDictionary, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_dictionary")
    default List<AccountDictionary> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, accountDictionary, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_dictionary")
    default List<AccountDictionary> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, accountDictionary, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_dictionary")
    default Optional<AccountDictionary> selectByPrimaryKey(String id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_dictionary")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, accountDictionary, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_dictionary")
    static UpdateDSL<UpdateModel> updateAllColumns(AccountDictionary record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(dictionaryid).equalTo(record::getDictionaryid)
                .set(accountid).equalTo(record::getAccountid)
                .set(type).equalTo(record::getType);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_dictionary")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(AccountDictionary record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(dictionaryid).equalToWhenPresent(record::getDictionaryid)
                .set(accountid).equalToWhenPresent(record::getAccountid)
                .set(type).equalToWhenPresent(record::getType);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_dictionary")
    default int updateByPrimaryKey(AccountDictionary record) {
        return update(c ->
            c.set(dictionaryid).equalTo(record::getDictionaryid)
            .set(accountid).equalTo(record::getAccountid)
            .set(type).equalTo(record::getType)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_account_dictionary")
    default int updateByPrimaryKeySelective(AccountDictionary record) {
        return update(c ->
            c.set(dictionaryid).equalToWhenPresent(record::getDictionaryid)
            .set(accountid).equalToWhenPresent(record::getAccountid)
            .set(type).equalToWhenPresent(record::getType)
            .where(id, isEqualTo(record::getId))
        );
    }
}*/
