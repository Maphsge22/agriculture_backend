package com.example.agriculture.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.agriculture.entity.Value;
import com.example.agriculture.mapper.ValueMapper;
import com.example.agriculture.service.ValueService;
import org.springframework.stereotype.Service;

@Service
public class ValueServiceImpl extends ServiceImpl<ValueMapper, Value> implements ValueService {
}
