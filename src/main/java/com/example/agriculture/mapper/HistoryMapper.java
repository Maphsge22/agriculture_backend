package com.example.agriculture.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.agriculture.entity.History;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (History)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-23 00:40:24
 */
@Mapper
public interface HistoryMapper extends BaseMapper<History> {


}

