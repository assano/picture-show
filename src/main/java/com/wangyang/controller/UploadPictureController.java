package com.wangyang.controller;

import com.wangyang.service.UploadPictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wy on 2016/7/28.
 */
@Controller
public class UploadPictureController {

    @Autowired
    private UploadPictureService uploadPictureService;

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String upload(@RequestParam("file") MultipartFile picture, HttpServletRequest request) {

        uploadPictureService.uploadPicture(picture, request);

        return "show";
    }

}
