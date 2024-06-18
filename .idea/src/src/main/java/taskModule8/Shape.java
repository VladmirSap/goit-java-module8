package taskModule8;

public class Shape implements Drawable, Borderable {

    private String name;

    public Shape(String name) {
        this.name = name;
    }
    @Override
    public double borderWidth() {
        return 0;
    }

    public double X() {
        return 0;
    }

    public double Y() {
        return 0;
    }

    public void color() {

    }
}
