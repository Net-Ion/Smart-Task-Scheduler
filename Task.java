package taskscheduler;

public class Task implements Comparable<Task> {

    private String title;
    private int priority; // 1 = High, 2 = Medium, 3 = Low

    public Task(String title, int priority) {
        this.title = title;
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        String priorityText = "";
        if (priority == 1) priorityText = "High";
        else if (priority == 2) priorityText = "Medium";
        else priorityText = "Low";

        return title + " [" + priorityText + "]";
    }
}