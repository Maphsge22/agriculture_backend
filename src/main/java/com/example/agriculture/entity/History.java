package com.example.agriculture.entity;

import java.io.Serializable;

/**
 * (History)实体类
 *
 * @author makejava
 * @since 2022-07-23 00:40:25
 */
public class History implements Serializable {
    private static final long serialVersionUID = -59072359117180265L;
    
    private String id;
    
    private Float temp;
    
    private Float humi;
    
    private String motor;
    
    private String valve;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Float getTemp() {
        return temp;
    }

    public void setTemp(Float temp) {
        this.temp = temp;
    }

    public Float getHumi() {
        return humi;
    }

    public void setHumi(Float humi) {
        this.humi = humi;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }


}

