package com.lwhtarena.rbac.controller;

import com.lwhtarena.rbac.common.AJAXResult;
import com.lwhtarena.rbac.common.Page;
import com.lwhtarena.rbac.common.Role;
import com.lwhtarena.rbac.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
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
@Controller
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @ResponseBody
    @RequestMapping("/pageQuery")
    public Object pageQuery( String queryText, Integer pageno, Integer pagesize ) {

        AJAXResult result = new AJAXResult();

        try {

            // 分页查询
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("start", (pageno-1)*pagesize);
            map.put("size", pagesize);
            map.put("queryText", queryText);

            List<Role> roles = roleService.pageQueryData( map );
            // 当前页码
            // 总的数据条数
            int totalsize = roleService.pageQueryCount( map );
            // 最大页码（总页码）
            int totalno = 0;
            if ( totalsize % pagesize == 0 ) {
                totalno = totalsize / pagesize;
            } else {
                totalno = totalsize / pagesize + 1;
            }

            // 分页对象
            Page<Role> rolePage = new Page<Role>();
            rolePage.setDatas(roles);
            rolePage.setTotalno(totalno);
            rolePage.setTotalsize(totalsize);
            rolePage.setPageno(pageno);

            result.setData(rolePage);
            result.setSuccess(true);
        } catch ( Exception e ) {
            e.printStackTrace();
            result.setSuccess(false);
        }

        return result;

    }

    @ResponseBody
    @RequestMapping("/doAssign")
    public Object doAssign( Integer roleid, Integer[] permissionids ) {
        AJAXResult result = new AJAXResult();

        try {

            Map<String, Object> paramMap = new HashMap<String, Object>();
            paramMap.put("roleid", roleid);
            paramMap.put("permissionids", permissionids);
            roleService.insertRolePermission(paramMap);

            result.setSuccess(true);
        } catch ( Exception e ) {
            e.printStackTrace();
            result.setSuccess(false);
        }

        return result;
    }

    @RequestMapping("/assign")
    public String assign() {
        return "role/assign";
    }

    @RequestMapping("/index")
    public String index() {
        return "role/index";
    }
}
