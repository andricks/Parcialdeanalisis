package org.example;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaGestionVehiculos sistema = new SistemaGestionVehiculos();

        int opcion;
        do {
            System.out.println("----- Menú -----");
            System.out.println("1. Agregar automóvil");
            System.out.println("2. Agregar bicicleta");
            System.out.println("3. Iniciar vehículo");
            System.out.println("4. Detener vehículo");
            System.out.println("5. Mostrar vehículos registrados");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    sistema.agregarVehiculo(new Automovil());
                    System.out.println("Automóvil registrado.");
                    break;
                case 2:
                    sistema.agregarVehiculo(new Bicicleta());
                    System.out.println("Bicicleta registrada.");
                    break;
                case 3:
                    sistema.mostrarVehiculos();
                    System.out.print("Ingrese el índice del vehículo a iniciar: ");
                    int indiceInicio = scanner.nextInt();
                    sistema.iniciarVehiculo(indiceInicio);
                    break;
                case 4:
                    sistema.mostrarVehiculos();
                    System.out.print("Ingrese el índice del vehículo a detener: ");
                    int indiceDetener = scanner.nextInt();
                    sistema.detenerVehiculo(indiceDetener);
                    break;
                case 5:
                    sistema.mostrarVehiculos();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }
}
