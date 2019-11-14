package ejercicioColecciones;

public class Main {

	public static void main(String[] args) {
			Pila p1 = new Pila();
			p1.poner("Walter");
			p1.poner("Pablo");
			p1.poner("Mauro");
			p1.ver();
			p1.sacar();
			p1.ver();
			System.out.println(p1);

	}

}
