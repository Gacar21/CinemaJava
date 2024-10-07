package cinemajava;

import Cine.Espectador;
import Cine.Peliculas;

import java.util.Scanner;

public class CinemaJava {

    public static void main(String[] args) {

        int valor = 10000;
        Scanner sc = new Scanner(System.in);
        Espectador espectador = new Espectador();
        Peliculas pelis = new Peliculas("Como programar y no morir 2", "Gabriel C", 18, 10000);

        boolean continuar = true;

       mainLoop: while (continuar) {
           int numero = (int) ((Math.random() * 4) + 1);
           int numero2 = (int) ((Math.random() * 4) + 1);
            for (int i = numero; i < 9; i++) {
                for (int j = numero2; j < 9; j++) {

                    if (i < espectador.getNom().length && j < espectador.getPuestos().length) {

                        System.out.println("nombre = " + espectador.getNom()[i][j]);
                        System.out.println("edad = " + espectador.getEdades()[i][j]);
                        System.out.println("Plata = " + espectador.getPlata()[i][j]);

                            System.out.println("PUESTO DISPONIBLE = " + espectador.getPuestos()[i][j]);

                        if (espectador.getPuestos()[i][j].equals("0")) {
                            espectador.getPuestos()[i][j] = espectador.getPuestos()[numero2][numero];
                            continue;
                        }


                                System.out.println("""
                                        ¿ACEPTAR PUESTO?
                                        1. SI
                                        2. NO
                                        3.SALIR""");

                                int opc = sc.nextInt();
                                switch (opc) {

                                    case 1:
                                        if (espectador.getEdades()[i][j] < 18 || espectador.getPlata()[i][j] < 10000) {
                                            if (espectador.getEdades()[i][j] < 18) {
                                                System.out.println("No tienes edad suficiente para ver esta película");
                                            }
                                            if (espectador.getPlata()[i][j] < 10000) {
                                                System.out.println("No tienes dinero suficiente para ver esta película");
                                            }
                                            System.out.println(" ");
                                            System.out.println("Pasando al siguiente Usuario...\n");
                                            continue;
                                        }
                                        espectador.getPuestos()[i][j] = "0";
                                        System.out.println("PUESTO ASIGNADO");
                                    case 2:
                                        continue;
                                    case 3:
                                        System.out.println("PELICULA = " + pelis.getTitulo());
                                        System.out.println("DURACION = " + pelis.getDuracion());
                                        System.out.println("AUTOR = " + pelis.getAutor());
                                        continuar = false;
                                        break mainLoop;
                                    default:
                                        System.out.println("OPCION INVALIDA");
                                        break;
                        }
                    }
                }

            }

        }
        System.out.println("Gracias por ver");

    }
}


