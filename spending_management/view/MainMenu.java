package spending_management.view;

import spending_management.controller.SpendingController;

public class MainMenu {
    public static void main(String[] args) {
        SpendingController spendingController = new SpendingController();
        spendingController.displayMenu();
    }
}
