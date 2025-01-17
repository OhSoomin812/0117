package org.example.transport.calculator;

import org.example.transport.calculator.ui.CostUI;

import java.util.Scanner;

public class CostCalcMain2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CostUI costUI = new CostUI(scanner);

        costUI.execute();

        scanner.close();
    }

}
