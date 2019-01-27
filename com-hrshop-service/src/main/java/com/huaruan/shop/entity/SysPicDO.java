package com.huaruan.shop.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sys_pic
 *
 * @mbg.generated do_not_delete_during_merge Sun Jan 27 17:07:06 CST 2019
 */
public class SysPicDO implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_pic.id
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   路径
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_pic.path
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    private String path;

    /**
     * Database Column Remarks:
     *   生成时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_pic.create_time
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   更新时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_pic.update_time
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_pic
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_pic.id
     *
     * @return the value of sys_pic.id
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_pic.id
     *
     * @param id the value for sys_pic.id
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_pic.path
     *
     * @return the value of sys_pic.path
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    public String getPath() {
        return path;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_pic.path
     *
     * @param path the value for sys_pic.path
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_pic.create_time
     *
     * @return the value of sys_pic.create_time
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_pic.create_time
     *
     * @param createTime the value for sys_pic.create_time
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_pic.update_time
     *
     * @return the value of sys_pic.update_time
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_pic.update_time
     *
     * @param updateTime the value for sys_pic.update_time
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}