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


@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Value对象", description="")  // 这4行注解不写的话，就必须要显式注明get set函数
public class Value {

    @TableId  // 主键，就设备ID这一列。别设置复合主键给自己找事了
    private String id;

    private String areaId;

    private String description;

    private Float tempMax;

    private Float humiMax;

    private Float tempMin;

    private Float humiMin;
}
