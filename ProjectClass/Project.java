public class Project {
    private String name;
    private String description;
    private double initialCost;

    public String elevatorPitch() {
        return this.name + "($" + String.format("%.2f", initialCost) + "): " + this.description;
    }

    public Project() {
        this("None", "None", 10.00);
    }

    public Project(String name) {
        this(name, "None", 10.00);
    }

    public Project(String name, String description) {
        this(name, description, 10.00);
    }

    public Project(String name, String description, double initialCost) {
        this.name = name;
        this.description = description;
        this.initialCost = initialCost;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setInitialCost(double cost) {
        this.initialCost = cost;
    }

    public double getInitialCost() {
        return this.initialCost;
    }
}