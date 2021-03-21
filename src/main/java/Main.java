package main.java;

import main.java.model.*;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Vikingo vk1 = new Vikingo("Axe", 30, 120, new OrinarVikingoImp(), new BeberVikingoImp(), 10 );
        Vikingo vk2 = new Vikingo("Aren", 56, 89, new OrinarVikingoImp(), new BeberVikingoImp(), 14 );
        Vikingo vk3 = new Vikingo("Esben", 37, 190, new OrinarVikingoImp(), new BeberVikingoImp(), 20 );
        Vikingo vk4 = new Vikingo("Gerd", 42, 83, new OrinarVikingoImp(), new BeberVikingoImp(), 12 );
        Vikingo vk5 = new Vikingo("Hans", 25, 93, new OrinarVikingoImp(), new BeberVikingoImp(), 15 );
        Espartano esp1 = new Espartano("Cesar", 64, 110, new OrinarEspartanoImp(), new BeberEspartanoImp(), 7);
        Espartano esp2 = new Espartano("Aeneas", 25, 91, new OrinarEspartanoImp(), new BeberEspartanoImp(), 20);
        Espartano esp3 = new Espartano("Denes", 53, 120, new OrinarEspartanoImp(), new BeberEspartanoImp(), 2);
        Espartano esp4 = new Espartano("Erasmus", 42, 73, new OrinarEspartanoImp(), new BeberEspartanoImp(), 12);
        Espartano esp5 = new Espartano("Julio", 33, 95, new OrinarEspartanoImp(), new BeberEspartanoImp(), 11);

        List<Espartano> espartanos = new LinkedList<Espartano>();
        espartanos.add(esp1); espartanos.add(esp2); espartanos.add(esp3);
        espartanos.add(esp4); espartanos.add(esp5);

        List<Vikingo> vikingos = new LinkedList<Vikingo>();
        vikingos.add(vk1); vikingos.add(vk2); vikingos.add(vk3);
        vikingos.add(vk4); vikingos.add(vk5);

        Enfrentamiento enfrentamiento = new Enfrentamiento(espartanos, vikingos);
        enfrentamiento.iniciar();

    }
}
