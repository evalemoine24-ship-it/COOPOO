import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RessourceTest {
    @Test
    public void PosX() {
        Ressource r = new Ressource(3, 5, 10.0, 20, TypeRessource.BOIS);
        assertEquals(3, r.getRposX());
    }
    
}
