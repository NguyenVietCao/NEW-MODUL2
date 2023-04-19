package spending_management.repository;

import spending_management.model.Spending;

import java.util.*;

public class SpendingRepository implements ISpendingRepository {

    Spending spending = new Spending();
    static List<Spending> spendingList = new ArrayList<>();
    static Map<String, Spending> spendingMap = new HashMap<>();

    static {

        Spending spending1 = new Spending("01", "mua day dien", "12", "300000", "300m");
        Spending spending2 = new Spending("02", "mua ong nuoc", "15", "500000", "20 cay");
        Spending spending3 = new Spending("03", "mua o cam", "17", "600000", "20 o");
        spendingList.add(spending1);
        spendingList.add(spending2);
        spendingList.add(spending3);
        spendingMap.put("01", spending1);
        spendingMap.put("02", spending2);
        spendingMap.put("03", spending3);
    }

    @Override
    public Map<String, Spending> displaySpendingRepository() {
        return spendingMap;
    }

    @Override
    public void addSpendingRepository(Spending spending) {
        spendingMap.put(spending.getSpendingCode(), spending);
    }

    @Override
    public void deleteSpendingRepository(String spendingCodeDelete) {
        spendingMap.remove(spendingCodeDelete);
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
        List<Spending>spendingList1 = new ArrayList<>();
        Set<String> set = spendingMap.keySet();
        for (String key:set) {
            if (spendingMap.get(key).getSpendingName().contains(spendingNameFind)){
             spendingList1.add(spendingMap.get(key));
            }

        }
        return spendingList1;
    }


}
