package Cine;


public abstract class Espectador {

    String Nom[][] = {
            {"gabriel", "jesus","carrillo","rico"},
            {"lesly", "alexandra", "villacob", "gelvez"},
            {"Jose", "aroldo", "ortega", "ortiz"}
    } ;

    String puestos[][] = {
            {"1A", "1B", "1C" , "1D"},
            {"2A", "2B", "2C" , "2D"},
            {"3A", "3B", "3C", "3D" }

    } ;

    int edades[][] = {
            {10, 12, 16 , 18},
            {20, 22, 12 , 17},
            {30, 32, 10, 33 }

    } ;
    int plata[][] = {
            {5000, 2000, 10000 , 15555},
            {20000, 1500, 3300 , 50000},
            {22000, 12000, 15000, 30 }

    } ;

    public String[][] getNom() {
        return Nom;
    }

    public void setNom(String[][] nom) {
        Nom = nom;
    }

    public String[][] getPuestos() {
        return puestos;
    }

    public void setPuestos(String[][] puestos) {
        this.puestos = puestos;
    }

    public int[][] getEdades() {
        return edades;
    }

    public void setEdades(int[][] edades) {
        this.edades = edades;
    }

    public int[][] getPlata() {
        return plata;
    }

    public void setPlata(int[][] plata) {
        this.plata = plata;
    }
}
