package com.example.mydemo.bean;

import com.example.mydemo.unitl.MyUuid;

public class Zdaction {
    public Zdaction(String name) {
        this.name = name;
        this.textinfo = name;
        this.mintime = 1;
        this.maxtime = 1;
    }

    public Zdaction(String name, String textinfo, Integer mintime, Integer maxtime) {
        this.name = name;
        this.textinfo = textinfo;
        this.mintime = mintime;
        this.maxtime = maxtime;
    }

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zdaction.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zdaction.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zdaction.textinfo
     *
     * @mbg.generated
     */
    private String textinfo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zdaction.mintime
     *
     * @mbg.generated
     */
    private Integer mintime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column zdaction.maxtime
     *
     * @mbg.generated
     */
    private Integer maxtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zdaction.id
     *
     * @return the value of zdaction.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zdaction.id
     *
     * @param id the value for zdaction.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zdaction.name
     *
     * @return the value of zdaction.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zdaction.name
     *
     * @param name the value for zdaction.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zdaction.textinfo
     *
     * @return the value of zdaction.textinfo
     *
     * @mbg.generated
     */
    public String getTextinfo() {
        return textinfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zdaction.textinfo
     *
     * @param textinfo the value for zdaction.textinfo
     *
     * @mbg.generated
     */
    public void setTextinfo(String textinfo) {
        this.textinfo = textinfo == null ? null : textinfo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zdaction.mintime
     *
     * @return the value of zdaction.mintime
     *
     * @mbg.generated
     */
    public Integer getMintime() {
        return mintime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zdaction.mintime
     *
     * @param mintime the value for zdaction.mintime
     *
     * @mbg.generated
     */
    public void setMintime(Integer mintime) {
        this.mintime = mintime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column zdaction.maxtime
     *
     * @return the value of zdaction.maxtime
     *
     * @mbg.generated
     */
    public Integer getMaxtime() {
        return maxtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column zdaction.maxtime
     *
     * @param maxtime the value for zdaction.maxtime
     *
     * @mbg.generated
     */
    public void setMaxtime(Integer maxtime) {
        this.maxtime = maxtime;
    }
}