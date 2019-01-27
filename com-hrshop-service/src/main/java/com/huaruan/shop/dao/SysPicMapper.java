package com.huaruan.shop.dao;

import com.huaruan.shop.entity.SysPicDO;
import com.huaruan.shop.entity.SysPicDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;

public interface SysPicMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_pic
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    long countByExample(SysPicDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_pic
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    int deleteByExample(SysPicDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_pic
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    @Insert({
        "insert into sys_pic (path, create_time, ",
        "update_time)",
        "values (#{path,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(SysPicDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_pic
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    int insertSelective(SysPicDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_pic
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    List<SysPicDO> selectByExample(SysPicDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_pic
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    int updateByExampleSelective(@Param("record") SysPicDO record, @Param("example") SysPicDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_pic
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    int updateByExample(@Param("record") SysPicDO record, @Param("example") SysPicDOExample example);
}