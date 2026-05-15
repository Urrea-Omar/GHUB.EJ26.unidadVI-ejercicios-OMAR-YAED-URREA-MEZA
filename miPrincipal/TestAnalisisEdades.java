package miPrincipal;
/*autor: Omar Yaed Urrea Meza
fecha: 14/05/2026
Proposito: Elaborar un programa que permita ingresar las edades de un grupo de personas
y al final mostrar cuantos son mayores de edad, el promedio de las edades y si hay menores de edad.
*/
import java.util.Scanner;
public class TestAnalisisEdades {
    public static void inicio() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el número de personas: ");
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("El número debe ser mayor a 0.");
            return;
        }

        int[] edades = new int[n];
        System.out.println("Ingrese las edades:");
        
        for (int i = 0; i < n; i++) {
            System.out.print("Edad persona " + (i + 1) + ": ");
            edades[i] = sc.nextInt();
        }

        int mayores = 0;
        for (int edad : edades) {
            if (edad >= 18) {
                mayores++;
            }
        }

        int prom = 0;
        int maxFrecuencia = 0;
        for (int i = 0; i < n; i++) {
            int edadActual = edades[i];
            int frecuencia = 0;

            for (int j = 0; j < n; j++) {
                if (edades[j] == edadActual) {
                    frecuencia++;
                }
            }

            if (frecuencia > maxFrecuencia) {
                maxFrecuencia = frecuencia;
                prom = edadActual;
            }
        }

        boolean tieneMenor = false;
        for (int edad : edades) {
            if (edad < 18) {
                tieneMenor = true;
                break;
            }
        }

        System.out.println();
        System.out.println("Resultados");
        System.out.println("Mayores de edad (>= 18): " + mayores);
        System.out.println("Promedio de edad: " + prom);
        
        if (tieneMenor) {
            System.out.println("¿Hay menores de edad? Sí.");
        } else {
            System.out.println("¿Hay menores de edad? No.");
        }
    }
}