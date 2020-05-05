/**
 * @作者 努力中的杨先生
 * @描述 简要描述
 * @创建时间 2020-05-05 17:36
 */
package com.lin.missingyou.core;

import com.lin.missingyou.bo.pageCounter;

public class CommonUtil {
    public static pageCounter convertStartToPage(Integer start,Integer count){
        int page = start/count;
        return  pageCounter.builder().page(page).count(count).build();
    }
}
