package DAO;

import Metier.Task;

import java.util.List;

public interface TaskDAO {
    void insertTask(Task task);
    void updateTask(Task task);
    void deleteTask(Task task);
    Task getTask(int id);
    List<Task> getTasksByUser(int id);
}
