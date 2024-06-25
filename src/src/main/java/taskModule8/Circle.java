package taskModule8;

public class Circle extends Shape {

    int radius;

   @Override
    public void draw() {
        System.out.println("Circle drawing");
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(int radius, int x, int y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Name of shape is " + name + ", radius is " + radius +
                ", coordinate X is " + x + ", coordinate Y is " + y;
    }
}
