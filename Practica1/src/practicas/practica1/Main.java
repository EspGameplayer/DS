package practicas.practica1;

public class Main {

	public static void main(String[] args) {
		FactoriaCarretera factoriaCarretera = new FactoriaCarretera();
		FactoriaMontana factoriaMontana = new FactoriaMontana();
		factoriaCarretera.crearCarrera(100, factoriaCarretera);
		factoriaMontana.crearCarrera(100, factoriaMontana);
	}

}
