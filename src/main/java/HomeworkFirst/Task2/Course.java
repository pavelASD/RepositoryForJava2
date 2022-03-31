package HomeworkFirst.Task2;

public class Course {
    Team team = new Team();

    private int[] courseArray = new int[3];

    public Course(int[] courseArray) {
        this.courseArray = courseArray;
    }

    public void dolt(Team team){
        int sumCourse = 0;
        for (int i=0; i< courseArray.length; i++){
            sumCourse = sumCourse+courseArray[i];
        }
        if (sumCourse < team.getTotalAmountOfStamina()){
            team.showInfoIfTeamCouldPassCourse();
        } else if (sumCourse > team.getTotalAmountOfStamina()){
            team.showInfoIfTeamCouldNotPassCourse();
        } else if (sumCourse == team.getTotalAmountOfStamina()){
            team.showInfoIfTeamCouldPassCourse();
        }
        else
            System.out.println("ERROR");
    }
}
