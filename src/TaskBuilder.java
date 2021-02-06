public class TaskBuilder {
    private String name;
    private int duration;
    private int date;
    private String personName;

    TaskBuilder(String name) {
        this.name = name;
        this.duration = 0;
        this.date = 0;
        this.personName = "Unassigned";
    }

    public TaskBuilder setDuration(int duration) {
        this.duration = duration;
        return this;
    }

    public TaskBuilder setDate(int date) {
        this.date = date;
        return this;
    }

    public TaskBuilder setAssignee(String person) {
        this.personName = person;
        return this;
    }

    public BasicTask build() {
        return new BasicTask(name, duration, date, personName);
    }
}
