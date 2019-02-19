package com.lwhtarena.rbac.service;

import com.lwhtarena.rbac.common.Permission;
import com.lwhtarena.rbac.common.User;

import java.util.List;

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
public interface PermissionService {

    Permission queryRootPermission();

    List<Permission> queryChildPermissions(Integer pid);

    List<Permission> queryAll();

    void insertPermission(Permission permission);

    Permission queryById(Integer id);

    void updatePermission(Permission permission);

    void deletePermission(Permission permission);

    List<Integer> queryPermissionidsByRoleid(Integer roleid);

    List<Permission> queryPermissionsByUser(User dbUser);
}
