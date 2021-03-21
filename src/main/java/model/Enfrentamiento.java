package main.java.model;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Enfrentamiento {

    private List<Espartano> espartanos;
    private List<Vikingo> vikingos;

    public static Scanner scanner = new Scanner(System.in);

    public Enfrentamiento(){}

    public Enfrentamiento(List<Espartano> espartanos, List<Vikingo> vikingos) {
        ///Se ordenan las listas por peso
        Collections.sort(espartanos);
        Collections.sort(vikingos);
        this.espartanos = espartanos;
        this.vikingos = vikingos;
    }

    public void iniciar() {

        System.out.println("\n        >>> COMIENZA EL TORNEO DE FRESCAS >>>\n");
        System.out.println(">Se presentan los espartanos:\n");
        espartanos.forEach(esp -> {
            System.out.println(esp.presentarse());
        });
        System.out.println("\n>Se presentan los vikingos:\n");
        vikingos.forEach(vk -> {
            System.out.println(vk.presentarse());
        });

        ///Solo se enfrentan si cada equipo tiene la misma cantidad de integrantes.
        int nroEnfrentamientos = espartanos.size() == vikingos.size() ? espartanos.size() : 0;

        System.out.println("\n>Para continuar presione la tecla ENTER.");
        pausarConsola();
        scanner.nextLine();

        if (nroEnfrentamientos != 0) {
            System.out.println("\n      >>> INICIA EL ENFRENTAMIENTO >>>");
            System.out.println("     ¡Se enfrentan por orden de equipo!\n");

            int ptsVikingos = 0, ptsEspartanos = 0, pts = -1;
            Espartano esp;
            Vikingo vk;

            for (int i = 0; i < nroEnfrentamientos; i++) {

                esp = espartanos.get(i);
                vk = vikingos.get(i);
                System.out.println(">> ENFRENTAMIENTO NROº" + (i+1) +": " + esp.getNombre() + " vs. " + vk.getNombre() + "\n");

                while (pts != 0){
                    pts = iniciarTurno(esp, esp.getToleranciaExtra(), "Espartano");
                    if (pts != 0){
                        ptsEspartanos += pts;
                        System.out.println("\t>Para ver el siguiente turno presione la tecla ENTER.");
                        pausarConsola();
                        scanner.nextLine();
                        pts = iniciarTurno(vk, vk.getBebedorProfesional(), "Vikingo");
                        if (pts != 0){
                            ptsVikingos += pts;
                            System.out.println("\t>Para ver el siguiente turno presione la tecla ENTER.");
                            pausarConsola();
                            scanner.nextLine();
                        }
                    }
                }
                if (i != nroEnfrentamientos){   ///Solo se muestra si quedan enfrentamientos por realizar

                    pts = -1;
                    System.out.println(">Para ver el siguiente enfrentamiento presione la tecla ENTER.");
                    pausarConsola();
                    scanner.nextLine();
                }
            }

            System.out.println("                  <<< ¡¡¡EL TORNEO A FINALIZADO!!! >>>\n");
            if (ptsEspartanos > ptsVikingos){

                System.out.println("\t++ Ganó el equipo de los ESPARTANOS con " + ptsEspartanos + " contra " + ptsVikingos + " obtenidos por los vikingos " + " ++");
            }else{
                if (ptsEspartanos < ptsVikingos){
                    System.out.println("\t++ Ganó el equipo de los VIKINGOS con " + ptsEspartanos + " contra " + ptsVikingos + " obtenidos por los espartanos " + " ++");
                }else{
                    System.out.println("\t++ El enfrentamiento terminó en empate! Ambos equipos finalizaron con " + ptsVikingos + "puntos +++");
                }
            }

        }else{
            System.out.println("Los equipos no pueden enfrentarse porque no tienen la misma cantidad de integrantes.");
        }
    }

    //Se decide un num random con una ventaja determinada por el bonificador, si los puntos
    // no llegan a 35 significa que orina y no consigue puntos.

    private int turno(int bonificador){

        int pts = (int)(Math.random()*100) + bonificador;
        if (pts >= 35){
            return pts;
        }
        return 0;
    }

    private int iniciarTurno(Humano humano, int bonificador, String equipo){

        int pts = turno(bonificador);
        if (pts != 0) {
            System.out.println(equipo + " "  + humano.getNombre() + " dice:");
            humano.beber();
            System.out.println("\tEl equipo " + equipo + " suma " + pts + " puntos!!");
        } else {
            System.out.println(equipo + " "  + humano.getNombre() + " dice:");
            humano.orinar();
            System.out.println("\t-- Fin de la ronda --\n");
        }
        return pts;
    }

    public static void pausarConsola(){     // Pausa hasta presionar ENTER
        try{
            System.in.read();
        } catch(Exception e){}
    }




}
