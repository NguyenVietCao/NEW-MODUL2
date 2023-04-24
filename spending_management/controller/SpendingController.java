package spending_management.controller;

import spending_management.service.IdNotFoundException;
import spending_management.service.SpendingService;
import spending_management.service.UniqueIDException;

import java.util.Scanner;

public class SpendingController {
    Scanner scanner = new Scanner(System.in);
    SpendingService spendingService = new SpendingService();

    public void displayMenu() {
        boolean check = true;
        do {
            System.out.printf("1. Spending Manager \n" +
                    "2. Exit \n" +
                    "Mời chọn chức năng: ");
            int n = Integer.parseInt(scanner.nextLine());
            switch (n) {
                case 1:
                    spendingManage();
                    break;
                case 2:
                    check = false;
                    break;
                default:
                    System.out.printf("Chức năng không tồn tại");
            }
        } while (check);
    }

    public void spendingManage() {
        boolean check = true;
        do {
            System.out.println("1. Display List Spending \n" +
                    "2. Add Spending \n" +
                    "3. Delete Spending \n" +
                    "4. Edit Spending \n" +
                    "5. Search by Spending Code \n" +
                    "6. Search by Spending Name \n" +
                    "7. Sort by name ascending \n" +
                    "8. Sort spending in descending order \n" +
                    "9. Return Menu \n" +
                    "Mời chọn chức năng: ");
            int n = Integer.parseInt(scanner.nextLine());
            switch (n) {
                case 1:
                    spendingService.displaySpendingService();
                    break;
                case 2:
                    spendingService.addSpendingService();
                    break;
                case 3:
                    try {
                        spendingService.deleteSpendingService();

                    } catch (IdNotFoundException e) {
                        System.err.println(e);
                    }
                    break;
                case 4:
                    spendingService.editSpendingService();
                    break;
                case 5:
                    spendingService.searchBySpendingCodeService();
                    break;
                case 6:
                    spendingService.searchBySpendingNameService();
                    break;
                case 7:
                    spendingService.sortByNameService();
                    break;
                case 8:
                    spendingService.sortBySpendingService();
                    break;
                case 9:
                    check = false;
                    break;
                default:
                    System.out.println("Chức năng không tồn tại");
            }
        } while (check);
    }
}
