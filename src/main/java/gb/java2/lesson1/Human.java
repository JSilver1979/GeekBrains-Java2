package gb.java2.lesson1;

public class Human implements Movable {
    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;

    public Human(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public void getRunning() {
        System.out.println(name + " is running");
    }

    @Override
    public void getJumping() {
        System.out.println(name + " is jumping");
    }

    @Override
    public int getJump() {
        return maxJumpHeight;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getDistance() {
        return maxRunDistance;
    }
}
