package gb.java2.lesson1;

public class Cat implements Movable{
    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;

    public Cat(String name, int maxRunDistance, int marJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = marJumpHeight;
    }

    @Override
    public void getJumping() {
        System.out.println(name + " is jumping");
    }

    @Override
    public void getRunning() {
        System.out.println(name + " is running");
    }

    @Override
    public int getJump() {
        return maxJumpHeight;
    }

    @Override
    public int getDistance() {
        return maxRunDistance;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
