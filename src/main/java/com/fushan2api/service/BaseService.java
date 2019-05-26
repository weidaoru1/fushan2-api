package com.fushan2api.service;
import com.fushan2api.common.utils.DataGrid;
import com.fushan2api.common.utils.PageInfo;

import java.util.Map;

public interface BaseService<T> {
    PageInfo<T> pagedQuery(DataGrid grid);
    PageInfo<T> pagedQueryByCondition(DataGrid grid, Map<String, Object> map);
    int count(Map<String, Object> map);
}
