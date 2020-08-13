package cn.ybetter.authority.dao;

import cn.ybetter.authority.entity.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yb
 * @since 2020/08/11
 */

@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public UserDto getUserByUserName(String username) {
        String sql = "select id,username,password,fullName from t_user where username = ?";
        List<UserDto> list = jdbcTemplate.query(sql, new Object[]{username}, new BeanPropertyRowMapper<>(UserDto.class));
        if (list == null && list.size() <= 0) {
            return null;
        }
        return list.get(0);
    }

}
