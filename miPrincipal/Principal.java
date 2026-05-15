package miPrincipal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int opc;
        
        do{
            menu();
            opc = Sc.nextInt();
            switch(opc){
                case 1:
                    System.out.println("Ejercicio 1");
                    System.exit(0);
                break;
                case 2:
                    System.out.println("Ejercicio 2");
                    System.exit(0);
                break;
                case 3:
                    System.out.println("Ejercicio 3");    
                    System.exit(0);
                break;
                case 4:
                    TestPromMayores.inicio();
                    System.exit(0);
                break;
                case 5:
                    System.out.println("Ejercicio 5");
                    System.exit(0);
                break;
                case 6:
                    TestBusquedaLineal.inicio();
                    System.exit(0);
                break;
                case 7:
                    TestFrecuenciaElementos.inicio();
                    System.exit(0);
                break;
                case 8:
                    TestSumaFilasMatriz.inicio();
                    System.exit(0);
                break;
                case 9:
                    TestMenuArreglos.inicio();
                     System.exit(0);
                break;
                case 10:
                  TestAnalisisEdades.inicio();
                  System.exit(0);
                break;
                case 0:
                 System.out.println("Hasta luego chaval");
                 break;
                default:
                 System.out.println("Opcion invalida, intente de nuevo");
                 break;
            }

        }while (opc!=0);

    }
    public static void menu(){
        System.out.println("********************************");
        System.out.println("          MENU MAESTRO          ");
        System.out.println("********************************");
        System.out.println("1"); 
        System.out.println("2");
        System.out.println("3");
        System.out.println("4 ) Promedio y Mayores al Promedio");
        System.out.println("5"); 
        System.out.println("6) Busqueda Lineal");
        System.out.println("7) Frecuencia de Elementos");
        System.out.println("8) Suma de Filas de una Matriz");
        System.out.println("9) Menu de Arreglos");
        System.out.println("10) Análisis de Edades");
        System.out.println("");
        System.out.println("\t0) Salir");
        System.out.println("Seleccione opcion deseada");
    }
}