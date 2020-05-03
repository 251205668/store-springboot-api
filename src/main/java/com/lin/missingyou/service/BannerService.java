/**
 * @作者 努力中的杨先生
 * @描述 简要描述
 * @创建时间 2020-04-30 15:32
 */
package com.lin.missingyou.service;

import com.lin.missingyou.model.Banner;
import org.springframework.stereotype.Service;

public interface BannerService {
    Banner getByName(String name);
}
