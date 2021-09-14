import java.util.ArrayList;

public class conjuntoDatos {
	private ArrayList<Dato> conjuntoDeDatos;
	private int tam;
	
	public conjuntoDatos() {
		setConjuntoDeDatos(new ArrayList<Dato>());
		setTam(0);
	}
	
	public conjuntoDatos(Dato dato) {
		setConjuntoDeDatos(new ArrayList<Dato>());
		setTam(1);
		conjuntoDeDatos.add(dato);
	}
	
	public void inicializar() {
		
	}
	
	public Dato getDatoIndex(int index) {
		return conjuntoDeDatos.get(index);	
	}

	public void setDato(Dato dato) {
		conjuntoDeDatos.add(dato);
		
		setTam(getTam() + 1);
	}
	
	public ArrayList<Dato> getConjuntoDeDatos() {
		return conjuntoDeDatos;
	}

	public void setConjuntoDeDatos(ArrayList<Dato> conjuntoDeDatos) {
		this.conjuntoDeDatos = conjuntoDeDatos;
	}

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}

}
