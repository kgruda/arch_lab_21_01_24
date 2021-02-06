import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(new TaskBuilder("Sprzątanie")
                .setDate(20)
                .setDuration(90)
                .setAssignee("Karol").build());
        tasks.add(new TaskBuilder("Gotowanie")
                .setDate(24)
                .setDuration(120)
                .setAssignee("Lidka").build());
        tasks.add(new TaskBuilder("Ubieranie choinki")
                .setDate(3)
                .setDuration(60)
                .setAssignee("Zenon").build());
        tasks.add(new UrgentTask(new TaskBuilder("Pakowanie prezentów")
                .setDate(24)
                .setDuration(30)
                .setAssignee("Zbyszek").build()));


        DateFilterTaskVisitor filter = new DateFilterTaskVisitor(24);
        for(Task task : tasks) {
            task.accept(filter);
        }
    }

}

