package cn.ybetter.download.service;

import cn.ybetter.download.entity.Hero;
import cn.ybetter.download.service.impl.GetUserInfoServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "gain-experience-data", fallback = GetUserInfoServiceImpl.class)
public interface GetUserInfoService {

    @GetMapping("/hero/queryAll")
    List<Hero> queryAllUserInfo();
}
