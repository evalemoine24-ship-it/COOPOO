import org.example.World;
import org.junit.jupiter.api.Test;

public class RessourcesTest {

    @Test
    public void PosX() {
        Ressources r = new Ressources(3, 5, 10.0, 20, TypeRessource.BOIS);
        assertEquals(3, r.getPosX());
    }

    @Test
    public void RessourcedansWorld(){
    World w = new World(0,18,0,20);
    
    }























}
