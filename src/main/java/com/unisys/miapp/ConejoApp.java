package com.unisys.miapp;



public class ConejoApp {
    public static void main(String[] args) {
        Conejo caramelo = new Conejo();
        System.out.println(caramelo);
        caramelo.setColor("marron");
        System.out.println(caramelo);
        caramelo.setPatas(4);
        caramelo.setNombre("Caramelo");
        int patas = caramelo.getPatas();
        System.out.println(caramelo.getNombre() + " tiene " +  caramelo.getPatas() + " patas");
        Conejo blanco = new Conejo("Blanquito", "Blanco", 4);
        System.out.println(blanco);
    }

}
