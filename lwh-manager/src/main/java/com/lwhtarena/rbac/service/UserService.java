package com.lwhtarena.rbac.service;

import com.lwhtarena.rbac.common.User;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * <h2>简述：</h2>
 * <ol></ol>
 * <h2>功能描述：</h2>
 * <ol></ol>
 * </p>
 *
 * @Author: liwh
 * @Date :
 * @Version: 版本
 */
public interface UserService {

    List<User> queryAll();

    User query4Login(User user);

    List<User> pageQueryData(Map<String, Object> map);

    int pageQueryCount(Map<String, Object> map);

    void insertUser(User user);

    User queryById(Integer id);

    void updateUser(User user);

    void deleteUserById(Integer id);

    void deleteUsers(Map<String, Object> map);

    void deleteUserRoles(Map<String, Object> map);

    void insertUserRoles(Map<String, Object> map);

    List<Integer> queryRoleidsByUserid(Integer id);
}
