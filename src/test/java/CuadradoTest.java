import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CuadradoTest {

	@Test
	public void testSetAncho() {
        Cuadrado obj = new Cuadrado();
        obj.setAncho(5);
		assertTrue(obj.getArea() == 25);
	}

    @Test
    public void testSetAlto() {
        Cuadrado obj = new Cuadrado();
        obj.setAlto(5);
        assertTrue (obj.getArea() == 25);
    }

}
