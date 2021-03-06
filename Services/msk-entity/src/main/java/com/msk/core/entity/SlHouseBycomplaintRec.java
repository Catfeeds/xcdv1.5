/*
 * 2014/09/23 自动生成 新規作成
 *
 * (c) 江苏润和.
 */
package com.msk.core.entity;
/**
 * <p>表sl_house_bycomplaint_rec对应的SlHouseBycomplaintRec</p>
 *
 * @author 自动生成
 * @version 1.00
 */
public class SlHouseBycomplaintRec extends BaseEntity{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    /** 投诉ID */
    private Long complainId;
    /** SL_CODE */
    private String slCode;
    /** HOUSE_CODE */
    private String houseCode;
    /** 买家ID */
    private String byId;
    /** 沟通日期 */
    private java.util.Date complainDate;
    /** 沟通时长 */
    private String telCostTime;
    /** 投诉内容 */
    private String complainContent;
    /** 客户需求 */
    private String pdFeatureCode;
    /** 问题沟通 */
    private String problemContent;
    /** 基本信息修正 */
    private String basicInfoCorrect;
    /** Column_19 */
    private String column19;
    /**
     * <p>默认构造函数</p>
     */
    public SlHouseBycomplaintRec() {

    }

    /**
     * <p>投诉ID</p>
     *
     * @return the 投诉ID
     */
    public Long getComplainId() {
        return complainId;
    }

    /**
     * <p>投诉ID</p>
     *
     * @param complainId 投诉ID
     */
    public void setComplainId(Long complainId) {
        this.complainId = complainId;
    }

    /**
     * <p>SL_CODE</p>
     *
     * @return the SL_CODE
     */
    public String getSlCode() {
        return slCode;
    }

    /**
     * <p>SL_CODE</p>
     *
     * @param slCode SL_CODE
     */
    public void setSlCode(String slCode) {
        this.slCode = slCode;
    }

    /**
     * <p>HOUSE_CODE</p>
     *
     * @return the HOUSE_CODE
     */
    public String getHouseCode() {
        return houseCode;
    }

    /**
     * <p>HOUSE_CODE</p>
     *
     * @param houseCode HOUSE_CODE
     */
    public void setHouseCode(String houseCode) {
        this.houseCode = houseCode;
    }

    /**
     * <p>买家ID</p>
     *
     * @return the 买家ID
     */
    public String getById() {
        return byId;
    }

    /**
     * <p>买家ID</p>
     *
     * @param byId 买家ID
     */
    public void setById(String byId) {
        this.byId = byId;
    }

    /**
     * <p>沟通日期</p>
     *
     * @return the 沟通日期
     */
    public java.util.Date getComplainDate() {
        return complainDate;
    }

    /**
     * <p>沟通日期</p>
     *
     * @param complainDate 沟通日期
     */
    public void setComplainDate(java.util.Date complainDate) {
        this.complainDate = complainDate;
    }

    /**
     * <p>沟通时长</p>
     *
     * @return the 沟通时长
     */
    public String getTelCostTime() {
        return telCostTime;
    }

    /**
     * <p>沟通时长</p>
     *
     * @param telCostTime 沟通时长
     */
    public void setTelCostTime(String telCostTime) {
        this.telCostTime = telCostTime;
    }

    /**
     * <p>投诉内容</p>
     *
     * @return the 投诉内容
     */
    public String getComplainContent() {
        return complainContent;
    }

    /**
     * <p>投诉内容</p>
     *
     * @param complainContent 投诉内容
     */
    public void setComplainContent(String complainContent) {
        this.complainContent = complainContent;
    }

    /**
     * <p>客户需求</p>
     *
     * @return the 客户需求
     */
    public String getPdFeatureCode() {
        return pdFeatureCode;
    }

    /**
     * <p>客户需求</p>
     *
     * @param pdFeatureCode 客户需求
     */
    public void setPdFeatureCode(String pdFeatureCode) {
        this.pdFeatureCode = pdFeatureCode;
    }

    /**
     * <p>问题沟通</p>
     *
     * @return the 问题沟通
     */
    public String getProblemContent() {
        return problemContent;
    }

    /**
     * <p>问题沟通</p>
     *
     * @param problemContent 问题沟通
     */
    public void setProblemContent(String problemContent) {
        this.problemContent = problemContent;
    }

    /**
     * <p>基本信息修正</p>
     *
     * @return the 基本信息修正
     */
    public String getBasicInfoCorrect() {
        return basicInfoCorrect;
    }

    /**
     * <p>基本信息修正</p>
     *
     * @param basicInfoCorrect 基本信息修正
     */
    public void setBasicInfoCorrect(String basicInfoCorrect) {
        this.basicInfoCorrect = basicInfoCorrect;
    }

    /**
     * <p>Column_19</p>
     *
     * @return the Column_19
     */
    public String getColumn19() {
        return column19;
    }

    /**
     * <p>Column_19</p>
     *
     * @param column19 Column_19
     */
    public void setColumn19(String column19) {
        this.column19 = column19;
    }

}
