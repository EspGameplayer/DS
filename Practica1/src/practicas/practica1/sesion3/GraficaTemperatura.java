/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas.practica1.sesion3;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author JoseAntonio
 */
public class GraficaTemperatura extends javax.swing.JFrame implements Observer {
	SujetoObservable observableUpdate;

	public GraficaTemperatura() {
		this.observableUpdate = new SujetoObservable();
		initComponents();
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof SujetoObservable) {
			// Actualizar sujeto observable con el valor del parámetro de entrada y el texto
			// en pantalla
			this.observableUpdate = (SujetoObservable) o;
			System.out.println("Temperatura actual (Gráfica): " + this.observableUpdate.getTemperatura());
			mostrarTemperatura.setText("Temperatura actual: " + this.observableUpdate.getTemperatura());
		}
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		mostrarTemperatura = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		mostrarTemperatura.setText("Temperatura actual: " + this.observableUpdate.getTemperatura());

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(162, 162, 162).addComponent(mostrarTemperatura)
						.addContainerGap(161, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGap(80, 80, 80)
						.addComponent(mostrarTemperatura).addContainerGap(204, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(GraficaTemperatura.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(GraficaTemperatura.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(GraficaTemperatura.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(GraficaTemperatura.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}
		// </editor-fold>
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new GraficaTemperatura().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JLabel mostrarTemperatura;
	// End of variables declaration
}
