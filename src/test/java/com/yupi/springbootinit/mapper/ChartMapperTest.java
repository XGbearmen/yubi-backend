package com.yupi.springbootinit.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ChartMapperTest {

    @Resource
    private ChartMapper chartMapper;
    @Test
    void queryChartData() {
        String chartId="";
        String format = String.format("select * from chart_%s", chartId);
        List<Map<String, Object>> maps = chartMapper.queryChartData(format);
        System.out.println(maps);
    }
}