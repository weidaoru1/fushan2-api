package com.fushan2api.service.menu;

import com.fushan2api.model.menu.MenuChildren;
import com.fushan2api.service.BaseService;

import java.util.List;

public interface MenuChildrenService extends BaseService<MenuChildren> {
    List<MenuChildren> queryMenuByParentId(Integer parentId);
    List<MenuChildren> queryList(MenuChildren entity);
    List<MenuChildren> queryListAll();
    int insertSelective(MenuChildren entity);
    int updateByPrimaryKey(MenuChildren entity);
}
