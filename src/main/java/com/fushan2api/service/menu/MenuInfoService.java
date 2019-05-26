package com.fushan2api.service.menu;

import com.fushan2api.model.menu.MenuInfo;
import com.fushan2api.service.BaseService;

import java.util.List;

public interface MenuInfoService extends BaseService<MenuInfo> {
    List<MenuInfo> queryByUserId(Integer id);
    MenuInfo selectByPrimaryKey(Integer key);
    List<MenuInfo> queryList(MenuInfo entity);
    List<MenuInfo> queryListAll();
    int insertSelective(MenuInfo entity);
    int updateByPrimaryKey(MenuInfo entity);
}
