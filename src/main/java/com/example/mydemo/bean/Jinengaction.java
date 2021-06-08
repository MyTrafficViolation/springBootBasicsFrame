package com.example.mydemo.bean;

import java.util.HashSet;
import java.util.Set;

public class Jinengaction {
    public Jinengaction() {
        super();
    }
    public Jinengaction(String juesejinengid, Integer zdactionid) {
        this.juesejinengid = juesejinengid;
        this.zdactionid = zdactionid;
    }

    public Set<Zdaction> getZdactions() {
        return zdactions;
    }

    public void setZdactions(Set<Zdaction> zdactions) {
        this.zdactions = zdactions;
    }

    private Set<Zdaction> zdactions = new HashSet<>();

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jinengaction.juesejinengid
     *
     * @mbg.generated
     */
    private String juesejinengid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jinengaction.zdactionid
     *
     * @mbg.generated
     */
    private Integer zdactionid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jinengaction.juesejinengid
     *
     * @return the value of jinengaction.juesejinengid
     *
     * @mbg.generated
     */
    public String getJuesejinengid() {
        return juesejinengid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jinengaction.juesejinengid
     *
     * @param juesejinengid the value for jinengaction.juesejinengid
     *
     * @mbg.generated
     */
    public void setJuesejinengid(String juesejinengid) {
        this.juesejinengid = juesejinengid == null ? null : juesejinengid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jinengaction.zdactionid
     *
     * @return the value of jinengaction.zdactionid
     *
     * @mbg.generated
     */
    public Integer getZdactionid() {
        return zdactionid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jinengaction.zdactionid
     *
     * @param zdactionid the value for jinengaction.zdactionid
     *
     * @mbg.generated
     */
    public void setZdactionid(Integer zdactionid) {
        this.zdactionid = zdactionid;
    }
}