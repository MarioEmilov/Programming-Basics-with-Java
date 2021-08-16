import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //вход: ред 1: име, ред 2: брой проекти
        //необходими часове = брой проекти * 3
        //изход
        String name = scanner.nextLine();
        int countProjects = Integer.parseInt(scanner.nextLine());
        int needHours = countProjects * 3;
        //string -> %s
        //double -> %f
        //int -> %d
        //"The architect {името на архитекта} will need {необходими часове} hours to complete {брой на проектите} project/s."
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, needHours, countProjects);

    }
}
