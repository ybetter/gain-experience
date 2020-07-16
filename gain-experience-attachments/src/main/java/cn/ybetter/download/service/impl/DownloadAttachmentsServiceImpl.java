package cn.ybetter.download.service.impl;

import cn.ybetter.download.dao.DownloadAttachmentsDao;
import cn.ybetter.download.entity.Hero;
import cn.ybetter.download.service.DownloadAttachmentsService;
import com.alibaba.excel.EasyExcel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 下载附件控制层
 *
 * @author yb
 * @since 2020-05-23 11:07:09
 */

@Service
public class DownloadAttachmentsServiceImpl implements DownloadAttachmentsService{

    // 下载到的位置
    String downloadPath = "G:/";

    @Resource
    private DownloadAttachmentsDao downloadAttachmentsDao;

    /**
     * 生成excel
     */
    @Override
    public void generateExcel() throws Exception {
        try {
            List<Hero> list = downloadAttachmentsDao.queryAll(new Hero());
            String fileName = downloadPath + "write" +System.currentTimeMillis() + ".xlsx";
            EasyExcel.write(fileName, Hero.class).sheet("模板").doWrite(list);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("生成excel失败！");
        }
    }

}