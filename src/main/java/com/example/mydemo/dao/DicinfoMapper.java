package com.example.mydemo.dao;

import com.example.mydemo.bean.Dicinfo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface DicinfoMapper {
    @Insert("insert into herodictionary (mod, name)\n" +
            "    values (#{record.mod,jdbcType=VARCHAR}, #{record.name,jdbcType=VARCHAR})")
    int insert(@Param("record") Dicinfo record);

    //查询字典
    @Select("SELECT * from dicinfo where usestatus = 0")
    @Results({
            @Result(property = "herodictionaries", column = "mod",
                    many = @Many(select = "com.example.mydemo.dao.HerodictionaryMapper.queryByModUse"))
    })
    Set<Dicinfo> queryAll();

    //查询字典
    @Select("SELECT * from dicinfo where usestatus = 0 and `mod` = #{mod,jdbcType=VARCHAR}")
    @Results({
            @Result(property = "herodictionaries", column = "mod",
                    many = @Many(select = "com.example.mydemo.dao.HerodictionaryMapper.queryByModUse"))
    })
    Dicinfo queryByMod(String mod);
}
