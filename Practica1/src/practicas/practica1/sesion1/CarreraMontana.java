package practicas.practica1.sesion1;

public class CarreraMontana extends Carrera {

	public CarreraMontana(Integer n, FactoriaCarreraYBicicleta factoria) {
		super(n, factoria, n/5);
	}
}