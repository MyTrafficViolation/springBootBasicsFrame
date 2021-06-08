package com.example.mydemo.dao;

import com.example.mydemo.bean.Juese;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JueseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table juese
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String jueseid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table juese
     *
     * @mbg.generated
     */
    @Insert("insert into juese (jueseID, name, zhongzu, \n" +
            "      hp, mp, gjl, jueduigjl, \n" +
            "      fyl, jueduifyl, level, \n" +
            "      pinji, maxhp, maxmp, \n" +
            "      maxgjl, maxfyl, maxjueduigjl, \n" +
            "      maxjueduifyl)\n" +
            "    values (#{record.jueseid}, #{record.name}, #{record.zhongzu}, \n" +
            "      #{record.hp}, #{record.mp}, #{record.gjl}, #{record.jueduigjl}, \n" +
            "      #{record.fyl}, #{record.jueduifyl}, #{record.level}, \n" +
            "      #{record.pinji}, #{record.maxhp}, #{record.maxmp}, \n" +
            "      #{record.maxgjl}, #{record.maxfyl}, #{record.maxjueduigjl}, \n" +
            "      #{record.maxjueduifyl})")
    int insert(@Param("record") Juese record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table juese
     *<when test="title != null">
     * @mbg.generated
     */
    @Insert({"<script>insert into juese\n" +
            "    <trim prefix=\"(\" suffix=\")\" suffixOverrides=\",\">\n" +
            "      <if test=\"jueseid != null\">\n" +
            "        jueseID,\n" +
            "      </if>\n" +
            "      <if test=\"name != null\">\n" +
            "        name,\n" +
            "      </if>\n" +
            "      <if test=\"zhongzu != null\">\n" +
            "        zhongzu,\n" +
            "      </if>\n" +
            "      <if test=\"hp != null\">\n" +
            "        hp,\n" +
            "      </if>\n" +
            "      <if test=\"mp != null\">\n" +
            "        mp,\n" +
            "      </if>\n" +
            "      <if test=\"gjl != null\">\n" +
            "        gjl,\n" +
            "      </if>\n" +
            "      <if test=\"jueduigjl != null\">\n" +
            "        jueduigjl,\n" +
            "      </if>\n" +
            "      <if test=\"fyl != null\">\n" +
            "        fyl,\n" +
            "      </if>\n" +
            "      <if test=\"jueduifyl != null\">\n" +
            "        jueduifyl,\n" +
            "      </if>\n" +
            "      <if test=\"level != null\">\n" +
            "        level,\n" +
            "      </if>\n" +
            "      <if test=\"pinji != null\">\n" +
            "        pinji,\n" +
            "      </if>\n" +
            "      <if test=\"maxhp != null\">\n" +
            "        maxhp,\n" +
            "      </if>\n" +
            "      <if test=\"maxmp != null\">\n" +
            "        maxmp,\n" +
            "      </if>\n" +
            "      <if test=\"maxgjl != null\">\n" +
            "        maxgjl,\n" +
            "      </if>\n" +
            "      <if test=\"maxfyl != null\">\n" +
            "        maxfyl,\n" +
            "      </if>\n" +
            "      <if test=\"maxjueduigjl != null\">\n" +
            "        maxjueduigjl,\n" +
            "      </if>\n" +
            "      <if test=\"maxjueduifyl != null\">\n" +
            "        maxjueduifyl,\n" +
            "      </if>\n" +
            "    </trim>\n" +
            "    <trim prefix=\"values (\" suffix=\")\" suffixOverrides=\",\">\n" +
            "      <if test=\"jueseid != null\">\n" +
            "        #{jueseid,jdbcType=VARCHAR},\n" +
            "      </if>\n" +
            "      <if test=\"name != null\">\n" +
            "        #{name,jdbcType=VARCHAR},\n" +
            "      </if>\n" +
            "      <if test=\"zhongzu != null\">\n" +
            "        #{zhongzu,jdbcType=INTEGER},\n" +
            "      </if>\n" +
            "      <if test=\"hp != null\">\n" +
            "        #{hp,jdbcType=BIGINT},\n" +
            "      </if>\n" +
            "      <if test=\"mp != null\">\n" +
            "        #{mp,jdbcType=BIGINT},\n" +
            "      </if>\n" +
            "      <if test=\"gjl != null\">\n" +
            "        #{gjl,jdbcType=BIGINT},\n" +
            "      </if>\n" +
            "      <if test=\"jueduigjl != null\">\n" +
            "        #{jueduigjl,jdbcType=BIGINT},\n" +
            "      </if>\n" +
            "      <if test=\"fyl != null\">\n" +
            "        #{fyl,jdbcType=BIGINT},\n" +
            "      </if>\n" +
            "      <if test=\"jueduifyl != null\">\n" +
            "        #{jueduifyl,jdbcType=BIGINT},\n" +
            "      </if>\n" +
            "      <if test=\"level != null\">\n" +
            "        #{level,jdbcType=INTEGER},\n" +
            "      </if>\n" +
            "      <if test=\"pinji != null\">\n" +
            "        #{pinji,jdbcType=INTEGER},\n" +
            "      </if>\n" +
            "      <if test=\"maxhp != null\">\n" +
            "        #{maxhp,jdbcType=BIGINT},\n" +
            "      </if>\n" +
            "      <if test=\"maxmp != null\">\n" +
            "        #{maxmp,jdbcType=BIGINT},\n" +
            "      </if>\n" +
            "      <if test=\"maxgjl != null\">\n" +
            "        #{maxgjl,jdbcType=BIGINT},\n" +
            "      </if>\n" +
            "      <if test=\"maxfyl != null\">\n" +
            "        #{maxfyl,jdbcType=BIGINT},\n" +
            "      </if>\n" +
            "      <if test=\"maxjueduigjl != null\">\n" +
            "        #{maxjueduigjl,jdbcType=BIGINT},\n" +
            "      </if>\n" +
            "      <if test=\"maxjueduifyl != null\">\n" +
            "        #{maxjueduifyl,jdbcType=BIGINT},\n" +
            "      </if>\n" +
            "    </trim></script>"})
    int insertSelective(Juese record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table juese
     *
     * @mbg.generated
     */
    @Select("<script>" +
            "select \n" +
            "    * " +
            "    from juese\n" +
            "    where jueseID = #{jueseid,jdbcType=VARCHAR}" +
            "</script>")
    @Results({
            @Result(property = "juesejinengs", column = "jueseid",
                    many = @Many(select = "com.example.mydemo.dao.JuesejinengMapper.selectByJueseId"))
    })
    Juese selectByPrimaryKey(String jueseid);

    @Select("select  *  from juese")
    List<Juese> selectAll();


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table juese
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Juese record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table juese
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Juese record);
}