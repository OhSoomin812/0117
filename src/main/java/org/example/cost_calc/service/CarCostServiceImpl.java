package org.example.cost_calc.service;

public class CarCostServiceImpl implements CostService {
    @Override
    public int getCost(int distance) {
        return distance * 130;
    }
}
