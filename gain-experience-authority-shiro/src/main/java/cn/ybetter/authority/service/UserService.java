package cn.ybetter.authority.service;

import cn.ybetter.authority.shiro.entity.AccountProfile;

public interface UserService {

    AccountProfile login(String userName, String password);

}
