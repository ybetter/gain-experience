package cn.ybetter.authority.controller;

import cn.ybetter.authority.entity.UserInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yb
 * @since 2020/07/29
 */
@Controller
public class OAuth2Controller {

    @RequestMapping("/api/userinfo")
    public ResponseEntity<UserInfo> getUserIno() {
        User user = (User) SecurityContextHolder.getContext()
                .getAuthentication().getPrincipal();
        String email = user.getUsername() + "@anumbrella.net";

        UserInfo userInfo = new UserInfo();
        userInfo.setName(user.getUsername());
        userInfo.setEmail(email);

        return ResponseEntity.ok(userInfo);
    }

}
