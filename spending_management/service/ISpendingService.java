package spending_management.service;

public interface ISpendingService {
    void displaySpendingService();
    void addSpendingService() ;
    void editSpendingService();
    void deleteSpendingService()throws IdNotFoundException;
    void searchBySpendingCodeService();
    void searchBySpendingNameService();
    void sortByNameService();
    void sortBySpendingService();
}
