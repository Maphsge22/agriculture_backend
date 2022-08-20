package com.example.agriculture.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * (History)实体类
 *
 * @author makejava
 * @since 2022-07-23 00:40:25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="History对象", description="")  // 上面这几行不写的话，就必须要显式注明get set函数
public class History implements Serializable {
    private static final long serialVersionUID = -59072359117180265L;

    @TableId   // 这个注解表示主键
    private String recordTime;  // 这个不要用Date类型，会变成一长串的格林尼治时间。
                                // 用string的话就是正常的数据库里存储的信息

    private String equipmentId;
    
    private Float temp;
    
    private Float humidity;
    
    private String motor;
    
    private String valve;


    public void setTemp(Float temp) {
        this.temp = temp;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }


}

