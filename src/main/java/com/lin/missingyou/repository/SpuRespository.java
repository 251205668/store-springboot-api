/**
 * @作者 努力中的杨先生
 * @描述 简要描述
 * @创建时间 2020-05-06 16:33
 */
package com.lin.missingyou.repository;

import com.lin.missingyou.model.Spu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpuRespository extends JpaRepository<Spu,Long> {
    /*
    JPA 规范 findBy 查找 orderBy 排序  Desc 升序  参数中加入Pageable 返回分页结果前提是定义成Page泛型
    containing 添加模糊查找
     */

    Spu findOneById(Long id);
    Page<Spu> findAllByCategoryIdOrderByCreateTimeDesc(Long cid,Pageable pageable);
    Page<Spu> findAllByRootCategoryIdOrderByCreateTimeDesc(Long cid,Pageable pageable);

}
