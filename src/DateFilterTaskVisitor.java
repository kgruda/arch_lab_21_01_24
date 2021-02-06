public class DateFilterTaskVisitor implements TaskVisitor{

    private final int date;
    public DateFilterTaskVisitor(int date) {
        this.date = date;
    }

    @Override
    public void visit(Task task) {
        if(task.getDate() == date) {
            task.execute();
        }
    }
}
