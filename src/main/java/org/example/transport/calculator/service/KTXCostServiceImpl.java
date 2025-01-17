package org.example.transport.calculator.service;

public class KTXCostServiceImpl implements CostService {

    @Override
    public int getCost(int distance) {
        int basicCost = 30000;
        return basicCost + distance * 50;
    }
}
