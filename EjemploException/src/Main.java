import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		try {
			//try/intentar, intenta realizar una acciòn, esta acciòn puede tener un excepciòn en la ejecucion;
		int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nùmero"));
		int resultado = 10 / num;
		int []numeros = new int[1];
		JOptionPane.showMessageDialog(null, numeros[num]);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Debe ser un nùmero");
		}catch(ArithmeticException e) {
			JOptionPane.showMessageDialog(null, "No se puede dividir por 0");
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Excepción general");
		}
		//NumberFormatException
		//ArithmeticException
		JOptionPane.showMessageDialog(null, "El programa sigue");
		
	
	}
}
