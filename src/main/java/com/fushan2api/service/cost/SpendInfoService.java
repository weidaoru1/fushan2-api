package com.fushan2api.service.cost;

import com.fushan2api.model.cost.SpendInfo;
import com.fushan2api.service.BaseService;

public interface SpendInfoService extends BaseService<SpendInfo> {
    int deleteByPrimaryKey(Integer key);
    SpendInfo selectByPrimaryKey(Integer key);
    int insertSelective(SpendInfo entity);
    int updateByPrimaryKey(SpendInfo entity);
}
