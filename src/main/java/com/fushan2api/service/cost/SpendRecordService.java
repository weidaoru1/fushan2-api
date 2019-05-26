package com.fushan2api.service.cost;

import com.fushan2api.model.cost.SpendRecord;
import com.fushan2api.service.BaseService;

public interface SpendRecordService extends BaseService<SpendRecord> {
    int deleteByPrimaryKey(Integer id);
    int insert(SpendRecord record);
    int insertSelective(SpendRecord record);
    SpendRecord selectByPrimaryKey(Integer id);
    int updateByPrimaryKeySelective(SpendRecord record);
    int updateByPrimaryKey(SpendRecord record);
    int deleteBySpendId(Integer id);
}
