package cn.ybetter.download.controller;

import cn.ybetter.download.service.DownloadAttachmentsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * 下载附件控制层
 *
 * @author yb
 * @since 2020-05-23 11:07:09
 */

@RestController
@RequestMapping("downloadAttachments")
public class DownloadAttachmentsController {

    /**
     * 服务对象
     */
    @Resource
    private DownloadAttachmentsService downloadAttachmentsService;

    /**
     * 生成excel
     */
    @GetMapping("generateExcel")
    public Map<String, Object> selectOne() throws Exception {
        Map<String, Object> data = new HashMap<>();
        this.downloadAttachmentsService.generateExcel();
        data.put("resCode", "success");
        return data;

    }

}