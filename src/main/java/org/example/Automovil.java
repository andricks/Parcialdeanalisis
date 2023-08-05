package org.example;

public class Automovil implements Vehiculo {
    @Override
    public synchronized void iniciar() {
        System.out.println("El automóvil está iniciando...");
        try {
            Thread.sleep(1000); // Simular el proceso de inicio
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("El automóvil ha iniciado.");
    }

    @Override
    public synchronized void detener() {
        System.out.println("El automóvil se está deteniendo...");
        try {
            Thread.sleep(1000); // Simular el proceso de detención
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("El automóvil se ha detenido.");
    }
}
