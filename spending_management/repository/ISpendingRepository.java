package spending_management.repository;

import spending_management.model.Spending;

import java.util.List;
import java.util.Map;

public interface ISpendingRepository {
    Map<String, Spending> displaySpendingRepository();
    void addSpendingRepository(Spending spending);
    void deleteSpendingRepository(String spendingCodeDelete);
    void editSpendingRepository(Spending spending);
    void searchBySpendingCodeRepository(String spendingCodeFind);
    List<Spending> searchBySpendingNameRepository(String spendingNameFind);
}
