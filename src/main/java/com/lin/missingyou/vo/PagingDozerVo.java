/**
 * @作者 努力中的杨先生
 * @描述 简化控制器代码 将mapdozer和初始化数据一同封装进来
 * @创建时间 2020-05-06 15:23
 */
package com.lin.missingyou.vo;

import com.github.dozermapper.core.DozerBeanMapper;
import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;
import com.sun.javafx.css.StyleCacheEntry;
import org.springframework.data.domain.Page;

import java.util.ArrayList;
import java.util.List;

public class PagingDozerVo<T,K> extends PaggingVo {
    @SuppressWarnings("unchecked")
    public PagingDozerVo(Page<T> pageT,Class<K> classk) {
        /*
          泛型类 构造函数需要完成初始化参数 并且简化JPA返回的items
         */
        this.initPageParamters(pageT);
        // 获取分页返回内容
        List<T> tList = pageT.getContent();
        // 仿造之前写的简化返回值
        Mapper mapper = DozerBeanMapperBuilder.buildDefault();
        // 目标voList 这里也应该定义成泛型
        List<K> voList = new ArrayList<>();
        tList.forEach(t->{
            // map接收参数 源 目标元类
             K vo= mapper.map(t,classk);
             voList.add(vo);
        });
        this.setItems(voList);
    }
}
