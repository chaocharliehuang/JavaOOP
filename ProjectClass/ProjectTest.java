import java.util.ArrayList;
import java.util.Arrays;

public class ProjectTest {
    public static void main(String[] args) {
        Project p1 = new Project();
        Project p2 = new Project("project 2");
        Project p3 = new Project("project 3", "description 3");

        System.out.println(p1.elevatorPitch());
        System.out.println(p2.elevatorPitch());
        System.out.println(p3.elevatorPitch());

        p2.setInitialCost(20.0);
        p3.setInitialCost(30.0);

        ArrayList<Project> projects = new ArrayList<>(Arrays.asList(p1, p2, p3));
        Portfolio portfolio = new Portfolio(projects);
        portfolio.showPortfolio();
    }
}