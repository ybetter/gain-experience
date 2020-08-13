package cn.ybetter.authority;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class AuthoritySecurityApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("加密后的密码：" + new BCryptPasswordEncoder().encode("secret"));
    }

}
