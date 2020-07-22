package cn.ybetter.download.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

/**
 * 上传附件
 *
 * @author ybtter
 * @since 2020/07/16
 */

@RestController
@RequestMapping("attachments")
public class UploadAttachmentsController {

    @PostMapping("upload")
    public void uploadAttachments(HttpServletRequest request) {
        // 获得请求中的附件
        if (request instanceof MultipartHttpServletRequest) {
            MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest) request;
            Map<String, MultipartFile> fileMap = multipartHttpServletRequest.getFileMap();
            fileMap.forEach((key, value) -> {
                System.out.println(key);
                System.out.println(value);
                System.out.println(value.getOriginalFilename());
                try {
                    byte[] bytes = value.getBytes();
                    File file = new File("G:/" + value.getOriginalFilename());
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    fileOutputStream.write(bytes);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }
        System.out.println("测试上传附件");
    }

}
