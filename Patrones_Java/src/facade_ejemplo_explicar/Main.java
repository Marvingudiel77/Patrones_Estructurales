package facade_ejemplo_explicar;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Fachada fachada = new Fachada(); // Crea un objeto de la clase Fachada llamado fachada, que servirá
        // para gestionar las operaciones relacionadas con cuentas, préstamos y tarjetas.
        int opcion;
        do{
            System.out.print("[1]Cuentas    [2]Prestamos    [3]Tarjetas      [4]Salir \n" );
            opcion = scanner.nextInt();
            switch(opcion){
                case 1:
                    fachada.OperacionesCuentas();
                    break;
                case 2:
                    fachada.OperacionessPrestamos();
                    break;
                case 3:
                    fachada.OperacionesTarjetas();
                    break;
            }
        }while(opcion != 4);
    }
}