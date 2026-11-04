import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RessourcesTest {

    @Test
    public void PosX() {
        Ressources r = new Ressources(3, 5, 10.0, 20, TypeRessource.BOIS);
        assertEquals(3, r.getPosX());
    }

    @Test
    public void RessourceDispo() {
        Ressources r = new Ressources(3, 5, 10.0, 20, TypeRessource.BOIS);
        assertEquals(10.0, r.getRessourceDispo(), 0.001);
    }
}
