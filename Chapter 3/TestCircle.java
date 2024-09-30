 public class TestCircle {
    public static void main(String[] args) {
        Circle a = new Circle();
        Circle b = new Circle();
        Circle c = new Circle();

        a.setRadius(3);
        System.out.println("Radius: " + a.getRadius());
        System.out.println("Diameter: " + a.getDiameter());
        System.out.println("Area: " + a.getArea());

        b.setRadius(20);
        System.out.println("\nRadius: " + b.getRadius());
        System.out.println("Diameter: " + b.getDiameter());
        System.out.println("Area: " + b.getArea());
    }
}
