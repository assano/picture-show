package com.wangyang.service;

import com.wangyang.mapper.client.PictureMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * Created by wy on 2016/7/28.
 */
@Service
public class UploadPictureService {

    @Autowired
    private PictureMapper pictureMapper;

    public void uploadPicture(MultipartFile picture, HttpServletRequest request) {

        File file = new File("E:\\picture-show\\src\\main\\webapp\\upload_pictures\\" + picture.getOriginalFilename());

        //存储压缩图

        //上传图片
        try {

            picture.transferTo(file);

        } catch (IOException e) {

            e.printStackTrace();
        }

        //把图片信息写入数据库
    }

}
