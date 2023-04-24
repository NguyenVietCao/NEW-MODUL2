package spending_management.repository;

import spending_management.model.Spending;
import spending_management.util.ReadAndWrite;

import java.util.*;

public class SpendingRepository implements ISpendingRepository {

    //    Spending spending = new Spending();
    static List<Spending> spendingList = new ArrayList<>();
    static Map<String, Spending> spendingMap = new HashMap<>();
    static String PATH_FILE = "/Applications/Cao_laptrinh/Cao_codegym/NewModul2/spending_management/data/spending.csv";


    static {

        Spending spending1 = new Spending("01", "mua day dien", "12", "300000", "300m");
        Spending spending2 = new Spending("02", "mua ong nuoc", "15", "500000", "20 cay");
        Spending spending3 = new Spending("03", "mua o cam", "17", "600000", "20 o");
//        spendingList.add(spending1);
//        spendingList.add(spending2);
//        spendingList.add(spending3);
        spendingMap.put("01", spending1);
        spendingMap.put("02", spending2);
        spendingMap.put("03", spending3);
        Set<String> set = spendingMap.keySet();
        for (String s : set) {
            spendingList.add(spendingMap.get(s));
        }

    }


    @Override
    public Map<String, Spending> displaySpendingRepository() {
        List<String> stringList = ReadAndWrite.readFile(PATH_FILE);
        for (int i = 0; i < stringList.size(); i++) {
            String [] arrSpending = stringList.get(i).split(",");
            Spending spending = new Spending(arrSpending[0],arrSpending[1],arrSpending[2],arrSpending[3],arrSpending[4] );
            spendingMap.put(spending.getSpendingCode(),spending);
        }
        return spendingMap;
    }

    @Override
    public List<Spending> displaySpendByList() {
        List<Spending> spendings = new ArrayList<>();
        List<String> stringList = ReadAndWrite.readFile(PATH_FILE);
        for (int i = 0; i < stringList.size(); i++) {
            String[] arrSpending = stringList.get(i).split(",");
            Spending spending = new Spending(arrSpending[0], arrSpending[1], arrSpending[2], arrSpending[3], arrSpending[4]);
            spendings.add(spending);
        }
        return spendings;
    }

    @Override
    public void addSpendingRepository(Spending spending) {
        spendingMap.put(spending.getSpendingCode(), spending);
        saveToFile();
    }

    @Override
    public void deleteSpendingRepository(String spendingCodeDelete) {
        System.out.println("as");
        spendingMap.remove(spendingCodeDelete);
        saveToFile();
    }

    @Override
    public List<String> deleteSpendingData(String spendingCodeDelete) {
        List<String> spendings = ReadAndWrite.readFile(PATH_FILE);
        String[] arrSpending = spendings.get(0).split(",");
        Spending spending = new Spending(arrSpending[0], arrSpending[1], arrSpending[2], arrSpending[3], arrSpending[4]);
        System.out.println(spendings);
        for (int i = 0; i < spendings.size(); i++) {
            if (spendingCodeDelete.equals(spending.getSpendingCode())) {
                spendings.remove(spending);
            }

        }
        System.out.println(spendings);

        return spendings;
    }

    @Override
    public void editSpendingRepository(Spending spending) {
        spendingMap.replace(spending.getSpendingCode(), spending);

    }

    @Override
    public void searchBySpendingCodeRepository(String spendingCodeFind) {
        spendingMap.get(spendingCodeFind);
        System.out.println(spendingMap.get(spendingCodeFind));

    }

    @Override
    public List<Spending> searchBySpendingNameRepository(String spendingNameFind) {
        List<Spending> spendingList1 = new ArrayList<>();
        Set<String> set = spendingMap.keySet();
        for (String key : set) {
            if (spendingMap.get(key).getSpendingName().contains(spendingNameFind)) {
                spendingList1.add(spendingMap.get(key));
            }

        }
        return spendingList1;
    }

    @Override
    public List<Spending> sortByNameRepository() {
        Comparator<Spending> comparatorByName = new Comparator<Spending>() {
            @Override
            public int compare(Spending o1, Spending o2) {
                return o1.getSpendingName().compareTo(o2.getSpendingName());
            }
        };
        Set<String> set = spendingMap.keySet();
        spendingList.clear();
        for (String s : set) {
            spendingList.add(spendingMap.get(s));
        }
        Collections.sort(spendingList, comparatorByName);
        return spendingList;
    }

    @Override
    public List<Spending> sortBySpendingRepository(String amountSpent) {
        Comparator<Spending> comparatorByAmountSpent = new Comparator<Spending>() {
            @Override
            public int compare(Spending o1, Spending o2) {
                // ép kiểu
                int amount1 = Integer.parseInt(o1.getAmountSpent());
                int amount2 = Integer.parseInt(o2.getAmountSpent());
                return amount1 - amount2;
            }
        };
        Set<String> set = spendingMap.keySet();
        spendingList.clear();
        for (String s : set) {
            spendingList.add(spendingMap.get(s));
        }
        Collections.sort(spendingList, comparatorByAmountSpent);
        return spendingList;
    }

    @Override
    public void saveToFile() {
        ReadAndWrite.writeFile(PATH_FILE, spendingMap, false);
    }


}
