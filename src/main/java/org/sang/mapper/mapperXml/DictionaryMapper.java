/*
package org.sang.mapper.mapperXml;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static org.sang.mapper.mapperXml.DictionaryDynamicSqlSupport.*;

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
import org.sang.bean.Dictionary;

@Mapper
public interface DictionaryMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_dictionary")
    BasicColumn[] selectList = BasicColumn.columnList(dictionaryid, type, name, delete, remark, remark1, remark2, remark3, remark4, remark5, createtime, updatetime, createby, value);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_dictionary")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_dictionary")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_dictionary")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Dictionary> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_dictionary")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Dictionary> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_dictionary")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="DictionaryResult", value = {
        @Result(column="dictionaryId", property="dictionaryid", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="delete", property="delete", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark1", property="remark1", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark2", property="remark2", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark3", property="remark3", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark4", property="remark4", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark5", property="remark5", jdbcType=JdbcType.VARCHAR),
        @Result(column="createTime", property="createtime", jdbcType=JdbcType.VARCHAR),
        @Result(column="updateTime", property="updatetime", jdbcType=JdbcType.VARCHAR),
        @Result(column="createBy", property="createby", jdbcType=JdbcType.VARCHAR),
        @Result(column="value", property="value", jdbcType=JdbcType.VARCHAR)
    })
    Optional<Dictionary> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_dictionary")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="DictionaryResult", value = {
        @Result(column="dictionaryId", property="dictionaryid", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="delete", property="delete", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark1", property="remark1", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark2", property="remark2", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark3", property="remark3", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark4", property="remark4", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark5", property="remark5", jdbcType=JdbcType.VARCHAR),
        @Result(column="createTime", property="createtime", jdbcType=JdbcType.VARCHAR),
        @Result(column="updateTime", property="updatetime", jdbcType=JdbcType.VARCHAR),
        @Result(column="createBy", property="createby", jdbcType=JdbcType.VARCHAR),
        @Result(column="value", property="value", jdbcType=JdbcType.VARCHAR)
    })
    List<Dictionary> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_dictionary")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_dictionary")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, dictionary, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_dictionary")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, dictionary, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_dictionary")
    default int deleteByPrimaryKey(String dictionaryid_) {
        return delete(c -> 
            c.where(dictionaryid, isEqualTo(dictionaryid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_dictionary")
    default int insert(Dictionary record) {
        return MyBatis3Utils.insert(this::insert, record, dictionary, c ->
            c.map(dictionaryid).toProperty("dictionaryid")
            .map(type).toProperty("type")
            .map(name).toProperty("name")
            .map(delete).toProperty("delete")
            .map(remark).toProperty("remark")
            .map(remark1).toProperty("remark1")
            .map(remark2).toProperty("remark2")
            .map(remark3).toProperty("remark3")
            .map(remark4).toProperty("remark4")
            .map(remark5).toProperty("remark5")
            .map(createtime).toProperty("createtime")
            .map(updatetime).toProperty("updatetime")
            .map(createby).toProperty("createby")
            .map(value).toProperty("value")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_dictionary")
    default int insertMultiple(Collection<Dictionary> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, dictionary, c ->
            c.map(dictionaryid).toProperty("dictionaryid")
            .map(type).toProperty("type")
            .map(name).toProperty("name")
            .map(delete).toProperty("delete")
            .map(remark).toProperty("remark")
            .map(remark1).toProperty("remark1")
            .map(remark2).toProperty("remark2")
            .map(remark3).toProperty("remark3")
            .map(remark4).toProperty("remark4")
            .map(remark5).toProperty("remark5")
            .map(createtime).toProperty("createtime")
            .map(updatetime).toProperty("updatetime")
            .map(createby).toProperty("createby")
            .map(value).toProperty("value")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_dictionary")
    default int insertSelective(Dictionary record) {
        return MyBatis3Utils.insert(this::insert, record, dictionary, c ->
            c.map(dictionaryid).toPropertyWhenPresent("dictionaryid", record::getDictionaryid)
            .map(type).toPropertyWhenPresent("type", record::getType)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(delete).toPropertyWhenPresent("delete", record::getDelete)
            .map(remark).toPropertyWhenPresent("remark", record::getRemark)
            .map(remark1).toPropertyWhenPresent("remark1", record::getRemark1)
            .map(remark2).toPropertyWhenPresent("remark2", record::getRemark2)
            .map(remark3).toPropertyWhenPresent("remark3", record::getRemark3)
            .map(remark4).toPropertyWhenPresent("remark4", record::getRemark4)
            .map(remark5).toPropertyWhenPresent("remark5", record::getRemark5)
            .map(createtime).toPropertyWhenPresent("createtime", record::getCreatetime)
            .map(updatetime).toPropertyWhenPresent("updatetime", record::getUpdatetime)
            .map(createby).toPropertyWhenPresent("createby", record::getCreateby)
            .map(value).toPropertyWhenPresent("value", record::getValue)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_dictionary")
    default Optional<Dictionary> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, dictionary, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_dictionary")
    default List<Dictionary> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, dictionary, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_dictionary")
    default List<Dictionary> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, dictionary, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_dictionary")
    default Optional<Dictionary> selectByPrimaryKey(String dictionaryid_) {
        return selectOne(c ->
            c.where(dictionaryid, isEqualTo(dictionaryid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_dictionary")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, dictionary, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_dictionary")
    static UpdateDSL<UpdateModel> updateAllColumns(Dictionary record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(dictionaryid).equalTo(record::getDictionaryid)
                .set(type).equalTo(record::getType)
                .set(name).equalTo(record::getName)
                .set(delete).equalTo(record::getDelete)
                .set(remark).equalTo(record::getRemark)
                .set(remark1).equalTo(record::getRemark1)
                .set(remark2).equalTo(record::getRemark2)
                .set(remark3).equalTo(record::getRemark3)
                .set(remark4).equalTo(record::getRemark4)
                .set(remark5).equalTo(record::getRemark5)
                .set(createtime).equalTo(record::getCreatetime)
                .set(updatetime).equalTo(record::getUpdatetime)
                .set(createby).equalTo(record::getCreateby)
                .set(value).equalTo(record::getValue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_dictionary")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Dictionary record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(dictionaryid).equalToWhenPresent(record::getDictionaryid)
                .set(type).equalToWhenPresent(record::getType)
                .set(name).equalToWhenPresent(record::getName)
                .set(delete).equalToWhenPresent(record::getDelete)
                .set(remark).equalToWhenPresent(record::getRemark)
                .set(remark1).equalToWhenPresent(record::getRemark1)
                .set(remark2).equalToWhenPresent(record::getRemark2)
                .set(remark3).equalToWhenPresent(record::getRemark3)
                .set(remark4).equalToWhenPresent(record::getRemark4)
                .set(remark5).equalToWhenPresent(record::getRemark5)
                .set(createtime).equalToWhenPresent(record::getCreatetime)
                .set(updatetime).equalToWhenPresent(record::getUpdatetime)
                .set(createby).equalToWhenPresent(record::getCreateby)
                .set(value).equalToWhenPresent(record::getValue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_dictionary")
    default int updateByPrimaryKey(Dictionary record) {
        return update(c ->
            c.set(type).equalTo(record::getType)
            .set(name).equalTo(record::getName)
            .set(delete).equalTo(record::getDelete)
            .set(remark).equalTo(record::getRemark)
            .set(remark1).equalTo(record::getRemark1)
            .set(remark2).equalTo(record::getRemark2)
            .set(remark3).equalTo(record::getRemark3)
            .set(remark4).equalTo(record::getRemark4)
            .set(remark5).equalTo(record::getRemark5)
            .set(createtime).equalTo(record::getCreatetime)
            .set(updatetime).equalTo(record::getUpdatetime)
            .set(createby).equalTo(record::getCreateby)
            .set(value).equalTo(record::getValue)
            .where(dictionaryid, isEqualTo(record::getDictionaryid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: jc_dictionary")
    default int updateByPrimaryKeySelective(Dictionary record) {
        return update(c ->
            c.set(type).equalToWhenPresent(record::getType)
            .set(name).equalToWhenPresent(record::getName)
            .set(delete).equalToWhenPresent(record::getDelete)
            .set(remark).equalToWhenPresent(record::getRemark)
            .set(remark1).equalToWhenPresent(record::getRemark1)
            .set(remark2).equalToWhenPresent(record::getRemark2)
            .set(remark3).equalToWhenPresent(record::getRemark3)
            .set(remark4).equalToWhenPresent(record::getRemark4)
            .set(remark5).equalToWhenPresent(record::getRemark5)
            .set(createtime).equalToWhenPresent(record::getCreatetime)
            .set(updatetime).equalToWhenPresent(record::getUpdatetime)
            .set(createby).equalToWhenPresent(record::getCreateby)
            .set(value).equalToWhenPresent(record::getValue)
            .where(dictionaryid, isEqualTo(record::getDictionaryid))
        );
    }
}*/
