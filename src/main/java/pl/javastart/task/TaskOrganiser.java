package pl.javastart.task;

public class TaskOrganiser {
    private String name;
    private String description;
    private int priority;
    private Person person;

    public TaskOrganiser(String name, String description, int priority, Person person) {
        this(name, description, priority);
        this.person = person;
    }

    public TaskOrganiser(String name, String description, int priority) {
        this(name, description);
        this.priority = priority;
    }

    public TaskOrganiser(String name, String description) {
        this.name = name;
        this.description = description;
    }

    boolean highPriority(int priority) {
        return priority > 0;
    }

    boolean mediumPriority(int priority) {
        return priority == 0;
    }

    boolean lowPriority(int priority) {
        return priority < 0;
    }

    void showInfo() {
        System.out.println("Zadanie: " + name + "\nOpis: " + description + "\nOsoba: " + person.getFirstName() + ", " +
                person.getLastName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
