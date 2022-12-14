package ict;

public class Walker {
    protected int elevation;
    protected int distance;

    protected void move(int i) {
        this.distance += i;
    }

    protected static void print(Walker w) {
        System.out.println(w.distance + "-" + w.elevation);
    }
}

class UphillWalker extends Walker {
    public int elevation;
    public int distance;

    public void move(int i) {
        this.distance += i;
        this.elevation = 1;
    }

    public static void print(Walker w) {
        System.out.println(w.distance + "-" + w.elevation);
    }

    public static void main(String[] args) {
        Walker walker = new Walker();
        walker.move(10);
        UphillWalker.print(walker);

        Walker uphillWalker = new UphillWalker();
        uphillWalker.move(10);
        uphillWalker.print(uphillWalker);
        System.out.println(uphillWalker.elevation);
        System.out.println(uphillWalker.distance);
        System.out.println(((UphillWalker) uphillWalker).distance);
        System.out.println(((UphillWalker) uphillWalker).elevation);

    }
}