package HomeworkFirst.Task1;

public class Robot implements ActionInterface{

    private String id;
    private double limitOnRun;
    private double limitOnJump;

    public Robot(String id, double limitOnRun, double limitOnJump) {
        this.id = id;
        this.limitOnRun = limitOnRun;
        this.limitOnJump = limitOnJump;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
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
            System.out.println(id+" ran "+treadmill.getDistance()+"m");
        } else if (limitOnRun == treadmill.getDistance()){
            System.out.println(id+" ran "+treadmill.getDistance()+"m");
        } else if (limitOnRun < treadmill.getDistance()){
            System.out.println(id+" didn't run "+treadmill.getDistance()+"m");
        } else
            System.out.println("ERROR");
    }

    @Override
    public void jump(Wall wall) {
        if (limitOnJump > wall.getHeight()){
            System.out.println(id+" jumped over "+wall.getHeight()+"m");
        } else if (limitOnJump == wall.getHeight()){
            System.out.println(id+" didn't jump over "+wall.getHeight()+"m");
        } else if (limitOnJump < wall.getHeight()){
            System.out.println(id+" didn't jump over "+wall.getHeight()+"m");
        }
    }
}
