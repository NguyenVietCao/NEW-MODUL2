package fruit_manager.service;

import fruit_manager.model.Fruit;
import fruit_manager.repository.FruitRepository;

import java.sql.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FruitService implements IFruitService {
    static FruitRepository fruitRepository = new FruitRepository();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void displayFruitService() {
        Map<String, Fruit> fruitMap = fruitRepository.displayListFruitRepository();
        Set<String> set = fruitMap.keySet();
        for (String key : set) {
            System.out.print(key + ":" + fruitMap.get(key) + "\n");
        }
        for (Map.Entry<String, Fruit> entry : fruitMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    @Override
    public void addFruitService() {
        //(String codeFruit, String fruitName, String fruitType, String dateOfManufacture, String useDate, String origin, String price)
        System.out.println("Enter Code Fruit:");
        String codeFruit = scanner.nextLine();

        System.out.println("Enter Fruit Name: ");
        String fruitName = scanner.nextLine();

        System.out.println("Enter Fruit Type:");
        String fruitType = scanner.nextLine();

        System.out.println("Enter Date Of Manufacture:");
        String dateOfManufacture = scanner.nextLine();

        System.out.println("Enter Use Day :");
        String useDate = scanner.nextLine();

        System.out.println("Enter Origin:");
        String origin = scanner.nextLine();

        System.out.println("Enter Price:");
        String price = scanner.nextLine();

        Fruit fruit = new Fruit(codeFruit, fruitName, fruitType, dateOfManufacture, useDate, origin, price);
        fruitRepository.addFruitRepository(fruit);


    }

    @Override
    public void editFruitService() {
        System.out.println("Enter code Fruit you need edit:");
        String codeFruit = scanner.nextLine();
        Map<String, Fruit> fruitMap = fruitRepository.displayListFruitRepository();
        Set<String> set = fruitMap.keySet();
        String[] setArr = new String[set.size()];
        int count = 0;
        for (String key : set) {
            setArr[count++] = key;
        }

        for (int i = 0; i < setArr.length; i++) {
            if (codeFruit.equals(fruitMap.get(setArr[i]).getCodeFruit())) {
                System.out.println("Enter Fruit Name: ");
                String fruitName = scanner.nextLine();

                System.out.println("Enter Fruit Type:");
                String fruitType = scanner.nextLine();

                System.out.println("Enter Date Of Manufacture:");
                String dateOfManufacture = scanner.nextLine();

                System.out.println("Enter Use Day :");
                String useDate = scanner.nextLine();

                System.out.println("Enter Origin:");
                String origin = scanner.nextLine();

                System.out.println("Enter Price:");
                String price = scanner.nextLine();

                Fruit fruit = new Fruit(codeFruit, fruitName, fruitType, dateOfManufacture, useDate, origin, price);
                fruitRepository.editFruitRepository(codeFruit, fruit);
                break;
            }
        }


    }

    @Override
    public void deleteFruitService() {
        System.out.println("Enter code Fruit you need delete:");

        String codeFruit = scanner.nextLine();
        Fruit fruit = fruitRepository.findByCodeFruit(codeFruit);
        if (fruit == null) {
            System.out.println("Không tìm thấy:");
        }
        fruitRepository.deleteFruitRepository(codeFruit);
    }
}
