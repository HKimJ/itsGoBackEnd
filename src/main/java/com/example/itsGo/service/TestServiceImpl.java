package com.example.itsGo.service;

import java.util.List;
import com.example.itsGo.dao.TestDAO;
import com.example.itsGo.dto.TestDTO;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {
    private final TestDAO testDAO;

    @Override
    public List<TestDTO> getTestData() {
        System.out.println("serviceImpl");
        return testDAO.getTestData();
    }
}