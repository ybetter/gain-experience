package cn.ybetter.authority.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

/**
 * @author yb
 * @since 2020/08/11
 */

@Configuration
public class TokenConfig {

    private String SIGNING_KEY = "uaa123";

//    @Autowired
//    private RedisConnectionFactory redisConnectionFactory;

    /**
     * 将token存在内存当中
     * @return
     */
    /*@Bean
    public TokenStore tokenStore() {
        return new InMemoryTokenStore();
    }*/

    /**
     * 将token存在jwt当中
     * @return
     */
    @Bean
    public TokenStore tokenStore() {
        return new JwtTokenStore(jwtAccessTokenConverter());
    }

    @Bean
    public JwtAccessTokenConverter jwtAccessTokenConverter() {
        JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
        converter.setSigningKey(SIGNING_KEY);// 对称秘钥，资源服务器使用该秘钥来验证
        return converter;
    }

    /**
     * 将token存在redis当中
     */
    /*@Bean
    public TokenStore redisTokenStore() {
        return new RedisTokenStore(redisConnectionFactory);
    }*/

}
