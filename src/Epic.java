import java.util.ArrayList;

public class Epic extends Task {
    private ArrayList<Integer> subTasks = new ArrayList<>();

    public Epic(String name, int id, String description, String status) {
        super(name, id, description, status);
    }

    //добавить SubTask в Epic
    public void addSubTaskToEpic(int id) {
        subTasks.add(id);
    }
}
