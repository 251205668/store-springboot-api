/**
 * @作者 努力中的杨先生
 * @描述 简要描述
 * @创建时间 2020-05-04 17:16
 */
package com.lin.missingyou.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Spu extends BaseEntity{
    @Id
    private Long id;
    private String title;
    private String subtitle;
    private Long categoryId;
    private Long rootCategoryId;
    private Boolean online;
    private String price;
    private Long sketchSpecId;
    private Long defaultSkuId;
    private String img;
    private String discountPrice;
    private String description;
    private String tags;
    private Boolean isTest;
    private String forThemeImg;

    // 配置导航关系
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "spuId")
    private List<Sku> skuList;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "spuId")
    private List<SpuDetailImg> spuDetailImgList;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "spuId")
    private List<SpuImg> spuImgList;
}
