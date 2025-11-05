package level1;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class SingletonTest {

    @Test
    void shouldSingletonWork() {
        assertNotNull(Undo.getInstance());
    }

    @Test
    void shouldAddCommand() {
        Undo.getInstance().addCommand("test-command");
        assertEquals("test-command", Undo.getInstance().getCommands().getFirst());
    }

    @Test
    void shouldThrowExceptionWhenAddingCommandWithEmptyName() {
        assertThrows(IllegalArgumentException.class, () -> Undo.getInstance().addCommand("  "));
    }

    @Test
    void shouldThrowExceptionWhenAddingCommandWithNullName() {
        assertThrows(IllegalArgumentException.class, () -> Undo.getInstance().addCommand(null));
    }

    @Test
    void shouldRemoveCommand() {
        Undo.getInstance().addCommand("test-command");
        assertEquals("test-command", Undo.getInstance().getCommands().getFirst());
        Undo.getInstance().removeCommand();
        assertEquals(0, Undo.getInstance().getCommands().size());
    }

    @Test
    void shouldThrowExceptionWhenRemovingFromEmptyCommands() {
        assertThrows(NoSuchElementException.class, () -> Undo.getInstance().removeCommand());
    }
}
