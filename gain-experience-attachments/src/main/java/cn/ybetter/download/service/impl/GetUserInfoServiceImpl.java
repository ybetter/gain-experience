package cn.ybetter.download.service.impl;

import cn.ybetter.download.entity.Hero;
import cn.ybetter.download.service.GetUserInfoService;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class GetUserInfoServiceImpl implements GetUserInfoService {
    @Override
    public List<Hero> queryAllUserInfo() {
        return Collections.EMPTY_LIST;
    }
}
