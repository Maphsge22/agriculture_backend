package com.example.agriculture.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.agriculture.commonutils.Response;
import com.example.agriculture.entity.Account;
import com.example.agriculture.entity.History;
import com.example.agriculture.entity.Value;
import com.example.agriculture.service.ValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * (History)表控制层
 *
 * @author makejava
 * @since 2022-07-23 00:40:22
 */
@RestController
@RequestMapping("dataservice/value")
@CrossOrigin  // 这个注解 是 浏览器F12 No ‘Access-Control-Allow-Origin‘ header is present on the requested resource 问题的解决方法
public class ValueController {
    @Autowired
    private ValueService valueService;

    @GetMapping("valueList")
    public Response valueList() {
        List<Value> valueList = valueService.list(null);
        return Response.ok().data("list", valueList);
    }

    @GetMapping("valueInfo")
    public Response valueInfo(String id) {
        QueryWrapper<Value> wrapper = new QueryWrapper<>();
        wrapper.eq("id", id);
        List<Value> valueList = valueService.list(wrapper);
        return Response.ok().data("list", valueList);
    }

    @PostMapping("editValue")
    public Response editValue(String id, String areaId, String desc, Float tempMax, Float tempMin, Float humiMax, Float humiMin) {


        QueryWrapper<Value> wrapper = new QueryWrapper<>();
        wrapper.eq("id", id);
        int res = valueService.count(wrapper);
        if (0 == res) {
            Value value = new Value();
            value.setId(id).setAreaId(areaId).setDescription(desc).setHumiMax(humiMax).setHumiMin(humiMin).setTempMax(tempMax).setTempMin(tempMin);
            valueService.save(value);
        } else {
            Value value = new Value();
            value.setId(id).setHumiMax(humiMax).setHumiMin(humiMin).setTempMax(tempMax).setTempMin(tempMin);
            // 因为string为空的话，set的话会赋予空串，update的时候当做更新的域
            // 但是float那几个，赋予空值，不会被update，就不影响
            // 所以那两个string列，得单独判断要不要set
            if(!(areaId.equals("")))
            {
                value.setAreaId(areaId);
            }
            if(!(desc.equals("")))
            {
                value.setDescription(desc);
            }
            valueService.update(value,wrapper);
        }

        return Response.ok();
    }

    @DeleteMapping("delete")
    public Response delAccount(String id) {
        QueryWrapper<Value> wrapper = new QueryWrapper<>();
        wrapper.eq("id", id);
        boolean res = valueService.remove(wrapper);
        if (res) {
            return Response.ok();
        } else {
            return Response.fail().message("No such record.");
        }
    }
}
