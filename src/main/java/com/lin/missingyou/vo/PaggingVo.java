/**
 * @作者 努力中的杨先生
 * @描述 简要描述
 * @创建时间 2020-05-05 17:52
 */
package com.lin.missingyou.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.domain.Page;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class PaggingVo<T> {
    private Long total;
    private Integer count;
    private Integer page;
    private Integer total_page;
    // 使用到泛型 因为不止spu一处使用到这个vo 使用泛型要将类名上也要打上泛型
    private List<T> items;
    public PaggingVo(Page<T> pageT) {
        /*
        传入service获取到的Page对象 初始化参数
         */
        this.initPageParamters(pageT);
        this.items = pageT.getContent();
    }


    void initPageParamters(Page<T> pageT){
        this.total = pageT.getTotalElements();
        this.count= pageT.getSize();
        this.page = pageT.getNumber();
        this.total_page = pageT.getTotalPages();
    }

}
