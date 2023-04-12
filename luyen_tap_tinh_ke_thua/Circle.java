package luyen_tap_tinh_ke_thua;

public class Circle {
    private double radius;//thành phần không được kế thừa
    private String color;// thành phần không dược kế thừa

    public Circle() {
    }

    public Circle(double radius, String color) { //overload
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return Math.pow(this.radius,2)*Math.PI;
    }

    @Override
    public String toString() {//override object
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
