package gb.java2.lesson1;

public class HomeworkApp1 {
    public static void main(String[] args) {
//  Task 1
        Human man = new Human("John", 1000, 3);
        man.getRunning();
        man.getJumping();
        System.out.println();

        Cat cat = new Cat("Markiz",100, 1);
        cat.getJumping();
        cat.getRunning();
        System.out.println();

        Robot bot = new Robot("Boston Dynamics", 89532, 5000, 0);
        bot.getJumping();
        bot.getRunning();
        System.out.println();

//  Task 2

        Wall smallWall = new Wall(1);
        smallWall.isPassed(man.getName(), man.getJump());
        System.out.println();

        Treadmill treadmill = new Treadmill(100);
        treadmill.isPassed(bot.getName(), bot.getDistance());
        System.out.println();

//  Task 3 & 4

        Movable movable[] = new Movable[3];
        movable[0] = new Cat("Barsik", 50, 2);
        movable[1] = new Human("Jack", 500, 3);
        movable[2] = new Robot("Izhevsk Mashinery", 3367, 3000, 5);

        Obstacles obstacles[] = new Obstacles[4];
        obstacles[0] = new Wall(1);
        obstacles[1] = new Treadmill(55);
        obstacles[2] = new Treadmill(600);
        obstacles[3] = new Wall(4);

        for (Movable mov: movable) {
            for (Obstacles obs: obstacles) {
                if (obs instanceof Wall) {
                    if (!obs.isPassed(mov.getName(), mov.getJump())) {
                        break;
                    }
                } else {
                    if (!obs.isPassed(mov.getName(), mov.getDistance())) {
                        break;
                    }
                }
            }
        }
    }
}
