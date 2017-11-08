public class Automovil {

	private String marca;
	private String color="Negro";
	private int anno;
	private int modelo;

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAnno() {
		return anno;
	}
	public void setAnno(int anno) {
		this.anno = anno;
	}
	public int getModelo() {
		return modelo;
	}
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Automovil [marca=" + marca 
			+ ", color=" + color 
			+ ", anno=" + anno 
			+ ", modelo=" + modelo + "]";
	}

}

