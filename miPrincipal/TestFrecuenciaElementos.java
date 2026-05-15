package miPrincipal;
/*
Autor: Omar Yaed Urrea Meza
Fecha: 09/05/2026
Proposito: Leer un arreglo y mostrar la frecuencia de cada elemento.
*/
import java.util.Scanner;
public class TestFrecuenciaElementos {
    public static int contarFrecuencia(int[] arreglo, int valor) {
        int cuenta = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valor) {
                cuenta++;
            }
        }
        return cuenta;
    }

    public static void inicio() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("El tamaño debe ser mayor a 0.");
            System.exit(0);
        }

        int[] datos = new int[n];

        System.out.println("Ingrese " + n + " Elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento [" + i + "]: ");
            datos[i] = sc.nextInt();
        }

        System.out.println("\nFrecuencia de elementos en el arreglo:");

        boolean[] yaProcesado = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!yaProcesado[i]) {
                int valorActual = datos[i];
                int frecuencia = contarFrecuencia(datos, valorActual);

                System.out.println("El número " + valorActual + " aparece " + frecuencia + " vez/veces.");

                for (int j = i; j < n; j++) {
                    if (datos[j] == valorActual) {
                        yaProcesado[j] = true;
                    }
                }
            }
        }
    }
}