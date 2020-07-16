package cn.ybetter.download.dao;

import cn.ybetter.download.entity.Hero;

import java.util.List;

/**
 * 下载附件控制层
 *
 * @author yb
 * @since 2020-05-23 11:07:09
 */

public interface DownloadAttachmentsDao {

    /**
     * 通过实体作为筛选条件查询
     *
     * @param hero 实例对象
     * @return 对象列表
     */
    List<Hero> queryAll(Hero hero);

}