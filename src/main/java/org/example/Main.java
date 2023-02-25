package org.example;

import org.example.clases.Familia;

public class Main {
    public static void main(String[] args) {

        // en el main usamos las clases que nosotros programamos
        Integer notaFinal =5;
        // para usar una clase debo crear un objeto de la clase
        // un objeto en cualquier lenguaje es una VARIABLE especial


        Animal pato = new Animal();
        // SI YA TENGO UN OBJETO LO USO PARA acceder a los atributos y metodos de una clase


        pato.setNombre("Pablo");
        System.out.println("Hola, mi nombre es "+pato.getNombre());
        Familia familia = new Familia();
        // familia.nombrePapa = "Manuel";
        // System.out.println("Mi nombre es " + familia.nombrePapa+ " Y soy el papá");
        // pato.edad=10;

        familia.setNombrePapa("Charlie");
        familia.setNombreMama("Gaby");
        familia.setEdadDelPapa(600);
        System.out.println("La edad del papa es: "+ familia.getEdadDelPapa());
        System.out.println("En nombre de la mama es: "+ familia.getNombreMama());
        System.out.println("El nombre del papa es: " + familia.getEdadDelPapa());





    }
}