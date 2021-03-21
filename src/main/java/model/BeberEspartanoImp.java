package main.java.model;

import main.java.interfaces.Beber;

public class BeberEspartanoImp implements Beber {

    @Override
    public void beber() {
        switch ((int)(Math.random()*3)){
            case 1:
                System.out.println("JAJAJA no perderé contra un barbárico vikingo. *bebe*");
                break;
            case 2:
                System.out.println("No seré vencido en ningún tipo de enfrentamiento. *bebe*");
                break;
            default:
                System.out.println("*bebe* Mi resistencia es tan fuerte como nuestro imperio.");
                break;
        }
    }
}
