import java.util.*;

public class ListaPalabrasUnicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<String> palabras = new TreeSet<>();

        // 1. Pedir al usuario que ingrese varias palabras
        System.out.print("Ingrese la cantidad de palabras: ");
        int cantidadPalabras = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        for (int i = 0; i < cantidadPalabras; i++) {
            System.out.print("Ingrese una palabra: ");
            String palabra = scanner.nextLine();
            palabras.add(palabra);
        }

        // 3. Mostrar las palabras ordenadas alfabéticamente
        System.out.println("\nPalabras ordenadas:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }

        // 4. Permitir buscar una palabra en la lista
        System.out.print("\nIngrese una palabra para buscar en la lista: ");
        String palabraBuscar = scanner.nextLine();
        if (palabras.contains(palabraBuscar)) {
            System.out.println("La palabra '" + palabraBuscar + "' está en la lista.");
        } else {
            System.out.println("La palabra '" + palabraBuscar + "' no se encuentra en la lista.");
        }

        scanner.close();
    }
}
