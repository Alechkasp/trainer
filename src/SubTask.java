public class SubTask extends Task {
    private Epic epic;

    public SubTask(String name, int id, String description, String status, Epic epic) {
        super(name, id, description, status);
        this.epic = epic;
    }
}
