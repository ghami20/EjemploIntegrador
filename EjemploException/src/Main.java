import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		int num = ValdiarNum();
		JOptionPane.showMessageDialog(null, "El programa sigue " + num);

	}

	public static int ValdiarNum() {
		int num = 0;
		boolean flag;
		do {
			flag = false;
			try {
				// try/intentar, intenta realizar una acciòn, esta acciòn puede tener un
				// excepciòn en la ejecucion;
				num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nùmero"));
				flag = true;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Debe ser un nùmero");
			}
		} while (flag == false);
		return num;
	}
}
