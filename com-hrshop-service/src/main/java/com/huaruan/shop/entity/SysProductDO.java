package com.huaruan.shop.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sys_product
 *
 * @mbg.generated do_not_delete_during_merge Sun Jan 27 17:07:06 CST 2019
 */
public class SysProductDO implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_product.id
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   商品名字
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_product.product_name
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    private String productName;

    /**
     * Database Column Remarks:
     *   价格(单位:分)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_product.product_price
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    private Integer productPrice;

    /**
     * Database Column Remarks:
     *   库存数量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_product.product_num
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    private Integer productNum;

    /**
     * Database Column Remarks:
     *   商品描述
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_product.product_desc
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    private String productDesc;

    /**
     * Database Column Remarks:
     *   商品图片id ,隔开
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_product.product_pic_item
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    private String productPicItem;

    /**
     * Database Column Remarks:
     *   商户id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_product.vendor_id
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    private Long vendorId;

    /**
     * Database Column Remarks:
     *   运费(单位:分)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_product.postage
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    private Integer postage;

    /**
     * Database Column Remarks:
     *   状态 0售罄 1在库 2下架
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_product.status
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    private String status;

    /**
     * Database Column Remarks:
     *   生成时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_product.create_time
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   更新时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_product.update_time
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_product
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_product.id
     *
     * @return the value of sys_product.id
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_product.id
     *
     * @param id the value for sys_product.id
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_product.product_name
     *
     * @return the value of sys_product.product_name
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    public String getProductName() {
        return productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_product.product_name
     *
     * @param productName the value for sys_product.product_name
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_product.product_price
     *
     * @return the value of sys_product.product_price
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    public Integer getProductPrice() {
        return productPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_product.product_price
     *
     * @param productPrice the value for sys_product.product_price
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_product.product_num
     *
     * @return the value of sys_product.product_num
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    public Integer getProductNum() {
        return productNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_product.product_num
     *
     * @param productNum the value for sys_product.product_num
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    public void setProductNum(Integer productNum) {
        this.productNum = productNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_product.product_desc
     *
     * @return the value of sys_product.product_desc
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    public String getProductDesc() {
        return productDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_product.product_desc
     *
     * @param productDesc the value for sys_product.product_desc
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc == null ? null : productDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_product.product_pic_item
     *
     * @return the value of sys_product.product_pic_item
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    public String getProductPicItem() {
        return productPicItem;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_product.product_pic_item
     *
     * @param productPicItem the value for sys_product.product_pic_item
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    public void setProductPicItem(String productPicItem) {
        this.productPicItem = productPicItem == null ? null : productPicItem.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_product.vendor_id
     *
     * @return the value of sys_product.vendor_id
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    public Long getVendorId() {
        return vendorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_product.vendor_id
     *
     * @param vendorId the value for sys_product.vendor_id
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_product.postage
     *
     * @return the value of sys_product.postage
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    public Integer getPostage() {
        return postage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_product.postage
     *
     * @param postage the value for sys_product.postage
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    public void setPostage(Integer postage) {
        this.postage = postage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_product.status
     *
     * @return the value of sys_product.status
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_product.status
     *
     * @param status the value for sys_product.status
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_product.create_time
     *
     * @return the value of sys_product.create_time
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_product.create_time
     *
     * @param createTime the value for sys_product.create_time
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_product.update_time
     *
     * @return the value of sys_product.update_time
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_product.update_time
     *
     * @param updateTime the value for sys_product.update_time
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}