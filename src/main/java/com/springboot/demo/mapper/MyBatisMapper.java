package com.springboot.demo.mapper;

import com.springboot.demo.MyBatis.MyBatisVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MyBatisMapper {
    List<MyBatisVO> list();
}
