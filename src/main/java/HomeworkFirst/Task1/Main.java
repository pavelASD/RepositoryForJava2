package HomeworkFirst.Task1;

public class Main {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {

        Treadmill[] treadmills = new Treadmill[3];
        treadmills[0] = new Treadmill(1400);
        treadmills[1] = new Treadmill(1800);
        treadmills[2] = new Treadmill(2500);

        Wall[] walls = new Wall[3];
        walls[0] = new Wall(0.4);
        walls[1] = new Wall(0.9);
        walls[2] = new Wall(1.7);

        Human[] humans = new Human[3];
        humans[0] = new Human("James", 2700, 2);
        humans[0].run(treadmills[2]);
        humans[0].jump(walls[1]);
        System.out.println("");
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Murzik", 1000, 4);
        cats[0].run(treadmills[1]);
        cats[0].jump(walls[2]);
        System.out.println("");
        Robot[] robots = new Robot[12];
        robots[0] = new Robot("e2r5", 10000, 0.75);
        robots[0].run(treadmills[1]);
        robots[0].jump(walls[1]);

    }
}
