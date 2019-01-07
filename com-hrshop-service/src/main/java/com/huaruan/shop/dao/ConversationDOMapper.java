package com.huaruan.shop.dao;

import com.huaruan.shop.bo.ConversationBO;
import com.huaruan.shop.bo.ConversationBOExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface ConversationDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table conversation
     *
     * @mbg.generated Mon Jan 07 13:03:39 CST 2019
     */
    long countByExample(ConversationBOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table conversation
     *
     * @mbg.generated Mon Jan 07 13:03:39 CST 2019
     */
    int deleteByExample(ConversationBOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table conversation
     *
     * @mbg.generated Mon Jan 07 13:03:39 CST 2019
     */
    @Delete({
        "delete from conversation",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table conversation
     *
     * @mbg.generated Mon Jan 07 13:03:39 CST 2019
     */
    @Insert({
        "insert into conversation (vendorid, userid, ",
        "content, sendertype, ",
        "create_time, update_time)",
        "values (#{vendorid,jdbcType=BIGINT}, #{userid,jdbcType=BIGINT}, ",
        "#{content,jdbcType=BIGINT}, #{sendertype,jdbcType=VARCHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updateTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(ConversationBO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table conversation
     *
     * @mbg.generated Mon Jan 07 13:03:39 CST 2019
     */
    int insertSelective(ConversationBO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table conversation
     *
     * @mbg.generated Mon Jan 07 13:03:39 CST 2019
     */
    List<ConversationBO> selectByExample(ConversationBOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table conversation
     *
     * @mbg.generated Mon Jan 07 13:03:39 CST 2019
     */
    @Select({
        "select",
        "id, vendorid, userid, content, sendertype, create_time, update_time",
        "from conversation",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ResultMap("com.huaruan.shop.dao.ConversationDOMapper.BaseResultMap")
    ConversationBO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table conversation
     *
     * @mbg.generated Mon Jan 07 13:03:39 CST 2019
     */
    int updateByExampleSelective(@Param("record") ConversationBO record, @Param("example") ConversationBOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table conversation
     *
     * @mbg.generated Mon Jan 07 13:03:39 CST 2019
     */
    int updateByExample(@Param("record") ConversationBO record, @Param("example") ConversationBOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table conversation
     *
     * @mbg.generated Mon Jan 07 13:03:39 CST 2019
     */
    int updateByPrimaryKeySelective(ConversationBO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table conversation
     *
     * @mbg.generated Mon Jan 07 13:03:39 CST 2019
     */
    @Update({
        "update conversation",
        "set vendorid = #{vendorid,jdbcType=BIGINT},",
          "userid = #{userid,jdbcType=BIGINT},",
          "content = #{content,jdbcType=BIGINT},",
          "sendertype = #{sendertype,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(ConversationBO record);
}