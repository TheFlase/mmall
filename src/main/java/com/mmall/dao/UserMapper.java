package com.mmall.dao;

import com.mmall.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * 检查用户名是否存在
     * @param username
     * @return
     */
    int checkUserName(String username);

    /**
     * 检查邮件名称是否存在
     * @param email
     * @return
     */
    int checkEmail(String email);

    /**
     * 根据用户名和密码查询用户信息
     * @param username
     * @param password
     * @return
     */
    User selectLogin(@Param("username") String username, @Param("password") String password);

    /**
     * 找回密码:根据用户名查找问题
     * @param username
     * @return
     */
    String selectQuestionByUsername(String username);

    /**
     * 找回密码:校验答案是否正确
     * @param username
     * @param question
     * @param answer
     * @return
     */
    int checkAnswer(@Param("username") String username,@Param("question") String question,@Param("answer") String answer);
}