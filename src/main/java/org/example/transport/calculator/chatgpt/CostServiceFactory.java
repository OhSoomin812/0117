package org.example.transport.calculator.chatgpt;

import org.example.transport.calculator.service.BusCostServiceImpl;
import org.example.transport.calculator.service.CarCostServiceImpl;
import org.example.transport.calculator.service.CostService;
import org.example.transport.calculator.service.KTXCostServiceImpl;

public class CostServiceFactory {

    public static CostService getService(int transport){
        return switch (transport) {
            case 1 -> new CarCostServiceImpl();
            case 2 -> new KTXCostServiceImpl();
            case 3 -> new BusCostServiceImpl();
            default -> null;
        };
    }
}
