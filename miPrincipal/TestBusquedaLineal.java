package miPrincipal;
/*Autor: Omar Yaed Urrea Meza
Fecha: 09/05/2026
Proposito: Leer un arreglo y un valor a buscar y mostrar la posicion del valor.
*/
import java.util.Scanner;
public class TestBusquedaLineal {
    public static int buscarLineal(int[] arreglo, int valor) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valor) {
                return i; 
            }
        }
        return -1;
    }
   public static void inicio() {
      Scanner sc = new Scanner(System.in);
      System.out.print("Ingrese el tamaño del arreglo: ");
      int n = sc.nextInt();
        
      int[] datos = new int[n];
        
      System.out.println("Ingrese " + n + " números enteros:");
       for (int i = 0; i < n; i++) {
          System.out.print("Elemento [" + i + "]: ");
          datos[i] = sc.nextInt();
       }
  
      System.out.print("Ingrese el valor a buscar: ");
      int valorBuscado = sc.nextInt();
        
      int posicion = buscarLineal(datos, valorBuscado);
        
      if (posicion != -1) {
         System.out.println("El valor " + valorBuscado + " se encontró en la posición: " + posicion);
      } else {
          System.out.println("El valor " + valorBuscado + " NO se encontró en el arreglo.");
        }
    }
}