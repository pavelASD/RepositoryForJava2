package HomeworkFirst.Task2;

public class Main {
    public static void main(String[] args) {

        Team firstTeam = new Team("Alpha", new String[]{"James", "Thomas", "Alice", "Katy"}, 1800);
        Team secondTeam = new Team("Beta", new String[]{"Alex", "John", "Harry", "Han SeoJoon"}, 2000);

        Course courseForFirstTeam = new Course(new int[]{120, 290, 700, 300});
        Course courseForSecondTeam = new Course(new int[]{120, 600, 234, 500});
        courseForFirstTeam.dolt(firstTeam);
        System.out.println("");
        courseForSecondTeam.dolt(secondTeam);

    }
}
