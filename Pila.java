package ejercicioColecciones;

public class Pila {
	private Nodo tope;

	public Pila(Nodo tope) {
		this.setTope(tope);
	}
	public Pila() {
		this(null);
	}

	public Nodo getTope() {
		return tope;
	}

	public void setTope(Nodo tope) {
		this.tope = tope;
	}
	public boolean isVacia() {
		return this.getTope() == null;
	}
	public void poner(String dato) {
		//Nodo aux = new Nodo(dato, this.getTope());
		//this.setTope(aux);
		//Es lo mismo que
		this.setTope(new Nodo(dato, this.getTope()));
	}
	public String ver() {
		return this.getTope().getDato();
	}
	public void sacar() {
		this.setTope(getTope().getSig());
	}
	public String toString() {
		String representacion = "";
		Pila paux = new Pila();
		while(!this.isVacia()) {
			String dato = this.ver();
			representacion += "(" +dato+ ")";
			paux.poner(dato);
			this.sacar();
		}
		while(!paux.isVacia()) {
			this.poner(paux.ver());
			paux.sacar();
		}
		return representacion;
	}

}

