package cn.ybetter.data.dao;

import cn.ybetter.data.entity.Hero;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * 用户信息
 *
 * @author yb
 * @since 2020-07-22 11:37:39
 */
@Repository
public interface HeroDao extends Mapper<Hero> {

}