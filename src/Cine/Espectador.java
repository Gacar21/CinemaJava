package Cine;


public class Espectador {

    String Nom[][] = {
            {"gabriel", "jesus","carrillo","rico", "gabriel", "jesus","carrillo","rico", "batman"},
            {"lesly", "alexandra", "villacob", "gelvez", "gabriel", "jesus","carrillo","rico","batman" },
            {"Jose", "aroldo", "ortega", "ortiz", "gabriel", "jesus","carrillo","rico", "batman"},
            {"Jose", "aroldo", "ortega", "ortiz", "gabriel", "jesus","carrillo","rico", "batman"},
            {"Jose", "aroldo", "ortega", "ortiz", "gabriel", "jesus","carrillo","rico", "batman"},
            {"Jose", "aroldo", "ortega", "ortiz", "gabriel", "jesus","carrillo","rico", "batman"},
            {"Jose", "aroldo", "ortega", "ortiz", "gabriel", "jesus","carrillo","rico", "batman"},
            {"Jose", "aroldo", "ortega", "ortiz", "gabriel", "jesus","carrillo","rico", "batman"},
            {"Jose", "aroldo", "ortega", "ortiz", "gabriel", "jesus","carrillo","rico", "batman"}
    } ;

    String puestos[][] = {
            {"1A", "1B", "1C", "1D" ,"1E", "1F", "1G" , "1H", "1I"},
            {"2A", "2B", "2C", "2D" ,"2E", "2F", "2G" , "2H", "2I"},
            {"3A", "3B", "3C", "3D" ,"3E", "3F", "3G" , "3H", "3I"},
            {"4A", "4B", "4C", "4D" ,"4E", "4F", "4G" , "4H", "4I"},
            {"5A", "5B", "5C", "5D" ,"5E", "5F", "5G" , "5H", "5I"},
            {"6A", "6B", "6C", "6D" ,"6E", "6F", "6G" , "6H", "6I"},
            {"7A", "7B", "7C", "7D" ,"7E", "7F", "7G" , "7H", "7I"},
            {"8A", "8B", "8C", "8D" ,"8E", "8F", "8G" , "8H", "8I"},
            {"9A", "9B", "9C", "9D" ,"9E", "9F", "9G" , "9H", "9I"}

    } ;

    int edades[][] = {
            {10, 12, 16 , 18, 10, 12, 16 , 18, 9 },
            {20, 22, 12 , 17, 10, 12, 16 , 18, 9},
            {20, 22, 12 , 17, 10, 12, 16 , 18, 9},
            {20, 22, 12 , 17, 10, 12, 16 , 18, 9},
            {20, 22, 12 , 17, 10, 12, 16 , 18, 9},
            {20, 22, 12 , 17, 10, 12, 16 , 18, 9},
            {20, 22, 12 , 17, 10, 12, 16 , 18, 9},
            {20, 22, 12 , 17, 10, 12, 16 , 18, 9},
            {30, 32, 10, 33,  10, 12, 16 , 18, 9 }

    } ;
    int plata[][] = {
            {5000, 2000, 10000 , 15555, 5000, 2000, 10000 , 15555, 15200},
            {5000, 2000, 10000 , 15555, 5000, 2000, 10000 , 15555, 15200},
            {5000, 2000, 10000 , 15555, 5000, 2000, 10000 , 15555, 15200},
            {22000, 12000, 15000, 30,  5000, 2000, 10000 , 15555, 15200},
            {20000, 1500, 3300 , 50000,  5000, 2000, 10000 , 15555, 15200},
            {20000, 1500, 3300 , 50000,  5000, 2000, 10000 , 15555, 15200},
            {20000, 1500, 3300 , 50000,  5000, 2000, 10000 , 15555, 15200},
            {20000, 1500, 3300 , 50000,  5000, 2000, 10000 , 15555, 15200},
            {22000, 12000, 15000, 30,  5000, 2000, 10000 , 15555, 15200}

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
