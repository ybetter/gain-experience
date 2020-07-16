package cn.ybetter.authority.shiro.realm;

import cn.ybetter.authority.service.UserService;
import cn.ybetter.authority.shiro.entity.AccountProfile;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

public class AccountRealm extends AuthorizingRealm {

    @Autowired
    UserService userService;

    /**
     * 授权方法
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        AccountProfile principal = (AccountProfile) principalCollection.getPrimaryPrincipal();

        // 硬编码（赋予用户权限或角色）
        if (principal.getUserName().equals("MarkerHub")) {
            SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
            info.addRole("admin");

            return info;
        }
        
        return null;
    }

    /**
     * 认证方法
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        AccountProfile profile = userService.login(token.getUsername(), String.valueOf(token.getPassword()));
        // 把用户信息存到session中，方便前端展示
        SecurityUtils.getSubject().getSession().setAttribute("profile", profile);

        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(profile, token.getCredentials(), getName());

        return info;
    }

}
