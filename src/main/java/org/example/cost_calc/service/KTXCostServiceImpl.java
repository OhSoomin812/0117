package org.example.cost_calc.service;

import org.example.cost_calc.service.CostService;

public class KTXCostServiceImpl implements CostService {

    @Override
    public int getCost(int distance) {
        int basicCost = 30000;
        return basicCost + distance * 50;
    }
}
