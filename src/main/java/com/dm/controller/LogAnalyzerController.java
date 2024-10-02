package com.dm.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dm.serviceImpl.LogAnalyzerServiceImpl;

@RestController
public class LogAnalyzerController {

    @Autowired
    private LogAnalyzerServiceImpl logAnalyzerService;

    @PostMapping("/analyze")
    public ResponseEntity<Map<String, String>> analyzeLog(@RequestBody String logText) {
        Map<String, String> analysisResults = logAnalyzerService.analyzeLog(logText);
        return ResponseEntity.ok(analysisResults);
    }
}

