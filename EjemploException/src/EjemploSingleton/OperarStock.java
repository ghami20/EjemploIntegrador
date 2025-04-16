package EjemploSingleton;

import javax.swing.JOptionPane;

public interface OperarStock {

	default Producto buscarProducto(int indice) {
		try {	
			if (Stock.getInstance().isEmpty()) {
				return null;
			}else {
				return Stock.getInstance().get(indice);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	}
	
	
}
