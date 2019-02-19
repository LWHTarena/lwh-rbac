package com.lwhtarena.rbac.common;

import lombok.Data;

import java.util.ArrayList;
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

@Data
public class Permission {

    private Integer id;
    private String name;
    private String url;
    private Integer pid;
    private boolean open = true;
    private boolean checked = false;
    private String icon;
    private List<Permission> children = new ArrayList<Permission>();

}
