package Main;

import Entidad.Usuario;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        var bandera = false;
        Usuario usuario1 = new Usuario("Kevin","Corriente",1666.99);

        System.out.println(usuario1.toString());
        var entrada = new Scanner(System.in);

        while(!bandera){
            var opcion = 0;
            var entradaMSald = 0.0;
            System.out.println("**Escriba el número de la opción deseada**");
            System.out.println("""
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """);
            opcion = entrada.nextInt();
            switch (opcion){
                case 1:
                    System.out.println(usuario1.consultarSaldo());
                    break;
                case 2:
                    System.out.print("Ingrese saldo a retirar: ");
                    entradaMSald = entrada.nextDouble();
                    entrada.nextLine();
                    System.out.println(usuario1.retirarSaldo(entradaMSald));
                    break;
                case 3:
                    System.out.print("Ingrese saldo a depositar: ");
                    entradaMSald = entrada.nextDouble();
                    entrada.nextLine();
                    System.out.println(usuario1.depositarSaldo(entradaMSald));
                    break;
                case 9:
                    System.out.println("Finalizando el programa. Muchas gracias por usar nuestro servicios");
                    bandera = true;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
}
