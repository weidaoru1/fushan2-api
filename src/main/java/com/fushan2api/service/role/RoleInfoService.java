package com.fushan2api.service.role;

import com.fushan2api.model.role.RoleInfo;

import java.util.List;
public interface RoleInfoService{
    List<RoleInfo> queryByUserId(Integer id);
    List<RoleInfo> queryListAll();
}
