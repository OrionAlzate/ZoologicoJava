package org.example.clases;

public class Familia {

    public String nombrePapa;
    protected String nombreMama;
    private String nombreDelHijo;

    private Integer edadDelPapa;

    public Familia() {
    }

    public Familia(String nombrePapa, String nombreMama, String nombreDelHijo, Integer edadDelPapa) {
        this.nombrePapa = nombrePapa;
        this.nombreMama = nombreMama;
        this.nombreDelHijo = nombreDelHijo;
        this.edadDelPapa = edadDelPapa;
    }

    public String getNombrePapa() {return nombrePapa;}

    public void setNombrePapa(String nombrePapa) {
        this.nombrePapa = nombrePapa;
    }

    public String getNombreMama() {
        return nombreMama;
    }

    public void setNombreMama(String nombreMama) {
        this.nombreMama = nombreMama;
    }

    public String getNombreDelHijo() {
        return nombreDelHijo;
    }

    public void setNombreDelHijo(String nombreDelHijo) {
        this.nombreDelHijo = nombreDelHijo;
    }

    public Integer getEdadDelPapa() {
        return edadDelPapa;
    }

    public void setEdadDelPapa(Integer edadDelPapa) {
        if (edadDelPapa < 0 || edadDelPapa > 20) {
            System.out.println("La edad no es permitida, esta muy viejo");
        } else {
            this.edadDelPapa = edadDelPapa;
        }

    }
}
