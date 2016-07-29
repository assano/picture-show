package com.wangyang.service;

import com.wangyang.mapper.client.PictureMapper;
import com.wangyang.mapper.model.Picture;
import com.wangyang.mapper.model.PictureExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wy on 2016/7/29.
 */
@Service
public class ShowService {

    @Autowired
    private PictureMapper pictureMapper;

    public List<Picture> findPictures(int offset, int limit) {

        PictureExample pictureExample = new PictureExample();

        pictureExample.setLimitStart(offset);

        pictureExample.setLimitEnd(offset + limit);

        return pictureMapper.selectByExample(pictureExample);
    }
}
