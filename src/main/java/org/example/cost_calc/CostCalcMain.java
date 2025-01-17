package org.example.cost_calc;

import java.util.Scanner;

public class CostCalcMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("사용할 교통 수단을 입력해주세요(자동차 1, KTX 2, 고속버스 3): ");
        int transport = Integer.parseInt(scanner.nextLine());

        System.out.print("이동할 거리를 입력해주세요(km): ");
        int distance = Integer.parseInt(scanner.nextLine());

        int charge = 0;

        if (transport== 1) {
            charge = distance * 130;
            System.out.println("자동차를 이용하여 " + distance + "km를 이동한 비용은 " + charge + "원 입니다.");

        } else if (transport == 2) {
            charge = 30000 + distance * 50;
            System.out.println("KTX를 이용하여 " + distance + "km를 이동한 비용은 " + charge + "원 입니다.");


        } else if (transport == 3) {
            charge = 10000 + 10000 + distance * 10;
            System.out.println("고속버스를 이용하여 " + distance + "km를 이동한 비용은 " + charge + "원 입니다.");


        } else {
            System.out.println("입력이 올바르지 않습니다.");
        }



    }
}
