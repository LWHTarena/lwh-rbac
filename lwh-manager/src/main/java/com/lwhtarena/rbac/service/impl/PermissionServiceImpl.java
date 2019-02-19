package com.lwhtarena.rbac.service.impl;

import com.lwhtarena.rbac.common.Permission;
import com.lwhtarena.rbac.common.User;
import com.lwhtarena.rbac.dao.PermissionDao;
import com.lwhtarena.rbac.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionDao permissionDao;

    public Permission queryRootPermission() {
        return permissionDao.queryRootPermission();
    }

    public List<Permission> queryChildPermissions(Integer pid) {
        return permissionDao.queryChildPermissions(pid);
    }

    public List<Permission> queryAll() {
        return permissionDao.queryAll();
    }

    public void insertPermission(Permission permission) {
        permissionDao.insertPermission(permission);
    }

    public Permission queryById(Integer id) {
        return permissionDao.queryById(id);
    }

    public void updatePermission(Permission permission) {
        permissionDao.updatePermission(permission);
    }

    public void deletePermission(Permission permission) {
        permissionDao.deletePermission(permission);
    }

    public List<Integer> queryPermissionidsByRoleid(Integer roleid) {
        return permissionDao.queryPermissionidsByRoleid(roleid);
    }

    public List<Permission> queryPermissionsByUser(User dbUser) {
        return permissionDao.queryPermissionsByUser(dbUser);
    }
}
