package miPrincipal;
/* 
autor: Urrea Meza Omar Yaed
fecha: 08/05/2026
Proceso:Leer un arreglo de números y crear una función 
que determine si un número es par.
*/
import java.util.Scanner;
public class TestParImpar {
  public static void inicio() {
    Scanner sc = new Scanner(System.in);
    int n, i, num;
    int pares, impares;
    pares = 0;
    impares = 0;

    System.out.print("Cuantos numeros desea colocar: ");
    n = sc.nextInt();
    int [] numeros = new int[n];
    for (i = 0; i < n; i++) {
      System.out.print("Ingrese un numero: " +i+ " : ");

      num = sc.nextInt();
      numeros[i] = num;
      if (numeros[i] % 2 == 0) {
        pares++;
      } else {
        impares++;
      }
    }
    System.out.println("Cantidad de pares: " + pares);
    System.out.println("Cantidad de impares: " + impares);

  }
}
