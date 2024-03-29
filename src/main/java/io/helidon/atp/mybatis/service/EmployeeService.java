package io.helidon.atp.mybatis.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import io.helidon.atp.mybatis.entity.Employee;
import io.helidon.atp.mybatis.entity.EmployeeExample;

public interface EmployeeService {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table EMPLOYEE
	 *
	 * @mbg.generated Wed Apr 24 11:27:25 CST 2019
	 */
	long countByExample(EmployeeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table EMPLOYEE
	 *
	 * @mbg.generated Wed Apr 24 11:27:25 CST 2019
	 */
	int deleteByExample(EmployeeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table EMPLOYEE
	 *
	 * @mbg.generated Wed Apr 24 11:27:25 CST 2019
	 */
	int insert(Employee record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table EMPLOYEE
	 *
	 * @mbg.generated Wed Apr 24 11:27:25 CST 2019
	 */
	int insertSelective(Employee record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table EMPLOYEE
	 *
	 * @mbg.generated Wed Apr 24 11:27:25 CST 2019
	 */
	List<Employee> selectByExample(EmployeeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table EMPLOYEE
	 *
	 * @mbg.generated Wed Apr 24 11:27:25 CST 2019
	 */
	int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table EMPLOYEE
	 *
	 * @mbg.generated Wed Apr 24 11:27:25 CST 2019
	 */
	int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);
}