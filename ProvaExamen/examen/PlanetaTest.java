import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
/** 
 * @author Victor Zheng
 * @version 1.0
 * @since 30-01-2023
 */

public class PlanetaTest {    

    /**
     * @param
     */
    @Test 
    public void testPlanetaEnano()
    {     
       String nom = "PlanetaEnano";
       int diametre = 1200;
       int pes = 1800;
       
       Planeta planeta = new Planeta(nom, diametre, pes);
 

        assertEquals(planeta.getPlanetaEnano());
    }
     
    /**
     * @param
     */
    @Test 
    public void testExpansio()
    {
        int diametre1 = 1800;
        Planeta planeta = new Planeta(nom, diametre);

        float expected = 1800 * 3;
        float actual = planeta.getExpansio(diametre);
        assertEquals(expected, actual);
        //assertEquals(expected, actual);

    }

    /**
     * @param
     */
    @Test 
    public void testColisio()
    {        

        //assertEquals(expected, actual);
        //assertEquals(expected, actual);
        //assertEquals(expected, actual);
        //assertNotEquals(unexpected, actual);              

    }    
}
