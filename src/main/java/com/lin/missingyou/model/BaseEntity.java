/**
 * @作者 努力中的杨先生
 * @描述 提取时间管理的字段基类 只需要继承即可
 * @创建时间 2020-05-03 20:02
 */
package com.lin.missingyou.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;
import java.util.Date;
@Getter
@Setter
@MappedSuperclass
public abstract class BaseEntity {
    @JsonIgnore
    private Date create_time;
    @JsonIgnore
    private Date update_time;
    @JsonIgnore
    private Date delete_time;
}
