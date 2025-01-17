package org.example.transport.calculator.service;

public class BusCostServiceImpl implements CostService {
    @Override
    public int getCost(int distance) {
        int basicCost = 10000;
        int tollGateCost = 10000;
        return basicCost + tollGateCost + distance * 10;
    }
}
