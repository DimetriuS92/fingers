package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер пальца:");
        int finger = scanner.nextInt();
        String fName;
        switch (finger) {
            case 1:
                fName = "большой";
                break;
            case 2:
                fName = "указательный";
                break;
            case 3:
                fName = "средний";
                break;
            case 4:
                fName = "безимянный";
                break;
            case 5:
                fName = "мизинец";
                break;
            default:
                fName = "Нет такого пальца";

    }
        System.out.println(fName);
}
}
