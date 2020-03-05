package practicas.practica1;

public abstract interface FactoriaCarreraYBicicleta {

	public Bicicleta crearBicicleta(Integer identificador);

	public Carrera crearCarrera(Integer n, FactoriaCarreraYBicicleta factoria);

}