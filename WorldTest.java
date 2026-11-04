import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class WorldTest {
    @Test
    void testCreateWorldVALIDE() {
        World monde = new World(-10, 10, -100, 100);
        assertTrue(monde.getMaxX() == 10);
        assertTrue(monde.getMaxY() == 100);
        assertTrue(monde.getMinY() == -100);
        assertTrue(monde.getMinX() == -10);
    }

    @Test
    void testCreateWorldERREUR() {
        World monde = World.createWolrd(100, 10, 10, 100);
        assertTrue(monde == null);
    }
}
