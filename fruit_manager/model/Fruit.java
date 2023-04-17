package fruit_manager.model;

public class Fruit {
    private String codeFruit;

    private String fruitName;
    private String fruitType;
    private String dateOfManufacture;
    private String useDate;
    private String origin;
    private String price;

    public Fruit() {
    }

    public Fruit(String codeFruit, String fruitName, String fruitType, String dateOfManufacture, String useDate, String origin, String price) {
        this.codeFruit = codeFruit;
        this.fruitName = fruitName;
        this.fruitType = fruitType;
        this.dateOfManufacture = dateOfManufacture;
        this.useDate = useDate;
        this.origin = origin;
        this.price = price;
    }

    public String getCodeFruit() {
        return codeFruit;
    }

    public void setCodeFruit(String codeFruit) {
        this.codeFruit = codeFruit;
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
                "codeFruit='" + codeFruit + '\'' +
                ", fruitName='" + fruitName + '\'' +
                ", fruitType='" + fruitType + '\'' +
                ", dateOfManufacture='" + dateOfManufacture + '\'' +
                ", useDate='" + useDate + '\'' +
                ", origin='" + origin + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
