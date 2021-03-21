package main.java.model;

import main.java.interfaces.Orinar;

public class OrinarEspartanoImp implements Orinar {
    @Override
    public void orinar() {
        switch ((int)(Math.random()*2)){
            case 1:
                System.out.println("Fui vencido esta vez pero no volverá a suceder jamás! *corre al baño*");
                break;
            default:
                System.out.println("Me disculpo por deshonrar a mi gran imperio *corre al baño*.");
                break;
        }
    }
}
