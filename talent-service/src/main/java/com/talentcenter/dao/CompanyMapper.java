package com.talentcenter.dao;

import com.talentcenter.entity.Company;
import mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface CompanyMapper extends BaseMapper<Company> {

    int batchDel(Map<String, Object> map);

}