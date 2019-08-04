public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder.toString());
        cylinder = new Cylinder(5);
        System.out.println(cylinder.toString());
        cylinder = new Cylinder(5, "red", 15);
        System.out.println(cylinder.toString());
        System.out.println("The tich hinh tru:" + cylinder.getVolume());
        System.out.println("Dien tich hinh tron day:" + cylinder.getArea());
    }
}
