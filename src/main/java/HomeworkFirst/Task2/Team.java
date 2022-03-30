package HomeworkFirst.Task2;

public class Team {
    private String teamName;
    private String[] teamArray = new String[3];
    static int totalAmountOfStamina;

    public Team() {
    }

    public Team(String teamName, String[] teamArray, int totalAmountOfStamina) {
        this.teamName = teamName;
        this.teamArray = teamArray;
        this.totalAmountOfStamina = totalAmountOfStamina;
    }
    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    public String[] getTeamArray() {
        return teamArray;
    }
    public void setTeamArray(String[] teamArray) {
        this.teamArray = teamArray;
    }
    public int getTotalAmountOfStamina() {
        return totalAmountOfStamina;
    }
    public void setTotalAmountOfStamina(int totalAmountOfStamina) {
        this.totalAmountOfStamina = totalAmountOfStamina;
    }

    public void showInfoAllTeam(){
        System.out.println("team name is "+teamName);
        System.out.println("team composition: ");
        for (String x:this.teamArray){
            System.out.println(x+" ");
        }
    }

    public void showInfoIfTeamCouldPassCourse(){
        System.out.println("team name is "+teamName+" passed");
    }

    public void showInfoIfTeamCouldNotPassCourse(){
        System.out.println("team name is "+teamName+" didn't pass");
    }
}
