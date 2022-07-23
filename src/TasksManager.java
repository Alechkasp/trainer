import java.util.HashMap;

public class TasksManager {
    int id = 0;
    HashMap<Integer, Object> tableTasks = new HashMap<>(); //таблица, содержащая все Task
    HashMap<Integer, Epic> tableEpics = new HashMap<>(); //таблица, содержащая все Epics
    HashMap<Integer, SubTask> tableSubTasks = new HashMap<>(); //таблица, содержащая все Subtasks

    //добавить Task
    Task addTask(String name, String description, String status) {
        id++;
        Task task = new Task(name, id, description, status);
        tableTasks.put(id, task);
        return task;
    }

    //добавить Epic
    Epic addEpic(String name, String description, String status) {
        id++;
        Epic epic = new Epic(name, id, description, status);
        tableEpics.put(id, epic);
        return epic;
    }

    //добавить SubTask
    SubTask addSubTask(String name, String description, String status, Epic epic) {
        id++;
        SubTask subTask = new SubTask(name, id, description, status, epic);
        tableSubTasks.put(id, subTask);
        epic.addSubTaskToEpic(id);
        return subTask;
    }

    //получить список все задач типа Task
    void getListTasks() {
        System.out.println(tableTasks.values());
    }

    //получить список все задач типа Epic
    void getListEpics() {
        System.out.println(tableEpics.values());
    }

    //получить список все задач типа SubTasks
    void getListSubTasks() {
        System.out.println(tableSubTasks.values());
    }

    //удалить все задачи типа Task
    void deleteListTasks() {
        tableTasks.clear();
    }

    //удалить все задачи типа Epic
    void deleteListEpics() {
        tableEpics.clear();
    }

    //удалить все задачи типа SubTask
    void deleteListSubTask() {
        tableSubTasks.clear();
    }

    //получение по идентификатору задачи типа Task
    Task getTask(int id) {
        return (Task) tableTasks.get(id);
    }

    //получение по идентификатору задачи типа Epic
    Epic getEpic(int id) {
        return tableEpics.get(id);
    }

    //получение по идентификатору задачи типа SubTask
    SubTask getSubTask(int id) {
        return tableSubTasks.get(id);
    }

    //обновление задачи типа Task
    void updateTask(Task task) {
        tableTasks.put(task.getId(), task);
    }


    //удаление по идентификатору задачи типа Task
    void delTask(int id) {
        tableTasks.remove(id);
    }

    //удаление по идентификатору задачи типа Epic
    void delEpic(int id) {
        tableEpics.remove(id);
    }

    //удаление по идентификатору задачи типа SubTask
    void delSubTask(int id) {
        tableSubTasks.remove(id);
    }

}
