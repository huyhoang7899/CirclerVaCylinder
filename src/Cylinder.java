public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * Math.pow(super.getRadius(), 2) * this.height;
    }

    @Override
    public String toString() {
        return "Hình trụ có chiều cao là : " + this.height + " và " + super.toString();
    }
}
