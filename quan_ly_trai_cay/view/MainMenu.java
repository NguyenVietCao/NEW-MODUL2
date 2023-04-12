package quan_ly_trai_cay.view;

import quan_ly_trai_cay.model.Fruit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMenu {
    static Scanner scanner = new Scanner(System.in);
   static List<Fruit> fruitList = new ArrayList<>();

    public static void main(String[] args) {
        boolean check = true;
     do {
         System.out.println("Mời nhập số chọn chức năng: \n" +
                 "1. Hiển thị danh sách \n" +
                 "2. Thêm trái cây \n" +
                 "3. Thoát" +
                 "Mời nhập lại");
         int n = Integer.parseInt(scanner.nextLine());
         switch (n){
             case 1:
                 Fruit.display();
                 break;
             case 2:
               Fruit.addFruit();

                 break;
             case 3:
                 break;
             default:
                 System.out.println("không tồn tại");
         }


     }while (check);
    }
}
