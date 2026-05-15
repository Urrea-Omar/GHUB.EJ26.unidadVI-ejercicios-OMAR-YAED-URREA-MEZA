package miPrincipal;
/*autor: Omar Yaed Urrea Meza
fecha: 14/05/2026
Proposito: Elaborar un programa que permita ingresar una cantidad de números reales, calcular el promedio de esos números y mostrar cuantos de ellos son mayores al promedio.
*/
import java.util.Scanner;
public class TestPromMayores {
  public static void inicio() {
        Scanner sc = new Scanner(System.in);
        int n;
        int count;
        double suma;
        double promedio;
        
        System.out.print("Ingrese la cantidad de numeros: ");
        n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("La cantidad debe ser mayor a 0.");
            System.exit(0);
        }
        double[] arreglo = new double[n];
        suma = 0;
        System.out.println("Ingrese los numeros reales:");
        for (int i = 0; i < n; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            arreglo[i] = sc.nextDouble();
            suma += arreglo[i];
        }
        promedio = suma / n;
        count = 0;
        for (int i = 0; i < n; i++) {
            if (arreglo[i] > promedio) {
                count++;
            }
        }
        System.out.println();
        System.out.println("El promedio es: " + promedio);
        System.out.println("La cantidad de valores mayores al promedio es: " + count);
   }
}