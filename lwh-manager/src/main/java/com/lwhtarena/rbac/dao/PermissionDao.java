package com.lwhtarena.rbac.dao;

import com.lwhtarena.rbac.common.Permission;
import com.lwhtarena.rbac.common.User;
import org.apache.ibatis.annotations.Select;

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
public interface PermissionDao {

    @Select("select * from t_permission where pid is null")
    Permission queryRootPermission();

    @Select("select * from t_permission where pid = #{pid}")
    List<Permission> queryChildPermissions(Integer pid);

    @Select("select * from t_permission")
    List<Permission> queryAll();

    void insertPermission(Permission permission);

    @Select("select * from t_permission where id = #{id}")
    Permission queryById(Integer id);

    void updatePermission(Permission permission);

    void deletePermission(Permission permission);

    @Select("select permissionid from t_role_permission where roleid = #{roleid}")
    List<Integer> queryPermissionidsByRoleid(Integer roleid);

    List<Permission> queryPermissionsByUser(User dbUser);
}
