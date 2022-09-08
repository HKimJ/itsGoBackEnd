package com.example.itsGo.controller;

import com.example.itsGo.dao.TestDAO;
import com.example.itsGo.dto.TestDTO;
import com.example.itsGo.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class DBConnectTestCtrl {
    @Autowired
    private final TestService testService;

    @GetMapping("/")
    public String test() {
        return "testing";
    }
    @GetMapping("/getTest")
    public List<TestDTO> getTest() {
        System.out.println("controller");
        return testService.getTestData();

    }
}