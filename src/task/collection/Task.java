package task.collection;

import java.util.ArrayList;
import java.util.List;

public class Task {
    // TODO: Управление задачами:
    //  Создайте класс Task с полями id, title и completed.
    //  Создайте метод, который будет принимать список задач и выводить только незавершенные задачи на экран.
    //  Создайте метод, который будет принимать список задач и возвращать список задач с определенным заголовком.
    private int id;
    private String title;
    private String completed;
    public Task(int id,String title,String completed){
        this.id = id;
        this.title = title;
        this.completed = completed;

    }


    public static void printUnfinishedTasks(List<Task> tasks){
        for (Task task : tasks) {
            if (task.completed.equals("Не выполнена")) {
                System.out.println("Task ID: " + task.id + ", Title: " + task.title + ", Completed: " + task.completed);
            }
        }
    }

    public static List<Task> getTasksWithSpecificTitle(List<Task> tasks, String title) {
        List<Task> tasksWithSpecificTitle = new ArrayList<>();
        for (Task task : tasks) {
            if (task.title.equals(title)) {
                tasksWithSpecificTitle.add(task);
            }
        }
        return tasks;
    }
}

