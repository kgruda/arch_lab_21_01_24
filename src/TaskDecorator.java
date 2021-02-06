public abstract class TaskDecorator implements Task {

    private final Task core;

    public TaskDecorator(Task core) {
        this.core = core;
    }

    public int getDate() {
        return core.getDate();
    }

    public void execute() {
        core.execute();
    }
}
