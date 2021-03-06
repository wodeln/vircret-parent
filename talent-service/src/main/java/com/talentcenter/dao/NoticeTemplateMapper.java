package com.talentcenter.dao;

import com.talentcenter.entity.NoticeTemplate;
import mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface NoticeTemplateMapper extends BaseMapper<NoticeTemplate> {

    int batchDel(Map<String, Object> map);

}