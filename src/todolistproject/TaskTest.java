package todolistproject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testTaskDescription() {
        Task task = new Task("Complete assignment");
        assertEquals("Complete assignment", task.getDescription());
    }

    @Test
    public void testTaskCompletion() {
        Task task = new Task("Read a book");
        assertFalse(task.isCompleted());

        task.complete();
        assertTrue(task.isCompleted());
    }
}





