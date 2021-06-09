public class VentanaConsola {

	private Computador computador = new Computador();

	public void crearRAM() {
		String marca = agregarMarca();
		int capacidadGB = agregarCapacidadGB();
		int frecuenciaHZ = agregarFrecuenciaHz();
		computador.setMemoriaRAM(marca, capacidadGB, frecuenciaHZ);
	}

	public String agregarMarca() {
		String marca;
		do {
			System.out.println("\n" + "Ingrese la marca: ");
			marca = Validaciones.entradaString();
		} while (!Validaciones.validarMarca(marca));
		return marca;
	}

	public int agregarCapacidadGB() {
		int capacidadGB;
		do {
			System.out.println("\n" + "Ingrese la capacidad GB: ");
			capacidadGB = Validaciones.entradaInt();
		} while (!Validaciones.validarCapacidadGB(capacidadGB));
		return capacidadGB;
	}

	public int agregarFrecuenciaHz(){
		int frecuenciaHz;
		do {
			System.out.println("\n" + "Ingrese la frecuencia Hz: ");
			frecuenciaHz = Validaciones.entradaInt();
		} while (!Validaciones.validarFrecuenciaHZ(frecuenciaHz));
		return frecuenciaHz;
	}

	public void modificarModelo() {

	}

	public void mostrarDatosComputador() {

	}

	public void salirMenu() {

	}

	public void mostrarMenu() {

	}

	public void Iniciar() {

	}

	public void modificarRAM() {

	}

	public void modificarComputador() {

	}

}