package com.wangyang.mapper.client;

import com.wangyang.mapper.model.Picture;
import com.wangyang.mapper.model.PictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PictureMapper {
    int countByExample(PictureExample example);

    int deleteByExample(PictureExample example);

    int deleteByPrimaryKey(String id);

    int insert(Picture record);

    int insertSelective(Picture record);

    List<Picture> selectByExampleWithBLOBs(PictureExample example);

    List<Picture> selectByExample(PictureExample example);

    Picture selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Picture record, @Param("example") PictureExample example);

    int updateByExampleWithBLOBs(@Param("record") Picture record, @Param("example") PictureExample example);

    int updateByExample(@Param("record") Picture record, @Param("example") PictureExample example);

    int updateByPrimaryKeySelective(Picture record);

    int updateByPrimaryKeyWithBLOBs(Picture record);

    int updateByPrimaryKey(Picture record);
}