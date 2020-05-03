/**
 * @作者 努力中的杨先生
 * @描述 操作Banner数据库
 * @创建时间 2020-05-03 14:22
 */
package com.lin.missingyou.repository;

import com.lin.missingyou.model.Banner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BannerRepository extends JpaRepository<Banner,Long> {
/*
 * 继承JpaRepository传入的参数是  1.操作的实体类 2.实体类主键类型
 */

    Banner findOneById(Long id);
    Banner findOneByName(String name);
}
