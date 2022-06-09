import javax.swing.*;



public class TestLive{
	public static void main(String[] args) {

	
	double moneda1 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el valor a convertir"));

	if (JOptionPane.CANCEL_OPTION == moneda1) {
		JOptionPane.showMessageDialog(null, "Programa finalizado", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
		};

	
	
	System.out.println(moneda1);
	
	
	
	Object TipoCambio = JOptionPane.showInputDialog(null, "Seleccione el tipo de cambio que desea", "MONEDAS", JOptionPane.QUESTION_MESSAGE, 
			null, new Object [] {"Seleccione", "Yen a Pesos Argentinos", "Dolar Estadounidense a Pesos Argentinos", "Euro a Pesos Argentinos",
					"Libras a Pesos Argentinos", "Won Coreano a Pesos Argentinos", "Pesos Argentinos a Yen", "Pesos Argentinos a Dolar Estadounidense", 
					"Pesos Argentinos a Euro", "Pesos Argentinos a Libras", "Pesos Argentinos a Won Coreano"}, "Seleccione");
	System.out.println(TipoCambio);
	
	System.out.println(TipoCambio.hashCode());
	if (TipoCambio.hashCode() == -402555463) {
		JOptionPane.showMessageDialog(null, (moneda1 * 0.9 + " pesos argentinos"), "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
	} else if (TipoCambio.hashCode() == 670471768) {
		JOptionPane.showMessageDialog(null, (moneda1 * 121.46 + " pesos argentinos"), "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
	} else if (TipoCambio.hashCode() == 694584206) {
		JOptionPane.showMessageDialog(null, (moneda1 * 130.10 + " pesos argentinos"), "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
	}else if (TipoCambio.hashCode() == 1624060348) {
		JOptionPane.showMessageDialog(null, (moneda1 * 152.24 + " pesos argentinos"), "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
	}else if (TipoCambio.hashCode() == -2004046078) {
		JOptionPane.showMessageDialog(null, (moneda1 * 0.096 + " pesos argentinos"), "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
	}else if (TipoCambio.hashCode() == -1699372257) {
		JOptionPane.showMessageDialog(null, (moneda1 * 1.11 + " yenes"), "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
	}else if (TipoCambio.hashCode() == -2056872506) {
		JOptionPane.showMessageDialog(null, (moneda1 * 0.0082 + " dolar"), "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
	}else if (TipoCambio.hashCode() == -1141512624) {
		JOptionPane.showMessageDialog(null, (moneda1 * 0.0077 + " euro"), "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
	}else if (TipoCambio.hashCode() == -1588120030) {
		JOptionPane.showMessageDialog(null, (moneda1 * 0.0066 + " libras"), "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
	}else if (TipoCambio.hashCode() == -1777860746) {
		JOptionPane.showMessageDialog(null, (moneda1 * 10.37 + " won coreano"), "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
		};
		
		
	int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
	if (JOptionPane.OK_OPTION == respuesta) {
		TestLive.main (null);
	} else if (JOptionPane.CANCEL_OPTION == respuesta) {
		JOptionPane.showMessageDialog(null, "Programa finalizado", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
	}else if (JOptionPane.NO_OPTION == respuesta) {
			JOptionPane.showMessageDialog(null, "Programa finalizado", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
		};
};
}; 

		



