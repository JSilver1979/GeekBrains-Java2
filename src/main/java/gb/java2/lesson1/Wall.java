package gb.java2.lesson1;

public class Wall implements Obstacles{
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean isPassed(String name, int distance) {

        if (this.height < distance) {
            System.out.println(name + " is jumped over wall");
            return true;
        } else {
            System.out.println(name + " is failed to jump over wall");
            return false;
        }
    }

}
