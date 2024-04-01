package com.ask.model;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.util.Date;

/**
 * 用户注册实体
 */
@Data
@TableName("user")
public class User {
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户名
     */
    private Date created_at;
}
