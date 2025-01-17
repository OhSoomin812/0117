package org.example.transport.calculator.chatgpt;

import org.example.transport.calculator.service.CostService;

public abstract class AbstractCostService implements CostService {

    private final int baseCost;
    private final int tollGateCost;
    private final int costPerKm;

    public AbstractCostService(int baseCost, int tollGateCost, int costPerKm) {
        this.baseCost = baseCost;
        this.tollGateCost = tollGateCost;
        this.costPerKm = costPerKm;
    }

    @Override
    public int getCost(int distance) {
        return baseCost + tollGateCost + (costPerKm * distance);
    }
}
