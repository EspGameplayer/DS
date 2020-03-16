package practicas.practica1.sesion1;

public class FactoriaMontana implements FactoriaCarreraYBicicleta {

	public Bicicleta crearBicicleta(Integer n) {
		return new BicicletaMontana(n);
	}

	public Carrera crearCarrera(Integer n, FactoriaCarreraYBicicleta factoria) {
		return new CarreraMontana(n, factoria);
	}

}