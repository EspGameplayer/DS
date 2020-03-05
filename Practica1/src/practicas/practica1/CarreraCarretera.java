package practicas.practica1;

public class CarreraCarretera extends Carrera {

	public CarreraCarretera(Integer n, FactoriaCarreraYBicicleta factoria) {
		super(n, factoria, n/10);
	}
}