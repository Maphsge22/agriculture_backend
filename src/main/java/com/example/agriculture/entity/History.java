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

    @TableId()
    private Date recordTime;

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

