package com.huaruan.shop.bo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sys_user
 *
 * @mbg.generated do_not_delete_during_merge Sun Jan 27 16:49:22 CST 2019
 */
public class SysUserBO implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.id
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   名字
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.realname
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    private String realname;

    /**
     * Database Column Remarks:
     *   用户名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.username
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    private String username;

    /**
     * Database Column Remarks:
     *   密码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.password
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    private String password;

    /**
     * Database Column Remarks:
     *   头像图片路径
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.pic_id
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    private String picId;

    /**
     * Database Column Remarks:
     *   手机号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.phone
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    private String phone;

    /**
     * Database Column Remarks:
     *   角色id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.role_id
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    private String roleId;

    /**
     * Database Column Remarks:
     *   性别
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.sex
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    private String sex;

    /**
     * Database Column Remarks:
     *   个人描述
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.desc
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    private String desc;

    /**
     * Database Column Remarks:
     *   生成时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.create_time
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   更新时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.update_time
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_user
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.id
     *
     * @return the value of sys_user.id
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.id
     *
     * @param id the value for sys_user.id
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.realname
     *
     * @return the value of sys_user.realname
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    public String getRealname() {
        return realname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.realname
     *
     * @param realname the value for sys_user.realname
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.username
     *
     * @return the value of sys_user.username
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.username
     *
     * @param username the value for sys_user.username
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.password
     *
     * @return the value of sys_user.password
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.password
     *
     * @param password the value for sys_user.password
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.pic_id
     *
     * @return the value of sys_user.pic_id
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    public String getPicId() {
        return picId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.pic_id
     *
     * @param picId the value for sys_user.pic_id
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    public void setPicId(String picId) {
        this.picId = picId == null ? null : picId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.phone
     *
     * @return the value of sys_user.phone
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.phone
     *
     * @param phone the value for sys_user.phone
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.role_id
     *
     * @return the value of sys_user.role_id
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.role_id
     *
     * @param roleId the value for sys_user.role_id
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.sex
     *
     * @return the value of sys_user.sex
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.sex
     *
     * @param sex the value for sys_user.sex
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.desc
     *
     * @return the value of sys_user.desc
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    public String getDesc() {
        return desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.desc
     *
     * @param desc the value for sys_user.desc
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.create_time
     *
     * @return the value of sys_user.create_time
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.create_time
     *
     * @param createTime the value for sys_user.create_time
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.update_time
     *
     * @return the value of sys_user.update_time
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.update_time
     *
     * @param updateTime the value for sys_user.update_time
     *
     * @mbg.generated Sun Jan 27 16:49:22 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}