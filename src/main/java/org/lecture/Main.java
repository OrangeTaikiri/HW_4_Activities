package org.lecture;

import java.util.Scanner;

public class Main {
    static void main() {

        ShoppingCart shoppingCart = new ShoppingCart();
        int userChoice = 0;
        boolean exitRepl = false;

        do {

            int packageAmount = 0;

            Scanner scanner = new Scanner(System.in);

            System.out.println(prntUserMenu(1));
            userChoice = scanner.nextInt();

            if (userChoice != 0) {
                do {

                    System.out.println(prntUserMenu(2));
                    packageAmount = scanner.nextInt();
                    if (packageAmount > 20) {
                        System.out.println("max. 20 Pakete");
                    }

                } while (packageAmount > 20);
            }

            switch (userChoice) {
                case 1:
                    shoppingCart.addPackage(ActivityPackage.ENTSPANNUNG, packageAmount);
                    break;
                case 2:
                    shoppingCart.addPackage(ActivityPackage.ABENTEUER, packageAmount);
                    break;
                case 3:
                    shoppingCart.addPackage(ActivityPackage.KULTUR, packageAmount);
                    break;
                case 0:
                    exitRepl = true;
                    break;
                default:
                    System.out.println("unknown menu");
                    exitRepl = true;
                    break;
            }

        } while (!exitRepl);

        shoppingCart.prntStatistics();
    }


    private static String prntUserMenu(int menu) {
        return switch (menu) {
            case (1) -> """
                       1 -> Entspannung   (40 Euro)
                       2 -> Abenteuer     (80 Euro)
                       3 -> Kultur        (60 Euro)
                       0 -> Beenden
                    """;
            case (2) -> "Wieviele Pakte möchten Sie bestellen? (max. 20 STK)";
            default -> "unknown menu";
        };
    }
}
