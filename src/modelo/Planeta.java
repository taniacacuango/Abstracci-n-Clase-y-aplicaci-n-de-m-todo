/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */

public class Planeta {
    // Atributos
    public String nombre;
    public int cantidadSatelites;
    public double masaKg;
   public double volumenKm3;
  public int diametroKm;
    public int distanciaMediaAlSol;
     public TipoPlaneta tipo;
    public boolean observableASimpleVista;

    // Enumerado para el tipo de planeta
    public enum TipoPlaneta {
        GASEOSO,
        TERRESTRE,
        ENANO
    }

    // Constructor
    public Planeta(String nombre, int cantidadSatelites, double masaKg, double volumenKm3,
                   int diametroKm, int distanciaMediaAlSol, TipoPlaneta tipo, boolean observableASimpleVista) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masaKg = masaKg;
        this.volumenKm3 = volumenKm3;
        this.diametroKm = diametroKm;
        this.distanciaMediaAlSol = distanciaMediaAlSol;
        this.tipo = tipo;
        this.observableASimpleVista = observableASimpleVista;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadSatelites() {
        return cantidadSatelites;
    }

    public void setCantidadSatelites(int cantidadSatelites) {
        this.cantidadSatelites = cantidadSatelites;
    }

    public double getMasaKg() {
        return masaKg;
    }

    public void setMasaKg(double masaKg) {
        this.masaKg = masaKg;
    }

    public double getVolumenKm3() {
        return volumenKm3;
    }

    public void setVolumenKm3(double volumenKm3) {
        this.volumenKm3 = volumenKm3;
    }

    public int getDiametroKm() {
        return diametroKm;
    }

    public void setDiametroKm(int diametroKm) {
        this.diametroKm = diametroKm;
    }

    public int getDistanciaMediaAlSol() {
        return distanciaMediaAlSol;
    }

    public void setDistanciaMediaAlSol(int distanciaMediaAlSol) {
        this.distanciaMediaAlSol = distanciaMediaAlSol;
    }

    public TipoPlaneta getTipo() {
        return tipo;
    }

    public void setTipo(TipoPlaneta tipo) {
        this.tipo = tipo;
    }

    public boolean isObservableASimpleVista() {
        return observableASimpleVista;
    }

    public void setObservableASimpleVista(boolean observableASimpleVista) {
        this.observableASimpleVista = observableASimpleVista;
    }

    // Método para calcular la densidad del planeta
    public double calcularDensidad() {
        return masaKg / volumenKm3;
    }
}
