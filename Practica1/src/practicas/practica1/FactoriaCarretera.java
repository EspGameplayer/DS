package practicas.practica1;

public class FactoriaCarretera implements FactoriaCarreraYBicicleta {

	public BicicletaCarretera crearBicicleta(Integer n) {
		return new BicicletaCarretera(n);
	}

	public CarreraCarretera crearCarrera(Integer n, FactoriaCarreraYBicicleta factoria) {
		return new CarreraCarretera(n, factoria);
	}

}