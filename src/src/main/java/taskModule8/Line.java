package taskModule8;

public class Line extends Shape {
    int finishX;
    int finishY;

    @Override
    public void draw() {
        System.out.println("Line drawing");
    }

    public Line(int x, int y, int finishX, int finishY) {
        this.x = x;
        this.y = y;
        this.finishX = finishX;
        this.finishY = finishY;
    }

    @Override
    public String toString() {
        return "Name of shape is " + name + ", start coordinate X is " + x + ", start coordinate Y is " + y
                + ", finish coordinate X is " + finishX + ", finish coordinate Y is " + finishY;
    }
}
