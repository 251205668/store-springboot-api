
package com.lin.missingyou.api.v1;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;
import com.lin.missingyou.DTO.PersonDTO;
import com.lin.missingyou.api.sample.hero.ISkill;
import com.lin.missingyou.bo.pageCounter;
import com.lin.missingyou.core.CommonUtil;
import com.lin.missingyou.exception.http.NotFoundException;
import com.lin.missingyou.model.Banner;
import com.lin.missingyou.model.Spu;
import com.lin.missingyou.service.BannerService;
import com.lin.missingyou.service.SpuService;
import com.lin.missingyou.vo.PaggingVo;
import com.lin.missingyou.vo.SpuSimplifyVo;
import org.hibernate.validator.constraints.Range;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 努力中的杨先生
 */
@RestController
@RequestMapping("/v1/spu")
@Validated
public class SpuController {
    @Autowired
    private SpuService spuService;
    @GetMapping("/id/{id}/detail")
    public Spu getById(@PathVariable @Positive Long id){
        Spu spu = spuService.getSpuById(id);
        if(spu == null){
            throw new NotFoundException(30003);
        }
        return spu;
    }
    @GetMapping("/id/{id}/simplify")
    public SpuSimplifyVo getSimById(@PathVariable @Positive Long id){
        Spu spu = this.spuService.getSpuById(id);
        SpuSimplifyVo vo =new SpuSimplifyVo();
        /*
         * 工具集拷贝对象属性 参数是源和对象
         */
        BeanUtils.copyProperties(spu,vo);
        return vo;

    }
    @GetMapping("/latest")
    public List<SpuSimplifyVo> getLatest(@RequestParam(defaultValue = "0") Integer start,@RequestParam(defaultValue = "10") Integer count){
        Mapper mapper = DozerBeanMapperBuilder.buildDefault();
        /*
        获取到转换后的pageCounter 拿到page，count
        返回结果的视图层封装 paging的基本信息
        然后调用service层获取到Paging对象
        然后 拷贝属性到集合中返回
         */
        pageCounter pageCounter = CommonUtil.convertStartToPage(start,count);
        Page<Spu> spulist = this.spuService.getLatestSpuList(pageCounter.getPage(),pageCounter.getCount());
        PaggingVo<Spu> paggingVo = new PaggingVo(spulist);
        List<SpuSimplifyVo>vos = new ArrayList<>();
        paggingVo.getItems().forEach(s->{
            SpuSimplifyVo vo = mapper.map(s,SpuSimplifyVo.class);
            vos.add(vo);
        });
        return vos;
    }
}
