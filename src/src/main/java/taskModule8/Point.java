package taskModule8;

public class Point extends Shape {
    @Override
    public void draw() {
        System.out.println("Point drawing");
    }

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "Name of shape is " + name + ", coordinate X is " + x + ", coordinate Y is " + y;

    }
}
