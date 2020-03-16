package practicas.practica1.sesion3;

public class MonitorizacionTemperaturas {

	public static void main(String[] args) {
		// Crear Sujeto Observable, el cual tiene la propiedad temperatura
		SujetoObservable sujetoObservable = new SujetoObservable();

		// Crear los 3 observadores
		BotonCambio botonCambio = new BotonCambio();
		GraficaTemperatura graficaTemperatura = new GraficaTemperatura();
		PantallaTemperatura pantallaTemperatura = new PantallaTemperatura();

		// Llamar al main del observable
		botonCambio.main(new String[0]);

		// Añadir a sujetoObservanble los 2 observadores que mantienen comunicación PULL
		// con él
		sujetoObservable.addObserver(botonCambio);
		sujetoObservable.addObserver(graficaTemperatura);

		// Comunicación PUSH con el sujeto observable
		sujetoObservable.notifyObservers(pantallaTemperatura);

		// Heredando de Thread sería:
		// sujetoObservable.start();
		Thread t = new Thread(sujetoObservable);
		t.start();
	}
}