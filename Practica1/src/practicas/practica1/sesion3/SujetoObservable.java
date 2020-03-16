package practicas.practica1.sesion3;

import java.util.Observable;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SujetoObservable extends Observable implements Runnable {
	private Double temperatura;

	public SujetoObservable() {
		this.temperatura = ThreadLocalRandom.current().nextDouble(-20, 50);
		setChanged();
		notifyObservers(temperatura);
	}

	@Override
	public void run() {
		while (true) {
			System.out.println("Run");
			this.setTemperatura(ThreadLocalRandom.current().nextDouble(-20, 50));
			try {
				Thread.sleep(3000);
				System.out.println("Me desperté");
			} catch (InterruptedException ex) {
				Logger.getLogger(SujetoObservable.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
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