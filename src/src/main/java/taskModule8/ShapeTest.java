package taskModule8;

public class ShapeTest {
    public static void main(String[] args) {
        Shape point = new Point(20, 20);
        point.setName("Point");
        point.draw();
        System.out.println(point);

        Shape circle = new Circle(10, 20, 10);
        circle.setName("Circle");
        circle.draw();
        System.out.println(circle);

        Shape line = new Line(5, 5, 15, 15);
        line.setName("Line");
        line.draw();
        System.out.println(line);

        Shape rectangle = new Rectangle(10, 10, 15, 20);
        rectangle.setName("Rectangle");
        rectangle.draw();
        System.out.println(rectangle);

        Shape quad = new Quad(5, 7, 20);
        quad.setName("Quad");
        quad.draw();
        System.out.println(quad);
    }
}
