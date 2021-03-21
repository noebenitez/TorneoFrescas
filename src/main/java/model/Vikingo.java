package main.java.model;

import main.java.interfaces.Beber;
import main.java.interfaces.Orinar;

import java.util.Objects;

public class Vikingo extends Humano{

    private Integer bebedorProfesional;


    public Vikingo(){}

    public Vikingo(String nombre, Integer edad, Integer peso, Orinar orinar, Beber beber, Integer bebedorProfesional) {
        super(nombre, edad, peso, orinar, beber);
        this.bebedorProfesional = bebedorProfesional;
    }

    public Integer getBebedorProfesional() {
        return bebedorProfesional;
    }

    public void setBebedorProfesional(Integer bebedorProfesional) {
        this.bebedorProfesional = bebedorProfesional;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Vikingo)) return false;
        Vikingo vk = (Vikingo) o;
        return vk.getNombre() == this.getNombre() && vk.getEdad() == this.getEdad()
                && vk.getEdad() == this.getEdad() && vk.getBeber() == this.getBeber()
                && vk.getOrinar() == this.getOrinar() && vk.bebedorProfesional == this.bebedorProfesional;
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.getNombre(), this.getEdad(), this.getBeber(), this.getOrinar(), bebedorProfesional);
    }
}
