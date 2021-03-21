package main.java.model;

import main.java.interfaces.Beber;
import main.java.interfaces.Orinar;

public class Humano implements Comparable<Humano>{

    private String nombre;
    private Integer edad;
    private Integer peso;
    private Orinar orinar;
    private Beber beber;

    public Humano(){}

    public Humano(String nombre, Integer edad, Integer peso, Orinar orinar, Beber beber) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.orinar = orinar;
        this.beber = beber;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Orinar getOrinar() {
        return orinar;
    }

    public void setOrinar(Orinar orinar) {
        this.orinar = orinar;
    }

    public Beber getBeber() {
        return beber;
    }

    public void setBeber(Beber beber) {
        this.beber = beber;
    }

    public void orinar(){
        this.orinar.orinar();
    }

    public void beber(){
        this.beber.beber();
    }

    public String presentarse(){
        return "Mi nombre es " + nombre + ", tengo " + edad + " años y peso " + peso + " kilos.";
    }

    @Override
    public int compareTo(Humano humano){

        if (peso < humano.peso){
           return -1;
        }
        if (peso > humano.peso){
            return 1;
        }
        return 0;
    }
}
