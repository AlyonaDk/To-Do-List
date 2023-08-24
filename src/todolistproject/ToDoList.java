package todolistproject;
import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<Task> tasks;
    public ToDoList() {
        tasks = new ArrayList<>();
    }
    public void addTask(String description) {
        Task task = new Task(description);
        tasks.add(task);
    }
    public void markTaskAsDone(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markAsDone();
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tasks.size(); i++) {
            sb.append(i + 1).append(". ").append(tasks.get(i)).append("\n");
        }
        return sb.toString();
    }
}

