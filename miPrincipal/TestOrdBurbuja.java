package miPrincipal;
/*Autor: Urrea Meza Omar Yaed
  Fecha: 09/05/2026
  Proposito:Ordenar un arreglo usando el algoritmo básico (burbuja).
*/
import java.util.Scanner;
public class TestOrdBurbuja {
    public static void inicio() {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("Ingrese la cantidad de elementos:");
        n = sc.nextInt();  
        
        if (n <= 0) {
            System.out.println("La cantidad debe ser mayor a 0");
        } else {
            int[] arreglo = new int[n];
            
            for (int i = 0; i < n; i++) {
                System.out.println("Ingrese el elemento " + (i + 1) + ":");
                arreglo[i] = sc.nextInt(); 
            }
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - 1 - i; j++) {
                    if (arreglo[j] > arreglo[j + 1]) {
                        int aux = arreglo[j];
                        arreglo[j] = arreglo[j + 1];
                        arreglo[j + 1] = aux;
                    }
                }
            }
            System.out.println("Arreglo ordenado:");
            for (int i = 0; i < n; i++) {
                System.out.print(arreglo[i] + " ");
            }
        }
    }
}