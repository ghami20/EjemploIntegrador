package EjemploSingleton;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		
		Operario yo = new Operario("Ghami");
		yo.agregarProducto(new Producto("Maiz",20));
		int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese num"));
		Producto encontrado = yo.buscarProducto(num);
		JOptionPane.showMessageDialog(null, encontrado);
	}
}
