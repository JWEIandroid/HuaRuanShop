package com.huaruan.shop.dao;

import com.huaruan.shop.entity.SysProductDO;
import com.huaruan.shop.entity.SysProductDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;

public interface SysProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_product
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    long countByExample(SysProductDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_product
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    int deleteByExample(SysProductDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_product
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    @Insert({
        "insert into sys_product (product_name, product_price, ",
        "product_num, product_desc, ",
        "product_pic_item, vendor_id, ",
        "postage, status, ",
        "create_time, update_time)",
        "values (#{productName,jdbcType=VARCHAR}, #{productPrice,jdbcType=INTEGER}, ",
        "#{productNum,jdbcType=INTEGER}, #{productDesc,jdbcType=VARCHAR}, ",
        "#{productPicItem,jdbcType=VARCHAR}, #{vendorId,jdbcType=BIGINT}, ",
        "#{postage,jdbcType=INTEGER}, #{status,jdbcType=VARCHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updateTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(SysProductDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_product
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    int insertSelective(SysProductDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_product
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    List<SysProductDO> selectByExample(SysProductDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_product
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    int updateByExampleSelective(@Param("record") SysProductDO record, @Param("example") SysProductDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_product
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    int updateByExample(@Param("record") SysProductDO record, @Param("example") SysProductDOExample example);
}