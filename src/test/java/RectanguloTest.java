import static org.junit.Assert.*;
import org.junit.Test;

public class RectanguloTest {

	@Test
	public void testArea() {
        Rectangulo obj = new Rectangulo();

        obj.setAncho(10);
        obj.setAlto(5);

        assertEquals(50, obj.getArea());
	}

}
