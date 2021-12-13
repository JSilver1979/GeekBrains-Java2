package gb.java2.lesson1;

public class Treadmill implements Obstacles{
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public boolean isPassed(String name, int distances) {
        if (this.length < distances) {
            System.out.println(name + " is ran the treadmill");
            return true;
        } else {
            System.out.println(name + " is failed to run the treadmill");
            return false;
        }
    }
}
