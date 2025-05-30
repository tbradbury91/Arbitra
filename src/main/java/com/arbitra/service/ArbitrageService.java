package com.arbitra.service;

import com.arbitra.model.ArbitrageOpportunity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArbitrageService {

    public List<ArbitrageOpportunity> findArbitrageOpportunities() {
        // TODO: implement logic to detect arbitrage opportunities using real or demo data
        return List.of(); // return empty for now
    }
}