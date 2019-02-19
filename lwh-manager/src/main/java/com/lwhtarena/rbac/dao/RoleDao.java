package com.lwhtarena.rbac.dao;

import com.lwhtarena.rbac.common.Role;
import org.apache.ibatis.annotations.Select;

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
public interface RoleDao {

    List<Role> pageQueryData(Map<String, Object> map);

    int pageQueryCount(Map<String, Object> map);

    @Select("select * from t_role")
    List<Role> queryAll();

    void insertRolePermission(Map<String, Object> paramMap);

    void deleteRolePermissions(Map<String, Object> paramMap);
}
