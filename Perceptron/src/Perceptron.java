
public class Perceptron {
	private float Peso1;
	private float Peso2;
	private float Bais;
	private float Salida;
	
	public Perceptron() {
		Bais = 1;		
	}
	
	public void Suma(Dato dato) {
		Salida = (Peso1*dato.getX())+(Peso2*dato.getY());
		Peso1 = (float) Math.random()*10 + 1;
		Peso2 = (float) Math.random()*10 + 1;
	}
	
	public void entrenarPerceptron(conjuntoDatos datos) {
		
	}
	
	public int Clasificar(Dato dato) {
		return 1;
	}
	
	public int[] Clasificar(conjuntoDatos datos) {
		return null;
	}
	
	public float getPeso1() {
		return Peso1;
	}

	public void setPeso1(float peso1) {
		Peso1 = peso1;
	}

	public float getPeso2() {
		return Peso2;
	}

	public void setPeso2(float peso2) {
		Peso2 = peso2;
	}

	public float getBais() {
		return Bais;
	}

	public void setBais(float bais) {
		Bais = bais;
	}

	public float getSalida() {
		return Salida;
	}

	public void setSalida(float salida) {
		Salida = salida;
	}
	

}
