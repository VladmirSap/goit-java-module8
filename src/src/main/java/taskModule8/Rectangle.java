package taskModule8;

public class Rectangle extends Shape {

    int width;
    int height;

    @Override
    public void draw() {
        System.out.println("Rectangle drawing");
    }

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Name of shape is " + name + ", coordinate X is " + x + ", coordinate Y is " + y
                + ", width is " + width + ", height is " + height;
    }
}
