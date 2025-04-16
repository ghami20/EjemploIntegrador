package EjemploSingleton;

import java.util.LinkedList;

public class Stock {
	
	
	private static LinkedList<Producto> productos;
	
	private Stock() {
		productos = new LinkedList<Producto>();
	}
	
	public static LinkedList<Producto> getInstance(){
		if (productos==null) {
			new Stock();
		}else {
			System.out.println("Ya esta creado");
		}
		return productos;
	}

}
