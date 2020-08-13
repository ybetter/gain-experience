package cn.ybetter.authority.entity;

import lombok.Data;

/**
 * @author yb
 * @since 2020/07/29
 */

@Data
public class UserDto {

    private String id;

    private String username;

    private String password;

    private String fullname;

    private String mobile;

}
