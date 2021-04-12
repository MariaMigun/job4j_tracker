package ru.job4j.search;
import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    public void add(Task task){
        this.tasks.add(task);
    }

    public void put(Task task) {
        int index = 0;
        for (Task element : tasks) {
            index = index + 1;
            if (element.getPriority() < task.getPriority()) {
                break;
            }
        }
        this.tasks.add(index, task);
    }

    public Task take() {
        return tasks.poll();
    }
}
