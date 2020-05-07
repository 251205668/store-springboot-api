/**
 * @作者 努力中的杨先生
 * @描述 简要描述
 * @创建时间 2020-05-07 16:24
 */
package com.lin.missingyou.service;

import com.lin.missingyou.model.Spu;
import com.lin.missingyou.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class SearchService {
    @Autowired
    private SearchRepository searchRepository;
    public Page<Spu> searchByKeyword(String keyword, Integer pageNum, Integer size){
        Pageable pageable = PageRequest.of(pageNum,size);
        return this.searchRepository.findOneByTitleContainingOrSubtitleContainingOrTagsContaining(keyword,keyword,keyword,pageable);
    }
}
