import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
/** 
 * @author Victor Zheng
 * @version 1.0
 * @since 30-01-2023
 */

public class PlanetaTest {    

    @Test 
    public void testPlanetaEnano()
    {     
       String nom = "PlanetaEnano";
       int diametre = 1200;
       int pes = 1800;
       
       Planeta planeta = new Planeta(nom, diametre, pes);
 

        assertEquals(planeta.getPlanetaEnano());
    }
                
    @Test 
    public void testExpansio()
    {
        String nom1 = "Jupiter";
        int diametre1 = 1800;
        int pes1 = 1400;

        Planeta planeta = new Planeta(nom1, diametre1, pes1);
        planeta.expansio();
        float expected = 1800 * 3;
        float actual = planeta.expansio(diamtre1);
        //assertEquals(expected, actual);
        assertEquals(expected, actual);

    }

    @Test 
    public void testColisio()
    {        

        //assertEquals(expected, actual);
        //assertEquals(expected, actual);
        //assertEquals(expected, actual);
        //assertNotEquals(unexpected, actual);              

    }    
}
