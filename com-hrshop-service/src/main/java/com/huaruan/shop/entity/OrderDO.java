package com.huaruan.shop.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table order
 *
 * @mbg.generated do_not_delete_during_merge Sat Jan 19 21:03:42 CST 2019
 */
public class OrderDO implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.id
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   商户id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.vendorid
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    private Long vendorid;

    /**
     * Database Column Remarks:
     *   用户id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.userid
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    private Long userid;

    /**
     * Database Column Remarks:
     *   商品id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.productid
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    private Long productid;

    /**
     * Database Column Remarks:
     *   商品名字
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.productname
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    private String productname;

    /**
     * Database Column Remarks:
     *   商品金额(单位:分)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.product_cash
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    private Integer productCash;

    /**
     * Database Column Remarks:
     *   商品数量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.product_num
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    private Integer productNum;

    /**
     * Database Column Remarks:
     *   订单状态 1交易成功 2交易关闭 3未付款 4配送中
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.status
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    private String status;

    /**
     * Database Column Remarks:
     *   运费(单位:分)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.postage
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    private Integer postage;

    /**
     * Database Column Remarks:
     *   收货地址
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.adress
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    private String adress;

    /**
     * Database Column Remarks:
     *   收货人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.receiver
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    private String receiver;

    /**
     * Database Column Remarks:
     *   生成时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.create_time
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   更新时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.update_time
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table order
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.id
     *
     * @return the value of order.id
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.id
     *
     * @param id the value for order.id
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.vendorid
     *
     * @return the value of order.vendorid
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    public Long getVendorid() {
        return vendorid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.vendorid
     *
     * @param vendorid the value for order.vendorid
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    public void setVendorid(Long vendorid) {
        this.vendorid = vendorid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.userid
     *
     * @return the value of order.userid
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    public Long getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.userid
     *
     * @param userid the value for order.userid
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.productid
     *
     * @return the value of order.productid
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    public Long getProductid() {
        return productid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.productid
     *
     * @param productid the value for order.productid
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    public void setProductid(Long productid) {
        this.productid = productid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.productname
     *
     * @return the value of order.productname
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    public String getProductname() {
        return productname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.productname
     *
     * @param productname the value for order.productname
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.product_cash
     *
     * @return the value of order.product_cash
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    public Integer getProductCash() {
        return productCash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.product_cash
     *
     * @param productCash the value for order.product_cash
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    public void setProductCash(Integer productCash) {
        this.productCash = productCash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.product_num
     *
     * @return the value of order.product_num
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    public Integer getProductNum() {
        return productNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.product_num
     *
     * @param productNum the value for order.product_num
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    public void setProductNum(Integer productNum) {
        this.productNum = productNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.status
     *
     * @return the value of order.status
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.status
     *
     * @param status the value for order.status
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.postage
     *
     * @return the value of order.postage
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    public Integer getPostage() {
        return postage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.postage
     *
     * @param postage the value for order.postage
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    public void setPostage(Integer postage) {
        this.postage = postage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.adress
     *
     * @return the value of order.adress
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    public String getAdress() {
        return adress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.adress
     *
     * @param adress the value for order.adress
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    public void setAdress(String adress) {
        this.adress = adress == null ? null : adress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.receiver
     *
     * @return the value of order.receiver
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    public String getReceiver() {
        return receiver;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.receiver
     *
     * @param receiver the value for order.receiver
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    public void setReceiver(String receiver) {
        this.receiver = receiver == null ? null : receiver.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.create_time
     *
     * @return the value of order.create_time
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.create_time
     *
     * @param createTime the value for order.create_time
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.update_time
     *
     * @return the value of order.update_time
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.update_time
     *
     * @param updateTime the value for order.update_time
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}