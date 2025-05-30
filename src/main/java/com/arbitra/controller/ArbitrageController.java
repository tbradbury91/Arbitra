package com.arbitra.controller;

import com.arbitra.service.ArbitrageService;
import com.arbitra.model.ArbitrageOpportunity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/arbitrage")
public class ArbitrageController {

    @Autowired
    private ArbitrageService arbitrageService;

    @GetMapping("/opportunities")
    public List<ArbitrageOpportunity> getOpportunities() {
        return arbitrageService.findArbitrageOpportunities();
    }
}
