package com.example.agriculture.controller;

import com.example.agriculture.entity.History;
import com.example.agriculture.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.agriculture.commonutils.Response;

import javax.annotation.Resource;
import java.util.List;

/**
 * (History)表控制层
 *
 * @author makejava
 * @since 2022-07-23 00:40:22
 */
@RestController
@RequestMapping("/dataservice/history")
@CrossOrigin  // 这个注解 是 浏览器F12 No ‘Access-Control-Allow-Origin‘ header is present on the requested resource 问题的解决方法
public class HistoryController {

    @Autowired
    private HistoryService historyService;

    @GetMapping("historyList")
    public Response historyList() {
        List<History> historyList = historyService.list(null);
        return Response.ok().data("list", historyList);
    }

}

