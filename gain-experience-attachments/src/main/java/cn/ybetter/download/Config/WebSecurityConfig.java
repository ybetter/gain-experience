package cn.ybetter.download.Config;

import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    // 安全拦截机制
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
//                .antMatchers("/attachments/generateExcel").hasAuthority("p2")
//                .antMatchers("/attachments/upload").hasAuthority("p2")
                .antMatchers("/attachments/**").authenticated() // 所有/attachments/**的请求必须认证通过
                .anyRequest().permitAll(); // 除了/attachments/**，其他请求可以访问
    }
}
