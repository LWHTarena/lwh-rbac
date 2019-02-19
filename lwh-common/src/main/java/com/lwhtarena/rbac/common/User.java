package com.lwhtarena.rbac.common;

import lombok.Data;

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
public class User {

    private Integer id;
    private String username;
    private String loginacct;
    private String userpswd;
    private String email;
    private String createtime;
}
