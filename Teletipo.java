package ejercicioColecciones;

public class Teletipo {
	private String valor;
	private PilaChar pilaChar;
	// private Pila pilChar;

	public Teletipo(String valor) {
		this.setValor(valor);
		this.setPilaChar(new PilaChar());
		for(Integer i = 0; i < valor.length(); i++) {
			this.getPilaChar().poner(String.valueOf(valor.charAt(i)));
		}
	}
	public void procesar() {
		for(Integer i = 0 ; i < this.getValor().length(); i ++) {
			Character c = this.getValor().charAt(i);
			switch (c) {

			case '/' : if (!this.getPilaChar().isVacia()) 
				this.getPilaChar().sacar();
			break;
			case '&' : while (!this.getPilaChar().isVacia())
				this.getPilaChar().sacar();
			break;
			}
		}
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public PilaChar getPilaChar() {
		return pilaChar;
	}

	public void setPilaChar(PilaChar pila) {
		this.pilaChar = pila;
	}
}
