package com.huaruan.shop.bo;

import com.huaruan.shop.model.UserEnum;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table user_vendor_conversation
 *
 * @mbg.generated do_not_delete_during_merge Sun Jan 27 16:49:22 CST 2019
 */
public class UserVendorConversationBO implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_vendor_conversation.id
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   商户id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_vendor_conversation.vendor_id
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    private Long vendorId;

    /**
     * Database Column Remarks:
     *   用户id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_vendor_conversation.user_id
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    private Long userId;

    /**
     * Database Column Remarks:
     *   对话内容
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_vendor_conversation.content
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    private Long content;

    /**
     * Database Column Remarks:
     *   发送人 1商户 2用户
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_vendor_conversation.sender_type
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    private UserEnum senderType;

    /**
     * Database Column Remarks:
     *   生成时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_vendor_conversation.create_time
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   更新时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_vendor_conversation.update_time
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_vendor_conversation
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_vendor_conversation.id
     *
     * @return the value of user_vendor_conversation.id
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_vendor_conversation.id
     *
     * @param id the value for user_vendor_conversation.id
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_vendor_conversation.vendor_id
     *
     * @return the value of user_vendor_conversation.vendor_id
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    public Long getVendorId() {
        return vendorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_vendor_conversation.vendor_id
     *
     * @param vendorId the value for user_vendor_conversation.vendor_id
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_vendor_conversation.user_id
     *
     * @return the value of user_vendor_conversation.user_id
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_vendor_conversation.user_id
     *
     * @param userId the value for user_vendor_conversation.user_id
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_vendor_conversation.content
     *
     * @return the value of user_vendor_conversation.content
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    public Long getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_vendor_conversation.content
     *
     * @param content the value for user_vendor_conversation.content
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    public void setContent(Long content) {
        this.content = content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_vendor_conversation.sender_type
     *
     * @return the value of user_vendor_conversation.sender_type
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    public UserEnum getSenderType() {
        return senderType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_vendor_conversation.sender_type
     *
     * @param senderType the value for user_vendor_conversation.sender_type
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    public void setSenderType(UserEnum senderType) {
        this.senderType = senderType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_vendor_conversation.create_time
     *
     * @return the value of user_vendor_conversation.create_time
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_vendor_conversation.create_time
     *
     * @param createTime the value for user_vendor_conversation.create_time
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_vendor_conversation.update_time
     *
     * @return the value of user_vendor_conversation.update_time
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_vendor_conversation.update_time
     *
     * @param updateTime the value for user_vendor_conversation.update_time
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}