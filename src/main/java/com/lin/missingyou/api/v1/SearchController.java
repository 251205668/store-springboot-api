/**
 * @作者 努力中的杨先生
 * @描述 简要描述
 * @创建时间 2020-05-07 16:23
 */
package com.lin.missingyou.api.v1;

import com.lin.missingyou.bo.pageCounter;
import com.lin.missingyou.core.CommonUtil;
import com.lin.missingyou.model.Spu;
import com.lin.missingyou.service.SearchService;
import com.lin.missingyou.vo.PagingDozerVo;
import com.lin.missingyou.vo.SpuSimplifyVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotBlank;

@RestController
@RequestMapping("/v1")
@Validated
public class SearchController {
    @Autowired
    private SearchService searchService;
    @GetMapping("/search")
    public PagingDozerVo<Spu, SpuSimplifyVo> getSuggest(@RequestParam @NotBlank String keyword,
                                                        @RequestParam(defaultValue = "0") Integer start,
                                                        @RequestParam(defaultValue = "10") Integer count){
        pageCounter pageCounter = CommonUtil.convertStartToPage(start, count);
        Page<Spu> results = searchService.searchByKeyword(keyword, start, count);
        return new PagingDozerVo<>(results,SpuSimplifyVo.class);
    }
}
