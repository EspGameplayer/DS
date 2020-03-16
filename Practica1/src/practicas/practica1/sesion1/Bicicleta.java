package practicas.practica1.sesion1;

public abstract class Bicicleta extends Thread {

	private Integer identificador;
	private Integer tiempo;
	
	
	@Override
	public void run(){
		String tipo;
		
		if(this.getClass().getSimpleName().contains("Montana")) {
			tipo = "montaña";
		} else {
			tipo = "carretera";
		}
		
		if(tiempo < 60) {
			System.out.println("La bicicleta de " + tipo + " " + this.identificador + " se retiró en el segundo " + this.tiempo + ".");
		} else {
			System.out.println("La bicicleta de " + tipo + " " + this.identificador + " llegó a la meta.");
		}
	}

	public Bicicleta(Integer identificador) {
		this.identificador = identificador;
	}
	
	public Integer getIdentificador() {
		return this.identificador;
	}

	/**
	 * 
	 * @param identificador
	 */
	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}

	public Integer getTiempo() {
		return tiempo;
	}

	public void setTiempo(Integer tiempo) {
		this.tiempo = tiempo;
	}
}