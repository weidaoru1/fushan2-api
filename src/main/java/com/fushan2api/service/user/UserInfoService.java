package com.fushan2api.service.user;
import com.fushan2api.model.user.UserInfo;
import com.fushan2api.service.BaseService;

import java.util.List;

public interface UserInfoService extends BaseService<UserInfo> {
    UserInfo userCheck(String userName, String password);
    int deleteByPrimaryKey(Integer key);
    UserInfo selectByPrimaryKey(Integer key);
    List<UserInfo> queryList(UserInfo entity);
    List<UserInfo> queryListAll();
    UserInfo insertSelective(UserInfo entity);
    int updateByPrimaryKey(UserInfo entity);
}
