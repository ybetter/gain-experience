package cn.ybetter.data.controller;

import cn.ybetter.data.entity.Hero;
import cn.ybetter.data.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户信息
 *
 * @author yb
 * @since 2020-07-22 11:37:50
 */
@RestController
@RequestMapping("hero")
public class HeroController {
    /**
     * 服务对象
     */
    @Autowired
    private HeroService heroService;

    /**
     * 查询所有用户信息
     *
     * @return 所有用户数据
     */
    @GetMapping("queryAll")
    public List<Hero> queryAllUser() {
        return this.heroService.queryAllUser();
    }

}