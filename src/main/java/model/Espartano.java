package main.java.model;

import main.java.interfaces.Beber;
import main.java.interfaces.Orinar;

import java.util.Objects;

public class Espartano extends Humano{

    private Integer toleranciaExtra;

    public Espartano(BeberEspartanoImp beberEspartanoImp) {
    }

    public Espartano(String nombre, Integer edad, Integer peso, Orinar orinar, Beber beber, Integer toleranciaExtra) {
        super(nombre, edad, peso, orinar, beber);
        this.toleranciaExtra = toleranciaExtra;
    }

    public Integer getToleranciaExtra() {
        return toleranciaExtra;
    }

    public void setToleranciaExtra(Integer toleranciaExtra) {
        this.toleranciaExtra = toleranciaExtra;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Vikingo)) return false;
        Espartano esp = (Espartano) o;
        return esp.getNombre() == this.getNombre() && esp.getEdad() == this.getEdad()
                && esp.getEdad() == this.getEdad() && esp.getBeber() == this.getBeber()
                && esp.getOrinar() == this.getOrinar() && esp.toleranciaExtra == this.toleranciaExtra;
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.getNombre(), this.getEdad(), this.getBeber(), this.getOrinar(), toleranciaExtra);
    }
}

