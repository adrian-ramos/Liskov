import static org.junit.Assert.*;
import org.junit.Test;

public class LiskovTest {

    // Para comprobar el principio de Liskov repetimos los tests del padre
    // utilizando objetos de la clase hija

	@Test
	public void test_Liskov() {
	    Rectangulo obj = new Cuadrado();
		obj.setAlto(10);
		obj.setAncho(15);

        assertEquals(150, obj.getArea());
	}

}
