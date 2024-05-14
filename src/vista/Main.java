/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Planeta;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        // Creación de objetos Planeta
        Planeta mercurio = new Planeta("Mercurio", 0, 3.285E23, 6.083E10, 4879, 58, Planeta.TipoPlaneta.ENANO, true);
        Planeta tierra = new Planeta("Tierra", 1, 5.972E24, 1.08321E12, 12742, 150, Planeta.TipoPlaneta.TERRESTRE, true);
        Planeta jupiter = new Planeta("Júpiter", 79, 1.898E27, 1.43128E15, 139820, 778, Planeta.TipoPlaneta.GASEOSO, true);
        Planeta marte = new Planeta("Marte", 2, 6.39E23, 1.6318E11, 6792, 228, Planeta.TipoPlaneta.TERRESTRE, true);
        Planeta pluton = new Planeta("Plutón", 5, 1.309E22, 7.15E9, 2370, 5906, Planeta.TipoPlaneta.ENANO, false);

        // Impresión de información de los planetas
        imprimirInformacionPlaneta(mercurio);
        imprimirInformacionPlaneta(tierra);
        imprimirInformacionPlaneta(jupiter);
        imprimirInformacionPlaneta(marte);
        imprimirInformacionPlaneta(pluton);
    }

    // Método para imprimir la información de un planeta
    public static void imprimirInformacionPlaneta(Planeta planeta) {
        System.out.println("Nombre: " + planeta.getNombre());
        System.out.println("Cantidad de satélites: " + planeta.getCantidadSatelites());
        System.out.println("Masa (kg): " + planeta.getMasaKg());
        System.out.println("Volumen (km^3): " + planeta.getVolumenKm3());
        System.out.println("Diámetro (km): " + planeta.getDiametroKm());
        System.out.println("Distancia media al Sol (millones de km): " + planeta.getDistanciaMediaAlSol());
        System.out.println("Tipo de planeta: " + planeta.getTipo());
        System.out.println("Observable a simple vista: " + planeta.isObservableASimpleVista());
        System.out.println("Densidad: " + planeta.calcularDensidad() + " kg/km^3\n");
    }
}
