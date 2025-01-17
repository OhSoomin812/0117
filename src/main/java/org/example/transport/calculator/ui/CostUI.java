package org.example.transport.calculator.ui;

import org.example.transport.calculator.service.BusCostServiceImpl;
import org.example.transport.calculator.service.CarCostServiceImpl;
import org.example.transport.calculator.service.CostService;
import org.example.transport.calculator.service.KTXCostServiceImpl;
import org.example.ui.BasicUI;

import java.util.Scanner;

public class CostUI extends BasicUI {

    public CostUI(Scanner scanner) {
        super(scanner);
    }

    @Override
    public void execute() {
        System.out.print("사용할 교통 수단을 입력해주세요(자동차 1, KTX 2, 고속버스 3): ");
        int choice = Integer.parseInt(scanner.nextLine());

        System.out.print("이동할 거리를 입력해주세요(km): ");
        int distance = Integer.parseInt(scanner.nextLine());

        CostService service = null;

        // 사용자가 입력한 값에 따라 서비스 객체를 생성
        switch (choice) {
            case 1:
                service = new CarCostServiceImpl();
                break;
            case 2:
                service = new KTXCostServiceImpl();
                break;
            case 3:
                service = new BusCostServiceImpl();
                break;
            default:
                System.out.println("올바르지 않은 입력입니다.");
                return;
        }

        int cost = service.getCost(distance);
        String transport = choice == 1 ? "자동차" : (choice == 2 ? "KTX" : "고속버스");
        System.out.println(transport + "를 이용하여 " + distance + "km를 이동한 비용은 " + cost + "원 입니다.");

    }
}
