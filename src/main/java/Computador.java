public class Computador {

	private MemoriaRAM memoriaRAM;
	private String marca;
	private String modelo;

	public Computador(){
	}

	public String getMarca() {
		return this.marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public MemoriaRAM getMemoriaRAM() {
		return memoriaRAM;
	}
	public void setMemoriaRAM(MemoriaRAM memoriaRAM) {
		this.memoriaRAM = memoriaRAM;
	}
}