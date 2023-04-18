package fruit_manager.controller;

import fruit_manager.service.FruitService;

import java.util.Scanner;

public class FruitController {
    static FruitService fruitService = new FruitService();
    static Scanner scanner = new Scanner(System.in);
    public  void displayMenu(){
        fruitManager();
    }
    public  void fruitManager(){
        boolean check = true;
        do {
            System.out.println("1. Add new Fruit  \n" +
                    "2. Edit Fruit \n" +
                    "3. Delete Fruit \n" +
                    "4. Display List Fruit \n" +
                    "5. Return Menu \n" +
                    "Enter your selection");
            int n = Integer.parseInt(scanner.nextLine());
            switch (n){
                case 1:
                    fruitService.addFruitService();
                    break;
                case 2:
                    fruitService.editFruitService();
                    break;
                case 3:
                    fruitService.deleteFruitService();
                    break;
                case 4:
                    fruitService.displayFruitService();
                    break;
                case 5:
                    check = false;
                    break;
                default:
                    System.out.println("Mời nhập lại");
            }


        }while (check);
    }
}
