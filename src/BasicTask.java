public class BasicTask implements Task, Visitable {
    private final String name;
    private final int duration;
    private final int date;
    private final String personName;

    public BasicTask(String name, int duration, int date, String personName){
        this.name = name;
        this.duration = duration;
        this.date = date;
        this.personName = personName;
    }

    public int getDate() {
        return date;
    }

    public void execute() {
        System.out.println(name + "\t\t- WYKONANO");
    }

    public void accept(TaskVisitor v) {
        v.visit(this);
    }
}


