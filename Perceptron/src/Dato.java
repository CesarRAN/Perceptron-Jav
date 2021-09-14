
public class Dato {
	private float X;
	private float Y;
	private int Categoria;
	
	public Dato() {
		setCategoria(1);
		
	}
	
	public Dato(float x, float y) {
		X = x;
		Y = y;
	}

	public float getX() {
		return X;
	}

	public void setX(float x) {
		X = x;
	}

	public float getY() {
		return Y;
	}

	public void setY(float y) {
		Y = y;
	}

	public int getCategoria() {
		return Categoria;
	}

	public void setCategoria(int categoria) {
		Categoria = categoria;
	}

}
