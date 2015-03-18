package com.bibisco.dao.client;

import com.bibisco.dao.model.Project;
import com.bibisco.dao.model.ProjectExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bibisco.dao.model.ProjectWithBLOBs;

public interface ProjectMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.PROJECT
	 * @mbggenerated  Tue Sep 24 07:44:55 CEST 2013
	 */
	int countByExample(ProjectExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.PROJECT
	 * @mbggenerated  Tue Sep 24 07:44:55 CEST 2013
	 */
	int deleteByExample(ProjectExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.PROJECT
	 * @mbggenerated  Tue Sep 24 07:44:55 CEST 2013
	 */
	int deleteByPrimaryKey(String idProject);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.PROJECT
	 * @mbggenerated  Tue Sep 24 07:44:55 CEST 2013
	 */
	int insert(ProjectWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.PROJECT
	 * @mbggenerated  Tue Sep 24 07:44:55 CEST 2013
	 */
	int insertSelective(ProjectWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.PROJECT
	 * @mbggenerated  Tue Sep 24 07:44:55 CEST 2013
	 */
	List<ProjectWithBLOBs> selectByExampleWithBLOBs(ProjectExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.PROJECT
	 * @mbggenerated  Tue Sep 24 07:44:55 CEST 2013
	 */
	List<Project> selectByExample(ProjectExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.PROJECT
	 * @mbggenerated  Tue Sep 24 07:44:55 CEST 2013
	 */
	ProjectWithBLOBs selectByPrimaryKey(String idProject);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.PROJECT
	 * @mbggenerated  Tue Sep 24 07:44:55 CEST 2013
	 */
	int updateByExampleSelective(@Param("record") ProjectWithBLOBs record, @Param("example") ProjectExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.PROJECT
	 * @mbggenerated  Tue Sep 24 07:44:55 CEST 2013
	 */
	int updateByExampleWithBLOBs(@Param("record") ProjectWithBLOBs record, @Param("example") ProjectExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.PROJECT
	 * @mbggenerated  Tue Sep 24 07:44:55 CEST 2013
	 */
	int updateByExample(@Param("record") Project record, @Param("example") ProjectExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.PROJECT
	 * @mbggenerated  Tue Sep 24 07:44:55 CEST 2013
	 */
	int updateByPrimaryKeySelective(ProjectWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.PROJECT
	 * @mbggenerated  Tue Sep 24 07:44:55 CEST 2013
	 */
	int updateByPrimaryKeyWithBLOBs(ProjectWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.PROJECT
	 * @mbggenerated  Tue Sep 24 07:44:55 CEST 2013
	 */
	int updateByPrimaryKey(Project record);
	
	void update_to_1_1_0();
	
	String getProjectVersion(String idProject);

	void update_to_1_1_2();
}