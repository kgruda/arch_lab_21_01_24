public class UrgentTask extends TaskDecorator implements Visitable {

    public UrgentTask(Task core) {
        super(core);
    }

    @Override
    public void execute() {
        System.out.print("WAŻNE! ");
        super.execute();
    }

    @Override
    public void accept(TaskVisitor v) {
        v.visit(this);
    }
}
