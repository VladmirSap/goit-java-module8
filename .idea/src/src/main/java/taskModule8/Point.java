package taskModule8;

public class Point extends Shape {
    int x;
    int y;

    @Override
    public String getName() {
        return "Point";
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
