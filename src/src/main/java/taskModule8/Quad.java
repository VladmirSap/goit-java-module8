package taskModule8;

public class Quad extends Shape {

    int width;

    @Override
    public void draw() {
        System.out.println("Quad drawing");
    }

    public Quad(int x, int y, int width) {
        this.x = x;
        this.y = y;
        this.width = width;
    }
    @Override
    public String toString() {
        return "Name of shape is " + name + ", coordinate X is " + x + ", coordinate Y is " + y
                + ", width is " + width;
    }
}
