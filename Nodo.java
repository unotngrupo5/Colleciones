package ejercicioColecciones;

public class Nodo {
	private String dato;
	private Nodo sig;

	public Nodo(String dato, Nodo sig) {
		this.setDato(dato);
		this.setSig(sig);
	}
	public Nodo(String dato) {
		this(dato, null);
	}
	public String getDato() {
		return dato;
	}
	public void setDato(String dato) {
		this.dato = dato;
	}
	public Nodo getSig() {
		return sig;
	}
	public void setSig(Nodo sig) {
		this.sig = sig;
	}
}
