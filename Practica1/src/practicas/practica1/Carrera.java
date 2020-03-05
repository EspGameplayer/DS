package practicas.practica1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Carrera {

	private ArrayList<Bicicleta> bicicletas;

	
	public Carrera(Integer n, FactoriaCarreraYBicicleta factoria, Integer numBicicletasRetirar) {
		this.bicicletas = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			Bicicleta b = factoria.crearBicicleta(i);
			bicicletas.add(b);
		}
		
		Integer puntoRetirada = ThreadLocalRandom.current().nextInt(0, 60);
		List<Bicicleta> bicicletasRetirar = new ArrayList<>(this.getBicicletas());
		Collections.shuffle(bicicletasRetirar);
		bicicletasRetirar = bicicletasRetirar.subList(0, numBicicletasRetirar);
		
		for(Bicicleta b : this.bicicletas) {
			if(bicicletasRetirar.contains(b)) {
				b.setTiempo(puntoRetirada);
			} else {
				b.setTiempo(60);
			}
			b.start();
		}
	}
	
	public ArrayList<Bicicleta> getBicicletas() {
		return this.bicicletas;
	}

	/**
	 * 
	 * @param bicicletas
	 */
	public void setBicicletas(ArrayList<Bicicleta> bicicletas) {
		this.bicicletas = bicicletas;
	}
	
}