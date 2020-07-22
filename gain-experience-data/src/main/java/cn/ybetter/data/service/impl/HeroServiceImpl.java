package cn.ybetter.data.service.impl;

import cn.ybetter.data.dao.HeroDao;
import cn.ybetter.data.entity.Hero;
import cn.ybetter.data.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户信息
 *
 * @author yb
 * @since 2020-07-22 11:37:49
 */
@Service("heroService")
public class HeroServiceImpl implements HeroService {
    @Autowired
    private HeroDao heroDao;

    /**
     * 查询用户信息
     *
     * @return
     */
    @Override
    public List<Hero> queryAllUser() {
        return this.heroDao.selectAll();
    }

    /**
     * 新增数据
     *
     * @param hero 实例对象
     * @return 实例对象
     */
    @Override
    public Hero insert(Hero hero) {
        this.heroDao.insert(hero);
        return hero;
    }

}