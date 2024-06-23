package taskModule8;

public class Quad extends Shape {
    int x;
    int y;
    int width;

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getX() {
        return super.getX();
    }

    @Override
    public void setX(int x) {
        super.setX(x);
    }

    @Override
    public int getY() {
        return super.getY();
    }

    @Override
    public void setY(int y) {
        super.setY(y);
    }

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
