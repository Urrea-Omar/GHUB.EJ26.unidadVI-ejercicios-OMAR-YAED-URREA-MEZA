package miPrincipal;
/*autor: Omar Yaed Urrea Meza
fecha: 11/05/2026
Proposito: Elaborar un menu que te permita ingresar datos, mostrarlos y al final sacar el promedio.
*/
import java.util.Scanner;
public class TestMenuArreglos {
    
    static int[] arreglo = new int[10];
    static int n = 0;
    static Scanner sc = new Scanner(System.in);

    public static void inicio() {
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("\n--- Menú de Arreglos ---");
            System.out.println("1. Capturar datos");
            System.out.println("2. Mostrar datos");
            System.out.println("3. Calcular promedio");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            
            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
            } else {
                sc.next();
                System.out.println("INCORRECTO. Ingrese un número.");
            }

            switch (opcion) {
              case 1:
                capturarDatos();
              break;
              case 2:
                mostrarDatos();
              break;
              case 3:
                calcularPromedio();
              break;
              case 4:
                System.out.println("Saliendo del programa...");
              break;
              default:
                System.out.println("Opción inválida. Intente nuevamente.");
                System.exit(0);
            }
        }
    }

    public static void capturarDatos() {
        System.out.print("Ingrese el tamaño del arreglo: ");
        n = sc.nextInt();

        if (n > 0 && n <= 100) {
            for (int i = 0; i < n; i++) {
                System.out.print("Ingrese valor para la posición " + (i + 1) + ": ");
                arreglo[i] = sc.nextInt();
            }
            System.out.println("Datos capturados exitosamente.");
        } else {
            System.out.println("El tamaño debe ser mayor a 0 y máximo 100.");
        }
    }

    public static void mostrarDatos() {
        if (n > 0) {
            System.out.println("Datos del arreglo:");
            for (int i = 0; i < n; i++) {
                System.out.println("Posición " + (i + 1) + ": " + arreglo[i]);
            }
        } else {
            System.out.println("No hay datos capturados. Use la opción 1.");
        }
    }

    public static void calcularPromedio() {
        if (n > 0) {
            int suma = 0;
            for (int i = 0; i < n; i++) {
                suma += arreglo[i];
            }
            double promedio = (double) suma / n;
            System.out.println("La suma total es: " + suma);
            System.out.println("El promedio es: " + promedio);
        } else {
            System.out.println("No hay datos para calcular el promedio. Use la opción 1.");
        }
    }
}