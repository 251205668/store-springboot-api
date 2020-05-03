/**
 * @作者 努力中的杨先生
 * @描述 简要描述
 * @创建时间 2020-05-03 19:42
 */
package com.lin.missingyou.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class BannerItem extends BaseEntity{
    @Id
    private Long id;
    private String img;
    private String keyword;
    private short type;
    private int bannerId;
    private String name;
}
