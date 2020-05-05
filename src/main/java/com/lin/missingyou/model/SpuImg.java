/**
 * @作者 努力中的杨先生
 * @描述 简要描述
 * @创建时间 2020-05-04 19:45
 */
package com.lin.missingyou.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Getter
@Setter
public class SpuImg {
    @Id
    private Long id;
    private String img;
    private Long spuId;
}
