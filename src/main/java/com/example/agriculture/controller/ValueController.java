package com.example.agriculture.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (History)表控制层
 *
 * @author makejava
 * @since 2022-07-23 00:40:22
 */
@RestController
@RequestMapping("value")
@CrossOrigin  // 这个注解 是 浏览器F12 No ‘Access-Control-Allow-Origin‘ header is present on the requested resource 问题的解决方法
public class ValueController {
}
