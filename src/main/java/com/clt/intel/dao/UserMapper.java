package com.clt.intel.dao;

import com.clt.intel.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("userMapper")
public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table intel_user
     *
     * @mbggenerated Wed Jun 15 14:32:14 CST 2016
     */
    int deleteByPrimaryKey(Long userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table intel_user
     *
     * @mbggenerated Wed Jun 15 14:32:14 CST 2016
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table intel_user
     *
     * @mbggenerated Wed Jun 15 14:32:14 CST 2016
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table intel_user
     *
     * @mbggenerated Wed Jun 15 14:32:14 CST 2016
     */
    User selectByPrimaryKey(Long userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table intel_user
     *
     * @mbggenerated Wed Jun 15 14:32:14 CST 2016
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table intel_user
     *
     * @mbggenerated Wed Jun 15 14:32:14 CST 2016
     */
    int updateByPrimaryKey(User record);


    List<User> getUserByParm(User user);

    List<Map> mobileMarkList(Map<String, Integer> stringIntegerMap);
}