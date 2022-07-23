import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        TasksManager tasksManager = new TasksManager();
        Task t1 = tasksManager.addTask("Переезд", "Описание переезда", "NEW");
        Task t2 = tasksManager.addTask("Купить еды", "Описание покупки еды", "IN_PROGRESS");

        Epic e1 = tasksManager.addEpic("Поехать на море", "Описание поездки на море", "NEW");
        Epic e2 = tasksManager.addEpic("Отремонтировать машину", "Описание ремонта машины",
                "DONE");

        SubTask st1 = tasksManager.addSubTask("Купить купальник", "Описание покупки купальника",
                "DONE", e1);
        SubTask st2 = tasksManager.addSubTask("Купить круг", "Описание покупки круга",
                "IN_PROGRESS", e1);
        SubTask st3 = tasksManager.addSubTask("Купить колесо", "Описание покупки колеса",
                "NEW", e2);

        System.out.println("Получить список Task: ");
        tasksManager.getListTasks();
        System.out.println();
/*        System.out.println("Получить список Epic: ");
        tasksManager.getListEpics();
        System.out.println();
        System.out.println("Получить список SubTask: ");
        tasksManager.getListSubTasks();
        System.out.println();*/

        /*УДАЛЕНИЕ ВСЕХ ЗАДАЧ
        System.out.println("Количество задач в списке Task = " + tasksManager.tableTasks.size());
        tasksManager.deleteListTasks();
        System.out.println("После удаления = " + tasksManager.tableTasks.size());

        System.out.println("Количество задач в списке  Epic = " + tasksManager.tableEpics.size());
        tasksManager.deleteListEpics();
        System.out.println("После удаления = " + tasksManager.tableEpics.size());

        System.out.println("Количество задач в списке SubTasks = " + tasksManager.tableSubTasks.size());
        tasksManager.deleteListSubTask();
        System.out.println("После удаления = " + tasksManager.tableSubTasks.size());*/

        /*ПОЛУЧЕНИЕ ПО ИДЕНТИФИКАТОРУ
        System.out.println("Введите идентификатор задачи Task, которую хотите получить: ");
        int userInputTask = scanner.nextInt();
        System.out.println(tasksManager.getTask(userInputTask));

        System.out.println("Введите идентификатор задачи Epic, которую хотите получить: ");
        int userInputEpic = scanner.nextInt();
        System.out.println(tasksManager.getEpic(userInputEpic));

        System.out.println("Введите идентификатор задачи SubTask, которую хотите получить: ");
        int userInputSubTask = scanner.nextInt();
        System.out.println(tasksManager.getSubTask(userInputSubTask));*/

/*        УДАЛЕНИЕ ПО ИДЕНТИФИКАТОРУ
        System.out.println("Какой Task удалить? ");
        int delTask = scanner.nextInt();
        tasksManager.delTask(delTask);

        System.out.println("Получить список Task: ");
        tasksManager.getListTasks();
        System.out.println();

        System.out.println("Какой Epic удалить? ");
        int delEpic = scanner.nextInt();
        tasksManager.delEpic(delEpic);

        System.out.println("Какой SubTask удалить? ");
        int delSubTask = scanner.nextInt();
        tasksManager.delSubTask(delSubTask);*/

        //ОБНОВЛЕНИЕ ДАННЫХ
        System.out.println("Какой Task обновить? ");
        int updateTask = scanner.nextInt();
        tasksManager.updateTask(tasksManager.getTask(updateTask));

        System.out.println("Получить список Task: ");
        tasksManager.getListTasks();
        System.out.println();


    }
}
