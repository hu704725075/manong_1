package com.manong.mapper;

import com.manong.pojo.User;

public interface UserMapper {
    /**
     *
     * @mbggenerated 2018-12-22
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-12-22
     */
    int insert(User record);

    /**
     *
     * @mbggenerated 2018-12-22
     */
    int insertSelective(User record);

    /**
     *
     * @mbggenerated 2018-12-22
     */
    User selectByPrimaryKey(Integer id);

    /**
     * 自己写的
     * @param id
     * @return
     */
    User queryUserById(Integer id);
    /**
     *
     * @mbggenerated 2018-12-22
     */
    int updateByPrimaryKeySelective(User record);

    /**
     *
     * @mbggenerated 2018-12-22
     */
    int updateByPrimaryKey(User record);
}