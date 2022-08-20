package com.example.agriculture.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * (Account)实体类
 *
 * @author makejava
 * @since 2022-07-29 22:26:58
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Account对象", description="")  // 这4行注解不写的话，就必须要显式注明get set函数
public class Account implements Serializable {
    private static final long serialVersionUID = -90144189419165190L;

    @TableId(value = "id", type = IdType.AUTO)  // 不加这一行，注册新用户到数据库的时候，Account实体里不填id会报错： argument type mismatch
    private Integer id;
    /**
     * 用户ID
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 用户类型 管理员/普通用户
     */
    private Integer type;
    /**
     * 管理员是否批准
     */
    private Integer verification;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

//    public void setUsername(String username) {
//        this.username = username;
//    }

//    public String getPassword() {
//        return password;
//    }

//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public Integer getVerification() {
//        return verification;
//    }
//
//    public void setVerification(Integer verification) {
//        this.verification = verification;
//    }
//
//    public void setType(Integer i) {
//        this.type = i;
//    }
//
//    public int getType() {
//        return type;
//    }
}

