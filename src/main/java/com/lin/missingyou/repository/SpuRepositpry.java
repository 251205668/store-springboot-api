/**
 * @作者 努力中的杨先生
 * @描述 简要描述
 * @创建时间 2020-05-04 17:27
 */
package com.lin.missingyou.repository;

import com.lin.missingyou.model.Spu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpuRepositpry extends JpaRepository<Spu,Long> {
    Spu findOneById(Long id);
}
