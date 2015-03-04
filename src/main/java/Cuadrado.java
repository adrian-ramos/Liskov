
public class Cuadrado extends Rectangulo {

    @Override
	public void setAncho(int ancho) {
		super.setAncho(ancho);
        super.setAlto(ancho);
	}

    @Override
    public void setAlto(int alto) {
        super.setAncho(alto);
        super.setAlto(alto);
	}
}
