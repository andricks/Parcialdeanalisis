package org.example;

public class Bicicleta implements Vehiculo {
    @Override
    public synchronized void iniciar() {
        System.out.println("La bicicleta está iniciando...");
        try {
            Thread.sleep(500); // Simular el proceso de inicio
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("La bicicleta ha iniciado.");
    }

    @Override
    public synchronized void detener() {
        System.out.println("La bicicleta se está deteniendo...");
        try {
            Thread.sleep(500); // Simular el proceso de detención
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("La bicicleta se ha detenido.");
    }
}
