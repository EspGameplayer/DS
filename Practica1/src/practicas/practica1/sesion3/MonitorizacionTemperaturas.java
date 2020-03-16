package practicas.practica1.sesion3;

public class MonitorizacionTemperaturas {

	public static void main(String[] args) {
		// Crear Sujeto Observable, el cual tiene la propiedad temperatura
		SujetoObservable sujetoObservable = new SujetoObservable();

		// Crear los 3 observadores
		BotonCambio botonCambio = new BotonCambio();
		GraficaTemperatura graficaTemperatura = new GraficaTemperatura();
		PantallaTemperatura pantallaTemperatura = new PantallaTemperatura();

		// Añadir a sujetoObservanble los 2 observadores que mantienen comunicación PULL
		// con él
		sujetoObservable.addObserver(botonCambio);
		sujetoObservable.addObserver(graficaTemperatura);

		// Llamar al main de los observables
		BotonCambio.main(new String[0]);
		GraficaTemperatura.main(new String[0]);
		PantallaTemperatura.main(new String[0]);

		// Heredando de Thread sería: sujetoObservable.start();
		Thread tPantallaTemperatura = new Thread(pantallaTemperatura);
		Thread t = new Thread(sujetoObservable);
		tPantallaTemperatura.start();
		t.start();
	}
}