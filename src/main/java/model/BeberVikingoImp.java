package main.java.model;

import main.java.interfaces.Beber;

public class BeberVikingoImp implements Beber {

    @Override
    public void beber() {
        switch ((int)(Math.random()*3)){
            case 1:
                System.out.println("¡GLUP GLUP! Los vikingos somos hábiles bebedores. *bebe*");
                break;
            case 2:
                System.out.println("JA! Estamos acostumbrados de tanto beber al festejar por nuestras victorias. *bebe*");
                break;
            default:
                System.out.println("La fuerza de los guerreros vikingos no solo se refleja en las batallas. *beber*");
                break;
        }
    }
}
