package com.example.mydemo.dao;

import com.example.mydemo.bean.Zdaction;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

public interface ZdactionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zdaction
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zdaction
     *
     * @mbg.generated
     */
    @Insert("insert into zdaction (id, name, textinfo, \n" +
            "      mintime, maxtime, actiontype\n" +
            "      )\n" +
            "    values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, #{textinfo,jdbcType=VARCHAR}, \n" +
            "      #{mintime,jdbcType=INTEGER}, #{maxtime,jdbcType=INTEGER}, #{actiontype,jdbcType=INTEGER}\n" +
            "      )")
    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
    int insert(Zdaction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zdaction
     *
     * @mbg.generated
     */
    @Insert("<script>" +
            "insert into zdaction\n" +
            "    <trim prefix=\"(\" suffix=\")\" suffixOverrides=\",\">\n" +
            "      <if test=\"id != null\">\n" +
            "        id,\n" +
            "      </if>\n" +
            "      <if test=\"name != null\">\n" +
            "        name,\n" +
            "      </if>\n" +
            "      <if test=\"textinfo != null\">\n" +
            "        textinfo,\n" +
            "      </if>\n" +
            "      <if test=\"mintime != null\">\n" +
            "        mintime,\n" +
            "      </if>\n" +
            "      <if test=\"maxtime != null\">\n" +
            "        maxtime,\n" +
            "      </if>\n" +
            "      <if test=\"actiontype != null\">\n" +
            "        actiontype,\n" +
            "      </if>\n" +
            "    </trim>\n" +
            "    <trim prefix=\"values (\" suffix=\")\" suffixOverrides=\",\">\n" +
            "      <if test=\"id != null\">\n" +
            "        #{id,jdbcType=INTEGER},\n" +
            "      </if>\n" +
            "      <if test=\"name != null\">\n" +
            "        #{name,jdbcType=VARCHAR},\n" +
            "      </if>\n" +
            "      <if test=\"textinfo != null\">\n" +
            "        #{textinfo,jdbcType=VARCHAR},\n" +
            "      </if>\n" +
            "      <if test=\"mintime != null\">\n" +
            "        #{mintime,jdbcType=INTEGER},\n" +
            "      </if>\n" +
            "      <if test=\"maxtime != null\">\n" +
            "        #{maxtime,jdbcType=INTEGER},\n" +
            "      </if>\n" +
            "      <if test=\"actiontype != null\">\n" +
            "        #{actiontype,jdbcType=INTEGER},\n" +
            "      </if>\n" +
            "    </trim>" +
            "</script>")
    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
    int insertSelective(Zdaction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zdaction
     *
     * @mbg.generated
     */
    Zdaction selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zdaction
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Zdaction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zdaction
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Zdaction record);
}