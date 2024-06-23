package taskModule8;

public abstract class Shape implements Drawable {

    private int x;
    private int y;

    String name = "shape";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getX() {
        return 0;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }


    @Override
    public int getY() {
        return 0;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }
}
