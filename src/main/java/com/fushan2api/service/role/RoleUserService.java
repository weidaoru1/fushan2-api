package com.fushan2api.service.role;

import com.fushan2api.model.role.RoleUser;

public interface RoleUserService {
    int insertSelective(RoleUser entity);
    int deleteByUserId(Integer id);
}
