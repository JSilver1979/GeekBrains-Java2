package gb.java2.lesson1;

public class Robot implements Movable{
    private String model;
    private int serialID;
    private int maxRunDistance;
    private int maxJumpHeight;

    public Robot(String model, int serialID, int maxRunDistance, int maxJumpHeight) {
        this.model = model;
        this.serialID = serialID;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    public String getName() {
        return "Bot " + model + ", ID: " + serialID;
    }

    @Override
    public void getJumping() {
        if (this.maxJumpHeight <=0) {
            System.out.println("Bot " + model + ", ID: " + serialID + " can't jump");
        } else {
            System.out.println("Bot " + model + ", ID: " + serialID + " is jumping");
        }
    }

    @Override
    public void getRunning() {
        System.out.println("Bot " + model + ", ID: " + serialID + " is running");
    }

    @Override
    public int getJump() {
        return maxJumpHeight;
    }

    @Override
    public int getDistance() {
        return this.maxRunDistance;
    }

}
