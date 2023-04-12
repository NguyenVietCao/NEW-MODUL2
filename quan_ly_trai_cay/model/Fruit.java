package quan_ly_trai_cay.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fruit {
    private String fruitName;
    private String fruitType;
    private String dateOfManufacture;
    private String useDate;
    private String origin;
    private String price;

    public Fruit() {
    }

    public Fruit(String fruitName, String fruitType, String dateOfManufacture, String useDate, String origin, String price) {
        this.fruitName = fruitName;
        this.fruitType = fruitType;
        this.dateOfManufacture = dateOfManufacture;
        this.useDate = useDate;
        this.origin = origin;
        this.price = price;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public String getFruitType() {
        return fruitType;
    }

    public void setFruitType(String fruitType) {
        this.fruitType = fruitType;
    }

    public String getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(String dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public String getUseDate() {
        return useDate;
    }

    public void setUseDate(String useDate) {
        this.useDate = useDate;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "fruitName='" + fruitName + '\'' +
                ", fruitType='" + fruitType + '\'' +
                ", dateOfManufacture='" + dateOfManufacture + '\'' +
                ", useDate='" + useDate + '\'' +
                ", origin='" + origin + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    static List<Fruit> fruitList = new ArrayList<>();


    static {
        Fruit f1 = new Fruit("tao", "tot", "12", "30", "china", "12ussd");
        Fruit f2 = new Fruit("nho", "thuong", "15", "28", "vietnam", "10usd");
        Fruit f3 = new Fruit("kiwi", "bet", "19", "20", "usa", "30usd");
        Fruit f4 = new Fruit("thot not", "tot", "1", "15", "campuchia", "3usd");
        Fruit f5 = new Fruit("vai", "tot", "12", "34", "vietnam", "12usd");
        fruitList.add(f1);
        fruitList.add(f2);
        fruitList.add(f3);
        fruitList.add(f4);
        fruitList.add(f5);
    }

    public static void display() {
        System.out.println("-------DANH SÁCH TRÁI CÂY------%n");


        System.out.printf("+-------------+-------------+-----------------------+-------------+---------+-------+%n");
        String leftAlignFormat = "|%-3s| %-10s | %-11s | %21s |%-13s|%-10s|%-7s|%n";
        System.out.format("|STT|FRUIT NAME  | FRUIT TYPE  |  DATE OF MANUFACTURE  |   USE DATE  |  ORIGIN  | PRICE|%n");
        System.out.format("+============+=============+=======================+=============+==========+=======+%n");
        for (int i = 0; i < fruitList.size(); i++) {
            System.out.format(leftAlignFormat,i,fruitList.get(i).getFruitName(),fruitList.get(i).getFruitType(),fruitList.get(i).getDateOfManufacture(),fruitList.get(i).getUseDate(),fruitList.get(i).getOrigin(),fruitList.get(i).getPrice());
        }
        System.out.format("+-------------+-------------+-----------------------+-------------+----------+----+%n");
//        for (Fruit f : fruitList) {
//            System.out.format(String.valueOf(f));
//        }
    }

    public static void addFruit() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập tên trái cây:");
        String fruitName = scanner.nextLine();

        System.out.println("Nhập loại trái cây:");
        String fruitType = scanner.nextLine();

        System.out.println("Nhập ngày sản xuất");
        String dateOfManufacture = scanner.nextLine();

        System.out.println("Nhập hạn sử dụng");
        String useDate = scanner.nextLine();

        System.out.println("Nhập xuất xứ");
        String origin = scanner.nextLine();

        System.out.println("Nhập giá");
        String price = scanner.nextLine();
        Fruit fruit = new Fruit(fruitName, fruitType, dateOfManufacture, useDate, origin, price);
        fruitList.add(fruit);
    }

}
