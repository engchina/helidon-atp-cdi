package io.helidon.atp.mybatis.service;

import io.helidon.atp.mybatis.entity.Manager;
import io.helidon.atp.mybatis.entity.ManagerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManagerService {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MANAGER
     *
     * @mbg.generated Mon May 13 15:55:50 CST 2019
     */
    long countByExample(ManagerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MANAGER
     *
     * @mbg.generated Mon May 13 15:55:50 CST 2019
     */
    int deleteByExample(ManagerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MANAGER
     *
     * @mbg.generated Mon May 13 15:55:50 CST 2019
     */
    int insert(Manager record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MANAGER
     *
     * @mbg.generated Mon May 13 15:55:50 CST 2019
     */
    int insertSelective(Manager record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MANAGER
     *
     * @mbg.generated Mon May 13 15:55:50 CST 2019
     */
    List<Manager> selectByExample(ManagerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MANAGER
     *
     * @mbg.generated Mon May 13 15:55:50 CST 2019
     */
    int updateByExampleSelective(@Param("record") Manager record, @Param("example") ManagerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MANAGER
     *
     * @mbg.generated Mon May 13 15:55:50 CST 2019
     */
    int updateByExample(@Param("record") Manager record, @Param("example") ManagerExample example);
}