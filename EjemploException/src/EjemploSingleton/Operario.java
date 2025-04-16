package EjemploSingleton;

public class Operario implements OperarStock{

	private String nombre;

	public Operario(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Operario [nombre=" + nombre + ", getNombre()=" + getNombre() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public void agregarProducto(Producto nuevo) {
		Stock.getInstance().add(nuevo);
	}
	
}
