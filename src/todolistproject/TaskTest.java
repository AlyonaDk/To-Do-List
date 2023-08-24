package todolistproject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {
    @Test
    public short testTaskDescription() {
        Task task = new Task("Sample Task");
        assertEquals("Sample Task", testTaskDescription());
        return 0;
    }

    @Test
    public void testTaskIsDone() {
        Task task = new Task("Sample Task");
        assertFalse(task.isDone());
        task.markAsDone();
        assertTrue(task.isDone());
}
}

