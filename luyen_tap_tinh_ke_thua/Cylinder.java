package luyen_tap_tinh_ke_thua;

public class Cylinder extends Circle {
    public double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {//overload
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return super.getArea()*this.height;
    }
    Cylinder cylinder = new Cylinder(2,"red",4);

    @Override
    public String toString() {//overthừa
        return "Cylinder{" +
                "height=" + height +
                ", which is a subclass of" + super.toString() +
                '}';
    }
}
