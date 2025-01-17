package org.example.transport.calculator.chatgpt;

import org.example.transport.calculator.service.CostService;
import org.example.ui.BasicUI;

public class CostUI extends BasicUI {

    public CostUI(java.util.Scanner scanner){
        super(scanner);
    }

    @Override
    public void execute() {
        int choice = inputInt("사용할 교통 수단을 입력해주세요(자동차 1, KTX 2, 고속버스 3): ");
        CostService service = CostServiceFactory.getService(choice);

        if (service == null) {
            System.out.println("올바르지 않은 입력입니다.");
            return;
        }

        int distance = inputInt("이동할 거리를 입력해주세요(km)");
        int cost = service.getCost(distance);
        String transport = switch (choice) {
            case 1 -> "자동차";
            case 2 -> "KTX";
            case 3 -> "고속버스";
            default -> "알 수 없는 교통 수단";
        };

        System.out.println(transport + "를 이용하여 " + distance + "km를 이동한 비용은 " + cost + "원 입니다.");

    }
}
