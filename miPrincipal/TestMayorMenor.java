package miPrincipal;
/* 
Autor: Urrea Meza Omar Yaed
Fecha: 08/05/2026
Descripcion: Leer un arreglo de enteros y crear funciones para encontrar el maximo y el minimo.
*/
import java.util.Scanner;
public class TestMayorMenor {
  public static void inicio() {
    Scanner sc = new Scanner(System.in);
    int n;
    int mayor, menor;
    System.out.print("Cuantos numeros va a colocar: ");
    n = sc.nextInt();

    int numeros[] = new int[n];
    for (int i = 0; i < n; i++) {
      System.out.print("Ingresa el numero " + (i + 1) + " : ");
      numeros[i] = sc.nextInt();
    }

    mayor = numeros[0];
    menor = numeros[0];
    for (int i = 0; i < n; i++) {
      if (numeros[i] > mayor) {
        mayor = numeros[i];
      }

      if (numeros[i] < menor) {
        menor = numeros[i];
      }
    }
    System.out.println("El numero mayor es: " + mayor);
    System.out.println("El numero menor es: " + menor);

  }
}