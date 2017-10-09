package gt.url.edu.demoestructuras.modelo;

public class Nodo {
	
	private int v;
	private Nodo siguiente;//
	
	
	
	public Nodo(int v, Nodo siguiente) {
		super();
		this.v = v;
		this.siguiente = siguiente;
	}
	public int getV() {
		return v;
	}
	public void setV(int v) {
		this.v = v;
	}
	public Nodo getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	@Override
	public String toString() {
		return "Nodo [v=" + v + ", siguiente=" + siguiente + "]";
	}
	
	
	

}
