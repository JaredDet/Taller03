import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validaciones {

    public static String entradaString() {

        Scanner teclado = new Scanner(System.in);
        return teclado.nextLine();
    }

    public static int entradaInt() {

        int entrada = 0;

        try {
            entrada = Integer.parseInt(entradaString());
        } catch (NumberFormatException ex) {
            System.out.println("Entrada no válida");
        }
        return entrada;
    }

    public static boolean validarFrecuenciaHZ(int frecuenciaHZ) {

        if (frecuenciaHZ < 0) {
            System.out.println("Frecuencia no válida");
            return false;
        }
        return true;
    }

    public static boolean validarCapacidadGB(int capacidadGB) {

        if (capacidadGB < 0) {
            System.out.println("Capacidad GB no válida");
            return false;
        }
        return true;
    }

    public static boolean validarMarca(String marca) {
        Pattern pat = Pattern.compile("[A-Za-z]{1,}$");
        Matcher mat = pat.matcher(marca);

        if (mat.matches()) {
            return true;
        }
        System.out.println("Marca no válida");
        return false;
    }

    public static boolean validarModelo(String modelo) {
        Pattern pat = Pattern.compile("[A-Za-z]{1,}$");
        Matcher mat = pat.matcher(modelo);

        if (mat.matches()) {
            return true;
        }
        System.out.println("Modelo no válido");
        return false;
    }
}