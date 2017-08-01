import java.util.ArrayList;

public class Portfolio {
    ArrayList<Project> projects = new ArrayList<>();

    public Portfolio() {
    }
    public Portfolio(ArrayList<Project> projects) {
        this.projects = projects;
    }

    public void setProjects(ArrayList<Project> projects) {
        this.projects = projects;
    }

    public ArrayList<Project> getProjects() {
        return this.projects;
    }

    public double getPortfolioCost() {
        double portfolioCost = 0.0;
        for (Project project : this.projects) {
            portfolioCost += project.getInitialCost();
        }
        return portfolioCost;
    }

    public void showPortfolio() {
        for (Project project : this.projects) {
            System.out.println(project.elevatorPitch());
        }
        System.out.println("Total cost: $" + String.format("%.2f", this.getPortfolioCost()));
    }
}