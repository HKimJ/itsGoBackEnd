package com.example.itsGo.dao;

import com.example.itsGo.dto.TestDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
@Mapper
public interface TestDAO {
    List<TestDTO> getTestData();
}
