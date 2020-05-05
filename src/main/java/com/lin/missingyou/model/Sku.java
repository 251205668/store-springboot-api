/**
 * @作者 努力中的杨先生
 * @描述 简要描述
 * @创建时间 2020-05-04 19:45
 */
package com.lin.missingyou.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Getter
@Setter
public class Sku {
    @Id
    private Long id;
    private BigDecimal price;
    private BigDecimal discountPrice;
    private byte online;
    private String img;
    private String title;
    private Long spuId;
// 不能以Object返回json形式 必须要String

    private String specs;

    private String code;
    private Long stock;
    private Long categoryId;
    private Long rootCategoryId;

}
