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
                    System.out.println("Proceso");
                break;
                case 2:
                    System.out.println("Proceso");
                break;
                case 3:
                    System.out.println("Proceso");
                break;
                case 4:
                    System.out.println("Proceso");
                break;
                case 5:
                 System.out.println("Proceso");
                break;
                default:
                 System.out.println("Opcion invalida, intente de nuevo");
                 break;
                case 0:
                 System.out.println("Hasta luego chaval");
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
        System.out.println("4"); 
        System.out.println("5"); 
        System.out.println("");
        System.out.println("\t0) Salir");
        System.out.println("Seleccione opcion deseada");
    }
}