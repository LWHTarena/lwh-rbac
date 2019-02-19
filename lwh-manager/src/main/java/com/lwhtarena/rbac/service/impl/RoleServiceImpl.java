package com.lwhtarena.rbac.service.impl;

import com.lwhtarena.rbac.common.Role;
import com.lwhtarena.rbac.dao.RoleDao;
import com.lwhtarena.rbac.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;


    public List<Role> pageQueryData(Map<String, Object> map) {
        return roleDao.pageQueryData(map);
    }

    public int pageQueryCount(Map<String, Object> map) {
        return roleDao.pageQueryCount(map);
    }

    public List<Role> queryAll() {
        return roleDao.queryAll();
    }

    public void insertRolePermission(Map<String, Object> paramMap) {
        roleDao.deleteRolePermissions(paramMap);
        roleDao.insertRolePermission(paramMap);
    }
}
