/**
 * @作者 努力中的杨先生
 * @描述 简要描述
 * @创建时间 2020-04-29 16:04
 */
package com.lin.missingyou.DTO;

import lombok.Getter;

import javax.validation.constraints.Min;

@Getter
public class SchoolDTO {
    @Min(value = 2)
    String schoolName;
}
