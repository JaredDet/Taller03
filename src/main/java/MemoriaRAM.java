public class MemoriaRAM {

	private String marca;
	private int capacidadGB;
	private int frecuenciaHz;

	public MemoriaRAM(String marca, int capacidadGB, int frecuenciaHz){
		this.marca = marca;
		this.capacidadGB = capacidadGB;
		this.frecuenciaHz = frecuenciaHz;
	}
	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCapacidadGB() {
		return this.capacidadGB;
	}

	public void setCapacidadGB(int capacidadGB) {
		this.capacidadGB = capacidadGB;
	}

	public int getFrecuenciaHz() {
		return this.frecuenciaHz;
	}

	public void setFrecuenciaHz(int frecuenciaHz) {
		this.frecuenciaHz = frecuenciaHz;
	}

	@Override
	public String toString() {
		return "  Marca: " +  getMarca()+ "\n" +
				"  Capacidad GB: " + getCapacidadGB() + "\n" +
				"  Frecuencia Hz: " + getFrecuenciaHz() + "\n";
	}
}