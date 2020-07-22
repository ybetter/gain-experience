package cn.ybetter.data.service;

import cn.ybetter.data.entity.Hero;

import java.util.List;

/**
 * 用户信息
 *
 * @author yb
 * @since 2020-07-22 11:37:42
 */
public interface HeroService {

    /**
     * 查询所有用户数据
     *
     * @return
     */
    List<Hero> queryAllUser();

    /**
     * 新增数据
     *
     * @param hero 实例对象
     * @return 实例对象
     */
    Hero insert(Hero hero);

}