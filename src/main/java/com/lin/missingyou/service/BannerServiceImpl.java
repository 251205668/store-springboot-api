/**
 * @作者 努力中的杨先生
 * @描述 简要描述
 * @创建时间 2020-04-30 14:04
 */
package com.lin.missingyou.service;

import com.lin.missingyou.model.Banner;
import com.lin.missingyou.repository.BannerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BannerServiceImpl implements BannerService {
    @Autowired
    private BannerRepository bannerRepository;
    @Override
    public Banner getByName(String name) {
        return bannerRepository.findOneByName(name);
    }
}
