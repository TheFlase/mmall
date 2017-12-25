package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;

/**
 * Created by Administrator on 12/2/2017.
 */
public interface IUserService {
    /**
     * 用户登录
     * @param username
     * @param password
     * @return
     */
    ServerResponse<User> login(String username, String password);

    /**
     * 注册用户(保存用户信息)
     * @param user
     * @return
     */
    public ServerResponse<String> register(User user);

    /**
     * 判断用户名或者邮箱名称是否存在
     * @param str
     * @param type
     * @return
     */
    public ServerResponse<String> checkValid(String str,String type);
}
