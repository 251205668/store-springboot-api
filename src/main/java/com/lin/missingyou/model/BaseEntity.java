/**
 * @作者 努力中的杨先生
 * @描述 提取时间管理的字段基类 只需要继承即可
 * @创建时间 2020-05-03 20:02
 */
package com.lin.missingyou.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.sql.Timestamp;
import java.util.Date;
@Getter
@Setter
@MappedSuperclass
public abstract class BaseEntity {
    @JsonIgnore
    @Column(insertable = false,updatable = false)
    private Timestamp createTime;
    @JsonIgnore
    @Column(insertable = false,updatable = false)
    private Timestamp updateTime;
    @JsonIgnore
    @Column(insertable = false,updatable = false)
    private Timestamp deleteTime;
}
