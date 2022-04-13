package HomeworkFirst.Task1;

public class Human implements ActionInterface{

    private String name;
    private double limitOnRun;
    private double limitOnJump;


    Treadmill treadmill = new Treadmill();
    Wall wall = new Wall();

    public Human(String name, double limitOnRun, double limitOnJump) {
        this.name = name;
        this.limitOnRun = limitOnRun;
        this.limitOnJump = limitOnJump;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getLimitOnRun() {
        return limitOnRun;
    }
    public void setLimitOnRun(double limitOnRun) {
        this.limitOnRun = limitOnRun;
    }
    public double getLimitOnJump() {
        return limitOnJump;
    }
    public void setLimitOnJump(double limitOnJump) {
        this.limitOnJump = limitOnJump;
    }

    @Override
    public void run(Treadmill treadmill) {
        if (limitOnRun > treadmill.getDistance()){
            System.out.println(name+" ran "+treadmill.getDistance()+"m");
        } else if (limitOnRun == treadmill.getDistance()){
            System.out.println(name+" ran "+treadmill.getDistance()+"m");
        } else if (limitOnRun < treadmill.getDistance()){
            System.out.println(name+" didn't run "+treadmill.getDistance()+"m");
        } else
            System.out.println("ERROR");
    }

    @Override
    public void jump(Wall wall) {
        if (limitOnJump > wall.getHeight()){
            System.out.println(name+" jumped over "+wall.getHeight()+"m");
        } else if (limitOnJump == wall.getHeight()){
            System.out.println(name+" didn't jump over "+wall.getHeight()+"m");
        } else if (limitOnJump < wall.getHeight()){
            System.out.println(name+" didn't jump over "+wall.getHeight()+"m");
        }
    }

}
