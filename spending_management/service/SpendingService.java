package spending_management.service;

import spending_management.model.Spending;
import spending_management.repository.SpendingRepository;

import java.util.*;

public class SpendingService implements ISpendingService {
    SpendingRepository spendingRepository = new SpendingRepository();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void displaySpendingService() {
        Map<String, Spending> spendingMap = spendingRepository.displaySpendingRepository();
        Set<String> set = spendingMap.keySet();
        for (String key : set) {
            System.out.print(key + ":" + spendingMap.get(key));
        }
    }

    @Override
    public void addSpendingService() {
//String spendingCode, String spendingName, String spendingDate, String amountSpent, String moreDescription
        System.out.println("Enter your Spending Code:");
        String spendingCode = scanner.nextLine();

        System.out.println("Enter your Spending Name:");
        String spendingName = scanner.nextLine();

        System.out.println("Enter your Spending Date:");
        String spendingDate = scanner.nextLine();

        System.out.println("Enter your Amount Spent:");
        String amountSpent = scanner.nextLine();

        System.out.println("Enter your More Description:");
        String moreDescription = scanner.nextLine();

        Spending spending = new Spending(spendingCode, spendingName, spendingDate, amountSpent, moreDescription);
        spendingRepository.addSpendingRepository(spending);

    }

    @Override
    public void editSpendingService() {
        System.out.println("Enter your Spending Code need to fix:");
        String spendingCodeInput = scanner.nextLine();

        Map<String, Spending> spendingMap = spendingRepository.displaySpendingRepository();
        Set<String> set = spendingMap.keySet();
        String[] arrSet = new String[set.size()];
        int count = 0;
        for (String key : set) {
            arrSet[count++] = key;
        }
        for (int i = 0; i < arrSet.length; i++) {
            if (spendingCodeInput.equals(spendingMap.get(arrSet[i]).getSpendingCode())) {
                System.out.println("Enter your Spending Name:");
                String spendingName = scanner.nextLine();

                System.out.println("Enter your Spending Date:");
                String spendingDate = scanner.nextLine();

                System.out.println("Enter your Amount Spent:");
                String amountSpent = scanner.nextLine();

                System.out.println("Enter your More Description");
                String moreDescription = scanner.nextLine();

                Spending spending = new Spending(spendingCodeInput, spendingName, spendingDate, amountSpent, moreDescription);
                spendingRepository.editSpendingRepository(spending);
            }

        }

    }

    @Override
    public void deleteSpendingService() {
        System.out.println("Enter your Spending Code need to Delete:");
        String spendingCodeDelete = scanner.nextLine();
        Map<String, Spending> spendingMap = spendingRepository.displaySpendingRepository();
        Set<String> set = spendingMap.keySet();
        int count = 0;
        String[] arrset = new String[set.size()];
        for (String key : set) {
            arrset[count++] = key;
        }
        for (int i = 0; i < arrset.length; i++) {
            if (spendingCodeDelete.equals(spendingMap.get(arrset[i]).getSpendingCode())) {
                spendingRepository.deleteSpendingRepository(spendingCodeDelete);
            }

        }

    }

    @Override
    public void searchBySpendingCodeService() {
        System.out.println("Enter your Spending Code you need to find");
        String spendingCodeFind = scanner.nextLine();
        Map<String, Spending> spendingMap = spendingRepository.displaySpendingRepository();
        Set<String>set = spendingMap.keySet();
        for (String key:set) {
            if (spendingCodeFind.equals(spendingMap.get(key).getSpendingCode())){
                spendingRepository.searchBySpendingCodeRepository(spendingCodeFind);
            }
        }
    }

    @Override
    public void searchBySpendingNameService() {
        System.out.println("Enter your Spending Name you need to find: ");
        String spendingNameFind = scanner.nextLine();
       List<Spending>spendingList =  spendingRepository.searchBySpendingNameRepository(spendingNameFind);
        System.out.println(spendingList);

    }
}
