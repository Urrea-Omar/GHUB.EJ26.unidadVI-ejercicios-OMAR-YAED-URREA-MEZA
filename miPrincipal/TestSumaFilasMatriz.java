package miPrincipal;
/*
Autor: Omar Yaed Urrea Meza
Fecha: 11/05/2026   
Proposito: Leer una matriz y mostrar la suma de cada fila.
*/
import java.util.Scanner;
public class TestSumaFilasMatriz {
    public static int sumarFila(int[] [] matriz, int indiceFila) {
        int suma = 0;
        int cantidadColumnas = matriz[indiceFila].length;
        
        for (int j = 0; j < cantidadColumnas; j++) {
            suma += matriz[indiceFila] [j];
        }
        return suma;
    }
    public static void inicio(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de filas: ");
        int filas = sc.nextInt(); 
        System.out.print("Ingrese el número de columnas: ");
        int columnas = sc.nextInt();

        if (filas <= 0 || columnas <= 0) {
            System.out.println("La matriz debe ser mayor a 0.");
            System.exit(0);
        }

        int[] [] matriz = new int[filas] [columnas];
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Valor [" + i + "] [" + j + "]: ");
                matriz[i] [j] = sc.nextInt();
            }
        }
        System.out.println("\n Suma de cada fila ");
        for (int i = 0; i < filas; i++) {
            int resultado = sumarFila(matriz, i);
            System.out.println("Suma de la fila " + i + ": " +resultado);
        }
    }
}