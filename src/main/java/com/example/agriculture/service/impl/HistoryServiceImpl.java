package com.example.agriculture.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.agriculture.entity.History;
import com.example.agriculture.mapper.HistoryMapper;
import com.example.agriculture.service.HistoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (History)表服务实现类
 *
 * @author makejava
 * @since 2022-07-23 00:40:25
 */
@Service
public class HistoryServiceImpl extends ServiceImpl<HistoryMapper, History> implements HistoryService {

}
