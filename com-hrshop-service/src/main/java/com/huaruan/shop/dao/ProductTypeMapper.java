package com.huaruan.shop.dao;

import com.huaruan.shop.entity.ProductTypeDO;
import com.huaruan.shop.entity.ProductTypeDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;

public interface ProductTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_type
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    long countByExample(ProductTypeDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_type
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    int deleteByExample(ProductTypeDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_type
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    @Insert({
        "insert into product_type (name, status, ",
        "create_time, update_time, ",
        "sort)",
        "values (#{name,jdbcType=VARCHAR}, #{status,jdbcType=VARCHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updateTime,jdbcType=TIMESTAMP}, ",
        "#{sort,jdbcType=INTEGER})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(ProductTypeDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_type
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    int insertSelective(ProductTypeDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_type
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    List<ProductTypeDO> selectByExample(ProductTypeDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_type
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    int updateByExampleSelective(@Param("record") ProductTypeDO record, @Param("example") ProductTypeDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_type
     *
     * @mbg.generated Sun Jan 27 17:07:06 CST 2019
     */
    int updateByExample(@Param("record") ProductTypeDO record, @Param("example") ProductTypeDOExample example);
}