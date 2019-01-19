package com.huaruan.shop.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table userinfo
 *
 * @mbg.generated do_not_delete_during_merge Sat Jan 19 21:03:42 CST 2019
 */
public class UserInfoDO implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.id
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   名字
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.name
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    private String name;

    /**
     * Database Column Remarks:
     *   用户名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.account
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    private String account;

    /**
     * Database Column Remarks:
     *   密码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.pwd
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    private String pwd;

    /**
     * Database Column Remarks:
     *   头像图片路径
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.headpic
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    private String headpic;

    /**
     * Database Column Remarks:
     *   手机号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.phone
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    private String phone;

    /**
     * Database Column Remarks:
     *   账号属性 1管理员 2学生 3教职工 
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.accountType
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    private String accounttype;

    /**
     * Database Column Remarks:
     *   性别
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.sex
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    private String sex;

    /**
     * Database Column Remarks:
     *   个人描述
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.desc
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    private String desc;

    /**
     * Database Column Remarks:
     *   生成时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.create_time
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   更新时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.update_time
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table userinfo
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.id
     *
     * @return the value of userinfo.id
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.id
     *
     * @param id the value for userinfo.id
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.name
     *
     * @return the value of userinfo.name
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.name
     *
     * @param name the value for userinfo.name
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.account
     *
     * @return the value of userinfo.account
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    public String getAccount() {
        return account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.account
     *
     * @param account the value for userinfo.account
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.pwd
     *
     * @return the value of userinfo.pwd
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.pwd
     *
     * @param pwd the value for userinfo.pwd
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.headpic
     *
     * @return the value of userinfo.headpic
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    public String getHeadpic() {
        return headpic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.headpic
     *
     * @param headpic the value for userinfo.headpic
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    public void setHeadpic(String headpic) {
        this.headpic = headpic == null ? null : headpic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.phone
     *
     * @return the value of userinfo.phone
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.phone
     *
     * @param phone the value for userinfo.phone
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.accountType
     *
     * @return the value of userinfo.accountType
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    public String getAccounttype() {
        return accounttype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.accountType
     *
     * @param accounttype the value for userinfo.accountType
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    public void setAccounttype(String accounttype) {
        this.accounttype = accounttype == null ? null : accounttype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.sex
     *
     * @return the value of userinfo.sex
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.sex
     *
     * @param sex the value for userinfo.sex
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.desc
     *
     * @return the value of userinfo.desc
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    public String getDesc() {
        return desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.desc
     *
     * @param desc the value for userinfo.desc
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.create_time
     *
     * @return the value of userinfo.create_time
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.create_time
     *
     * @param createTime the value for userinfo.create_time
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.update_time
     *
     * @return the value of userinfo.update_time
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.update_time
     *
     * @param updateTime the value for userinfo.update_time
     *
     * @mbg.generated Sat Jan 19 21:03:42 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}