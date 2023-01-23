import Menus.FachadaMenus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        FachadaMenus fm = new FachadaMenus();

        System.out.print("Ingresa tu nombre de usuario: ");
        String username = scanner.nextLine();

        System.out.print("Ingresa tu contraseña: ");
        String password = scanner.nextLine();

        if (autenticar(username, password)) {
            System.out.println("Inicio de sesión exitoso!");
            System.out.println("\n\n\n");
            System.out.println("A que modulo quieres acceder?");
            System.out.println("\t 1. Gestion Secciones");
            System.out.println("\t 2. Tienda");

            int opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    fm.iniciarMGSecciones();
                    break;

                case 2:
                    fm.iniciarMGTienda();
                    break;

                default:
                    System.out.println("Has elegido una opcion incorrecta.");
                    System.out.println("\nSaliendo del programa...");
            }

        } else {
            System.out.println("Nombre de usuario o contraseña incorrectos.");
        }
    }

    private static boolean autenticar(String username, String password) {
        //TODO
        return true;
    }
}
