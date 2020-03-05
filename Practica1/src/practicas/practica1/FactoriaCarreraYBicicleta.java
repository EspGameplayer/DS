package practicas.practica1;

public abstract interface FactoriaCarreraYBicicleta {

	public Bicicleta crearBicicleta(Integer n);

	public Carrera crearCarrera(Integer n, FactoriaCarreraYBicicleta factoria);

}