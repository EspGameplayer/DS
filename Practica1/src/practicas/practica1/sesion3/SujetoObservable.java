package practicas.practica1.sesion3;

import java.util.Observable;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SujetoObservable extends Observable implements Runnable {
	private Double temperatura;

	public SujetoObservable() {
		this.temperatura = ThreadLocalRandom.current().nextDouble(-20, 50);
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException ex) {
				Logger.getLogger(SujetoObservable.class.getName()).log(Level.SEVERE, null, ex);
			}
			System.out.println("Entra en el run() de SujetoObservable");
			cambiarTemperatura();

			System.out.println("Sale del run() de SujetoObservable");
		}
	}

	public void cambiarTemperatura() {
		this.setTemperatura(ThreadLocalRandom.current().nextDouble(-20, 50));
		System.out.println("La temperatura se ha cambiado a " + this.getTemperatura());
	}

	public Double getTemperatura() {
		return this.temperatura;
	}

	public void setTemperatura(Double temperarura) {
		this.temperatura = temperarura;
		setChanged();
		notifyObservers(temperarura);
	}

}