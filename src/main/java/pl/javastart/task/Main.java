package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Katarzyna", "Kowalska");
        Person person2 = new Person("Agnieszka", "Chylinska");
        TaskOrganiser task1 = new TaskOrganiser("Sprzatanie", "Sprzatanie kuchni i lazienki", 5,
                person1);
        TaskOrganiser task2 = new TaskOrganiser("Gotowanie",
                "Przyrzadzenie sniadania, obiadu i kolacji.", -3, person2);
        TaskOrganiser task3 = new TaskOrganiser("Pranie", "Pranie co tydzien w sobote.", 0,
                person1);
        task1.showInfo();
        System.out.println("Czy zadanie jest o wysokim priorytecie? " + task1.highPriority(task1.getPriority()));
        task2.showInfo();
        System.out.println("Czy zadanie jest o niskim priorytecie? " + task2.lowPriority(task2.getPriority()));
        task3.showInfo();
        System.out.println("Czy zadanie jest o srednim priorytecie? " + task3.mediumPriority(task3.getPriority()));
    }
}
