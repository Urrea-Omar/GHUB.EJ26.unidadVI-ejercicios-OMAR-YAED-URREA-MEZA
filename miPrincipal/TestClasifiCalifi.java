package miPrincipal;
/*Autor: Urrea Meza Omar Yaed
Fecha: 08/05/2026
Proposito:Elaborar un algoritmo que clasifique las calificaciones de los alumnos.
 */
import java.util.Scanner;
public class TestClasifiCalifi {
    public static String clasificar(double calificacion) {
        if (calificacion >= 90) {
            return "A";
        } else if (calificacion >= 80) {
            return "B";
        } else if (calificacion >= 70) {
            return "C";
        } else if (calificacion >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
    public static void inicio() {
        Scanner sc = new Scanner(System.in);
        int n;
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        int countF = 0;
        System.out.print("Ingrese la cantidad de alumnos: ");
        n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("La cantidad debe ser mayor a 0.");
            return;
        } 
        double[] calificaciones = new double[n];
        String[] categorias = new String[n];
        
        System.out.println("Ingrese las calificaciones:");
        for (int i = 0; i < n; i++) {
            System.out.print("Calificacion " + (i + 1) + ": ");
            calificaciones[i] = sc.nextDouble();
            categorias[i] = clasificar(calificaciones[i]);
        }
        for (int i = 0; i < n; i++) {
            if (categorias[i].equals("A")) {
                countA++;
            } else if (categorias[i].equals("B")) {
                countB++;
            } else if (categorias[i].equals("C")) {
                countC++;
            } else if (categorias[i].equals("D")) {
                countD++;
            } else {
                countF++;
            }
        }       
        System.out.println();
        System.out.println(" Resultados:");
        System.out.println("A: " + countA);
        System.out.println("B: " + countB);
        System.out.println("C: " + countC);
        System.out.println("D: " + countD);
        System.out.println("F: " + countF);
    }
}