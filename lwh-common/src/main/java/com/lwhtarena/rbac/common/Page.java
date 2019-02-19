package com.lwhtarena.rbac.common;

import lombok.Data;

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
public class Page<T> {

    private List<T> datas;
    private int pageno;
    private int totalno;
    private int totalsize;

}
