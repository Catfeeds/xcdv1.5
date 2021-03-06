package com.msk.product.bean;

import com.msk.core.entity.PdTcMarket;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by Administrator on 2016/2/23.
 */
@ApiModel(value = "PD141128Param",description = "市场需求注册")
public class PD141128Param extends PdTcMarket {

    @ApiModelProperty(value = "divID获取")
    private String getDivId;

    @ApiModelProperty(value = "message消息提示")
    private String message;

    @ApiModelProperty(value = "产品分类CODE")
    private String classestreeCode;

    /**
     * Getter method for property <tt>classestreeCode</tt>.
     *
     * @return property value of classestreeCode
     */
    public String getClassestreeCode() {
        return classestreeCode;
    }

    /**
     * Setter method for property <tt>classestreeCode</tt>.
     *
     * @param classestreeCode value to be assigned to property classestreeCode
     */
    public void setClassestreeCode(String classestreeCode) {
        this.classestreeCode = classestreeCode;
    }


    /**
     * Getter method for property <tt>message</tt>.
     *
     * @return property value of message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Setter method for property <tt>message</tt>.
     *
     * @param message value to be assigned to property message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Getter method for property <tt>getDivId</tt>.
     *
     * @return property value of getDivId
     */
    public String getGetDivId() {
        return getDivId;
    }

    /**
     * Setter method for property <tt>getDivId</tt>.
     *
     * @param getDivId value to be assigned to property getDivId
     */
    public void setGetDivId(String getDivId) {
        this.getDivId = getDivId;
    }
}

