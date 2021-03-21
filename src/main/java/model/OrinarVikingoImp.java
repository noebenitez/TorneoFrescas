package main.java.model;

import main.java.interfaces.Orinar;

public class OrinarVikingoImp implements Orinar {

    @Override
    public void orinar() {
        switch ((int)(Math.random()*2)){
            case 1:
                System.out.println("AGGGH! No puedo aguantar más *corre al baño*");
                break;
            default:
                System.out.println("No creí que fueras tan tolerante *corre al baño*.");
                break;
        }
    }
}
