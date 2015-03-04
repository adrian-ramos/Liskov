
public class Rectangulo {
	protected int _ancho, _alto;

    public int getArea() {
        return getAncho() * getAlto();
    }

    // ----------------------------- getters/setters

	public int getAncho() {
		return _ancho;
	}

    public int getAlto() {
		return _alto;
	}

    public void setAncho(int ancho) {
        this._ancho = ancho;
    }

    public void setAlto(int alto) {
		this._alto = alto;
	}
}