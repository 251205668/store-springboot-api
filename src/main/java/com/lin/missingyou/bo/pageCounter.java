/**
 * @作者 努力中的杨先生
 * @描述 业务对象 service层向controller层传输的数据对象
 * @创建时间 2020-05-05 17:21
 */
package com.lin.missingyou.bo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class pageCounter {
    private Integer page;
    private Integer count;
}
