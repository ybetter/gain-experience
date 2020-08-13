package cn.ybetter.authority.service;

import cn.ybetter.authority.dao.UserDao;
import cn.ybetter.authority.entity.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author yb
 * @since 2020/08/11
 */

@Service
public class SpringDataUserDetailsService implements UserDetailsService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // 登录账号
        System.out.println("username=" + username);
        // 根据账号去数据库查询
        UserDto user = userDao.getUserByUserName(username);
        if (user == null) {
            return null;
        }
        // 这里暂时使用静态数据
        UserDetails userDetails = User.withUsername(user.getFullname()).password(user.getPassword()).authorities("p1").build();
        return userDetails;
    }
}
