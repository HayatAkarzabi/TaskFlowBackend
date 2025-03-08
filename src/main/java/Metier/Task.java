package Metier;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Data
@NoArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;              // Identifiant unique de la tâche
    private String title;        // Titre de la tâche
    private String description;  // Description de la tâche
    private boolean completed;   // Indicateur si la tâche est terminée
    private Date dueDate;        // Date d'échéance de la tâche
    private TaskStatus status;   // Statut de la tâche (en cours, terminée, etc.)

    public Task(String title, String description, boolean completed, Date dueDate, TaskStatus status) {
        this.title = title;
        this.description = description;
        this.completed = completed;
        this.dueDate = dueDate;
        this.status = status;
    }
}
