/**
 * @作者 努力中的杨先生
 * @描述 简要描述
 * @创建时间 2020-05-07 16:26
 */
package com.lin.missingyou.repository;

import com.lin.missingyou.model.Spu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SearchRepository extends JpaRepository<Spu,Long> {
    Page<Spu> findOneByTitleContainingOrSubtitleContainingOrTagsContaining(String name1, String name2, String name3, Pageable pageable);
}
