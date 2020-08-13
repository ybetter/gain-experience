package cn.ybetter.download.controller;

import cn.ybetter.download.service.DownloadAttachmentsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
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

@Slf4j
@RestController
@RequestMapping("attachments")
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
    @PreAuthorize("hasAuthority('p2')")
    public Map<String, Object> selectOne() throws Exception {
        Map<String, Object> data = new HashMap<>();
        try {
            this.downloadAttachmentsService.generateExcel();
            data.put("resCode", "success");
        } catch (Exception e) {
            data.put("resCode", "faile");
            data.put("resMsg", e.getMessage());
            log.error(e.getMessage());
        }
        return data;
    }

}