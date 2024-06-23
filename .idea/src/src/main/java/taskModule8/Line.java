package taskModule8;

public class Line extends Shape {
    int x;
    int y;
    int finishX;
    int finishY;



    @Override
    public String getName() {
        return "line";
    }

    @Override
    public int getX() {
        return super.getX();
    }

    @Override
    public int getY() {
        return super.getY();
    }

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
