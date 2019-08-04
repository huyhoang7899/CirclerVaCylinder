public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.toString());
        circle = new Circle(5, "red");
        System.out.println(circle.toString());
        System.out.println("Diện tích hình tròn : " + circle.getArea());
    }
}
