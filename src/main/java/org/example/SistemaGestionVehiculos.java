package org.example;
import java.util.ArrayList;
import java.util.List;
public class SistemaGestionVehiculos {
    private List<Vehiculo> vehiculos;

    public SistemaGestionVehiculos() {
        vehiculos = new ArrayList<>();
    }

    public synchronized void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void iniciarVehiculo(int indice) {
        if (indice >= 0 && indice < vehiculos.size()) {
            Vehiculo vehiculo = vehiculos.get(indice);
            vehiculo.iniciar();
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void detenerVehiculo(int indice) {
        if (indice >= 0 && indice < vehiculos.size()) {
            Vehiculo vehiculo = vehiculos.get(indice);
            vehiculo.detener();
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void mostrarVehiculos() {
        System.out.println("----- Vehículos registrados -----");
        for (int i = 0; i < vehiculos.size(); i++) {
            System.out.println(i + ". " + vehiculos.get(i).getClass().getSimpleName());
        }
    }
}
