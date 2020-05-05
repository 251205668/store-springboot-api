/**
 * @作者 努力中的杨先生
 * @描述 控制返回的spu数据 vo对象
 * @创建时间 2020-05-05 15:56
 */
package com.lin.missingyou.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SpuSimplifyVo {
    private Long id;
    private String title;
    private String subtitle;
    private String img;
    private String forThemeImg;
    private String price;
    private String disscountPrice;
    private String description;
    private String tags;
    private String sktechSpecId;
}
