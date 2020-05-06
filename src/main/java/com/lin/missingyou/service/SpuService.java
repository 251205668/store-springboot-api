/**
 * @作者 努力中的杨先生
 * @描述 简要描述
 * @创建时间 2020-05-04 17:27
 */
package com.lin.missingyou.service;

import com.lin.missingyou.model.Spu;
import com.lin.missingyou.repository.SpuRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpuService {
    @Autowired
    SpuRespository spuRepositpry;
    public Spu getSpuById(Long id){
        return spuRepositpry.findOneById(id);
    }
    public Page<Spu> getLatestPagingSpu(Integer pageNum, Integer size){
        Pageable pageable = PageRequest.of(pageNum,size, Sort.by("createTime").descending());
        return this.spuRepositpry.findAll(pageable);
    }

}
