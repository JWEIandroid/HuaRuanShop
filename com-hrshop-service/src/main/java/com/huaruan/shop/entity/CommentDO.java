package com.huaruan.shop.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table comment
 *
 * @mbg.generated do_not_delete_during_merge Sun Jan 27 17:07:06 CST 2019
 */
public class CommentDO implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.id
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   商户id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.vendor_id
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    private Long vendorId;

    /**
     * Database Column Remarks:
     *   用户id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.user_id
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    private Long userId;

    /**
     * Database Column Remarks:
     *   商品id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.product_id
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    private Long productId;

    /**
     * Database Column Remarks:
     *   评论内容
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.content
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    private String content;

    /**
     * Database Column Remarks:
     *   发送人 1商户 2用户
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.type
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    private String type;

    /**
     * Database Column Remarks:
     *   生成时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.create_time
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   更新时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.update_time
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table comment
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.id
     *
     * @return the value of comment.id
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.id
     *
     * @param id the value for comment.id
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.vendor_id
     *
     * @return the value of comment.vendor_id
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    public Long getVendorId() {
        return vendorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.vendor_id
     *
     * @param vendorId the value for comment.vendor_id
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.user_id
     *
     * @return the value of comment.user_id
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.user_id
     *
     * @param userId the value for comment.user_id
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.product_id
     *
     * @return the value of comment.product_id
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.product_id
     *
     * @param productId the value for comment.product_id
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.content
     *
     * @return the value of comment.content
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.content
     *
     * @param content the value for comment.content
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.type
     *
     * @return the value of comment.type
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.type
     *
     * @param type the value for comment.type
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.create_time
     *
     * @return the value of comment.create_time
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.create_time
     *
     * @param createTime the value for comment.create_time
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.update_time
     *
     * @return the value of comment.update_time
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.update_time
     *
     * @param updateTime the value for comment.update_time
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}