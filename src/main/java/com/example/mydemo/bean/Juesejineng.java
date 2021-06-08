package com.example.mydemo.bean;

import com.example.mydemo.unitl.MyUuid;

import java.util.HashSet;
import java.util.Set;

public class Juesejineng {
    public Juesejineng() {
        super();
    }
    public Juesejineng(String jueseid) {
        this.jnid = MyUuid.getUuid();
        this.jueseid = jueseid;
    }

    public Juesejineng(String jueseid,int jinengid) {
        this.jnid = MyUuid.getUuid();
        this.jueseid = jueseid;
        this.jinengid = jinengid;
    }

    public Juesejineng(String jueseid ,Jineng jineng) {

        this.jnid = MyUuid.getUuid();
        this.jueseid = jueseid;
        this.jinengid = jineng.getId();
        this.hp = jineng.getHp();
        this.mp = jineng.getMp();
        this.gjl = jineng.getGjl();
        this.fyl = jineng.getFyl();
        this.jueduigjl = jineng.getJueduigjl();
        this.jueduifyl = jineng.getJueduifyl();
        this.maxhp = jineng.getMaxhp();
        this.maxmp = jineng.getMaxmp();
        this.maxgjl = jineng.getMaxgjl();
        this.maxfyl = jineng.getMaxfyl();
        this.maxjueduigjl = jineng.getMaxjueduigjl();
        this.maxjueduifyl = maxjueduifyl;
        this.xiaoguoleixing = xiaoguoleixing;
        this.leixing = leixing;
        this.needhp = needhp;
        this.needmp = needmp;
        this.needleixing = needleixing;
        this.name = name;
        this.level = level;
        this.zhongzu = zhongzu;
        this.shuxing = shuxing;
    }

    public Juesejineng( String jueseid, Integer jinengid, Long hp, Long mp, Long gjl, Long fyl, Long jueduigjl, Long jueduifyl, Long maxhp, Long maxmp, Long maxgjl, Long maxfyl, Long maxjueduigjl, Long maxjueduifyl, Integer xiaoguoleixing, Integer leixing, Long needhp, Long needmp, Integer needleixing, String name, Integer level, Integer zhongzu, Integer shuxing) {
        this.jnid = MyUuid.getUuid();
        this.jueseid = jueseid;
        this.jinengid = jinengid;
        this.hp = hp;
        this.mp = mp;
        this.gjl = gjl;
        this.fyl = fyl;
        this.jueduigjl = jueduigjl;
        this.jueduifyl = jueduifyl;
        this.maxhp = maxhp;
        this.maxmp = maxmp;
        this.maxgjl = maxgjl;
        this.maxfyl = maxfyl;
        this.maxjueduigjl = maxjueduigjl;
        this.maxjueduifyl = maxjueduifyl;
        this.xiaoguoleixing = xiaoguoleixing;
        this.leixing = leixing;
        this.needhp = needhp;
        this.needmp = needmp;
        this.needleixing = needleixing;
        this.name = name;
        this.level = level;
        this.zhongzu = zhongzu;
        this.shuxing = shuxing;
    }

    public Set<Jinengaction> getJinengactions() {
        return jinengactions;
    }

    public void setJinengactions(Set<Jinengaction> jinengactions) {
        this.jinengactions = jinengactions;
    }

    //关联表-1对多
    private Set<Jinengaction> jinengactions = new HashSet<>();

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column juesejineng.jnID
     *
     * @mbg.generated
     */
    private String jnid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column juesejineng.jueseID
     *
     * @mbg.generated
     */
    private String jueseid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column juesejineng.jinengID
     *
     * @mbg.generated
     */
    private Integer jinengid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column juesejineng.hp
     *
     * @mbg.generated
     */
    private Long hp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column juesejineng.mp
     *
     * @mbg.generated
     */
    private Long mp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column juesejineng.gjl
     *
     * @mbg.generated
     */
    private Long gjl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column juesejineng.fyl
     *
     * @mbg.generated
     */
    private Long fyl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column juesejineng.jueduigjl
     *
     * @mbg.generated
     */
    private Long jueduigjl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column juesejineng.jueduifyl
     *
     * @mbg.generated
     */
    private Long jueduifyl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column juesejineng.maxhp
     *
     * @mbg.generated
     */
    private Long maxhp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column juesejineng.maxmp
     *
     * @mbg.generated
     */
    private Long maxmp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column juesejineng.maxgjl
     *
     * @mbg.generated
     */
    private Long maxgjl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column juesejineng.maxfyl
     *
     * @mbg.generated
     */
    private Long maxfyl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column juesejineng.maxjueduigjl
     *
     * @mbg.generated
     */
    private Long maxjueduigjl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column juesejineng.maxjueduifyl
     *
     * @mbg.generated
     */
    private Long maxjueduifyl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column juesejineng.xiaoguoleixing
     *
     * @mbg.generated
     */
    private Integer xiaoguoleixing;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column juesejineng.leixing
     *
     * @mbg.generated
     */
    private Integer leixing;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column juesejineng.needhp
     *
     * @mbg.generated
     */
    private Long needhp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column juesejineng.needmp
     *
     * @mbg.generated
     */
    private Long needmp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column juesejineng.needleixing
     *
     * @mbg.generated
     */
    private Integer needleixing;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column juesejineng.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column juesejineng.level
     *
     * @mbg.generated
     */
    private Integer level;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column juesejineng.zhongzu
     *
     * @mbg.generated
     */
    private Integer zhongzu;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column juesejineng.shuxing
     *
     * @mbg.generated
     */
    private Integer shuxing;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column juesejineng.jnID
     *
     * @return the value of juesejineng.jnID
     *
     * @mbg.generated
     */
    public String getJnid() {
        return jnid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column juesejineng.jnID
     *
     * @param jnid the value for juesejineng.jnID
     *
     * @mbg.generated
     */
    public void setJnid(String jnid) {
        this.jnid = jnid == null ? null : jnid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column juesejineng.jueseID
     *
     * @return the value of juesejineng.jueseID
     *
     * @mbg.generated
     */
    public String getJueseid() {
        return jueseid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column juesejineng.jueseID
     *
     * @param jueseid the value for juesejineng.jueseID
     *
     * @mbg.generated
     */
    public void setJueseid(String jueseid) {
        this.jueseid = jueseid == null ? null : jueseid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column juesejineng.jinengID
     *
     * @return the value of juesejineng.jinengID
     *
     * @mbg.generated
     */
    public Integer getJinengid() {
        return jinengid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column juesejineng.jinengID
     *
     * @param jinengid the value for juesejineng.jinengID
     *
     * @mbg.generated
     */
    public void setJinengid(Integer jinengid) {
        this.jinengid = jinengid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column juesejineng.hp
     *
     * @return the value of juesejineng.hp
     *
     * @mbg.generated
     */
    public Long getHp() {
        return hp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column juesejineng.hp
     *
     * @param hp the value for juesejineng.hp
     *
     * @mbg.generated
     */
    public void setHp(Long hp) {
        this.hp = hp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column juesejineng.mp
     *
     * @return the value of juesejineng.mp
     *
     * @mbg.generated
     */
    public Long getMp() {
        return mp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column juesejineng.mp
     *
     * @param mp the value for juesejineng.mp
     *
     * @mbg.generated
     */
    public void setMp(Long mp) {
        this.mp = mp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column juesejineng.gjl
     *
     * @return the value of juesejineng.gjl
     *
     * @mbg.generated
     */
    public Long getGjl() {
        return gjl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column juesejineng.gjl
     *
     * @param gjl the value for juesejineng.gjl
     *
     * @mbg.generated
     */
    public void setGjl(Long gjl) {
        this.gjl = gjl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column juesejineng.fyl
     *
     * @return the value of juesejineng.fyl
     *
     * @mbg.generated
     */
    public Long getFyl() {
        return fyl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column juesejineng.fyl
     *
     * @param fyl the value for juesejineng.fyl
     *
     * @mbg.generated
     */
    public void setFyl(Long fyl) {
        this.fyl = fyl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column juesejineng.jueduigjl
     *
     * @return the value of juesejineng.jueduigjl
     *
     * @mbg.generated
     */
    public Long getJueduigjl() {
        return jueduigjl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column juesejineng.jueduigjl
     *
     * @param jueduigjl the value for juesejineng.jueduigjl
     *
     * @mbg.generated
     */
    public void setJueduigjl(Long jueduigjl) {
        this.jueduigjl = jueduigjl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column juesejineng.jueduifyl
     *
     * @return the value of juesejineng.jueduifyl
     *
     * @mbg.generated
     */
    public Long getJueduifyl() {
        return jueduifyl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column juesejineng.jueduifyl
     *
     * @param jueduifyl the value for juesejineng.jueduifyl
     *
     * @mbg.generated
     */
    public void setJueduifyl(Long jueduifyl) {
        this.jueduifyl = jueduifyl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column juesejineng.maxhp
     *
     * @return the value of juesejineng.maxhp
     *
     * @mbg.generated
     */
    public Long getMaxhp() {
        return maxhp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column juesejineng.maxhp
     *
     * @param maxhp the value for juesejineng.maxhp
     *
     * @mbg.generated
     */
    public void setMaxhp(Long maxhp) {
        this.maxhp = maxhp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column juesejineng.maxmp
     *
     * @return the value of juesejineng.maxmp
     *
     * @mbg.generated
     */
    public Long getMaxmp() {
        return maxmp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column juesejineng.maxmp
     *
     * @param maxmp the value for juesejineng.maxmp
     *
     * @mbg.generated
     */
    public void setMaxmp(Long maxmp) {
        this.maxmp = maxmp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column juesejineng.maxgjl
     *
     * @return the value of juesejineng.maxgjl
     *
     * @mbg.generated
     */
    public Long getMaxgjl() {
        return maxgjl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column juesejineng.maxgjl
     *
     * @param maxgjl the value for juesejineng.maxgjl
     *
     * @mbg.generated
     */
    public void setMaxgjl(Long maxgjl) {
        this.maxgjl = maxgjl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column juesejineng.maxfyl
     *
     * @return the value of juesejineng.maxfyl
     *
     * @mbg.generated
     */
    public Long getMaxfyl() {
        return maxfyl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column juesejineng.maxfyl
     *
     * @param maxfyl the value for juesejineng.maxfyl
     *
     * @mbg.generated
     */
    public void setMaxfyl(Long maxfyl) {
        this.maxfyl = maxfyl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column juesejineng.maxjueduigjl
     *
     * @return the value of juesejineng.maxjueduigjl
     *
     * @mbg.generated
     */
    public Long getMaxjueduigjl() {
        return maxjueduigjl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column juesejineng.maxjueduigjl
     *
     * @param maxjueduigjl the value for juesejineng.maxjueduigjl
     *
     * @mbg.generated
     */
    public void setMaxjueduigjl(Long maxjueduigjl) {
        this.maxjueduigjl = maxjueduigjl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column juesejineng.maxjueduifyl
     *
     * @return the value of juesejineng.maxjueduifyl
     *
     * @mbg.generated
     */
    public Long getMaxjueduifyl() {
        return maxjueduifyl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column juesejineng.maxjueduifyl
     *
     * @param maxjueduifyl the value for juesejineng.maxjueduifyl
     *
     * @mbg.generated
     */
    public void setMaxjueduifyl(Long maxjueduifyl) {
        this.maxjueduifyl = maxjueduifyl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column juesejineng.xiaoguoleixing
     *
     * @return the value of juesejineng.xiaoguoleixing
     *
     * @mbg.generated
     */
    public Integer getXiaoguoleixing() {
        return xiaoguoleixing;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column juesejineng.xiaoguoleixing
     *
     * @param xiaoguoleixing the value for juesejineng.xiaoguoleixing
     *
     * @mbg.generated
     */
    public void setXiaoguoleixing(Integer xiaoguoleixing) {
        this.xiaoguoleixing = xiaoguoleixing;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column juesejineng.leixing
     *
     * @return the value of juesejineng.leixing
     *
     * @mbg.generated
     */
    public Integer getLeixing() {
        return leixing;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column juesejineng.leixing
     *
     * @param leixing the value for juesejineng.leixing
     *
     * @mbg.generated
     */
    public void setLeixing(Integer leixing) {
        this.leixing = leixing;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column juesejineng.needhp
     *
     * @return the value of juesejineng.needhp
     *
     * @mbg.generated
     */
    public Long getNeedhp() {
        return needhp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column juesejineng.needhp
     *
     * @param needhp the value for juesejineng.needhp
     *
     * @mbg.generated
     */
    public void setNeedhp(Long needhp) {
        this.needhp = needhp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column juesejineng.needmp
     *
     * @return the value of juesejineng.needmp
     *
     * @mbg.generated
     */
    public Long getNeedmp() {
        return needmp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column juesejineng.needmp
     *
     * @param needmp the value for juesejineng.needmp
     *
     * @mbg.generated
     */
    public void setNeedmp(Long needmp) {
        this.needmp = needmp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column juesejineng.needleixing
     *
     * @return the value of juesejineng.needleixing
     *
     * @mbg.generated
     */
    public Integer getNeedleixing() {
        return needleixing;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column juesejineng.needleixing
     *
     * @param needleixing the value for juesejineng.needleixing
     *
     * @mbg.generated
     */
    public void setNeedleixing(Integer needleixing) {
        this.needleixing = needleixing;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column juesejineng.name
     *
     * @return the value of juesejineng.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column juesejineng.name
     *
     * @param name the value for juesejineng.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column juesejineng.level
     *
     * @return the value of juesejineng.level
     *
     * @mbg.generated
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column juesejineng.level
     *
     * @param level the value for juesejineng.level
     *
     * @mbg.generated
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column juesejineng.zhongzu
     *
     * @return the value of juesejineng.zhongzu
     *
     * @mbg.generated
     */
    public Integer getZhongzu() {
        return zhongzu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column juesejineng.zhongzu
     *
     * @param zhongzu the value for juesejineng.zhongzu
     *
     * @mbg.generated
     */
    public void setZhongzu(Integer zhongzu) {
        this.zhongzu = zhongzu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column juesejineng.shuxing
     *
     * @return the value of juesejineng.shuxing
     *
     * @mbg.generated
     */
    public Integer getShuxing() {
        return shuxing;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column juesejineng.shuxing
     *
     * @param shuxing the value for juesejineng.shuxing
     *
     * @mbg.generated
     */
    public void setShuxing(Integer shuxing) {
        this.shuxing = shuxing;
    }
}