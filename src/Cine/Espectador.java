package Cine;


public class Espectador {

    String Nom[][] = {
            {"Gabriel", "Jesus","Carrillo","Rico", "Alejandro", "Galvis","Juan","Sebastian", "Quintero"},
            {"Lesly", "Alexandra", "Villacob", "Gelvez", "EVA", "Sandry","Pimienta","Salas","Batman" },
            {"Sanchez", "Aroldo", "Ortega", "Ortiz", "Esteban", "Urrutia","Duarte","Laura", "Leanis"},
            {"Sofia", "Lea", "Maria", "Lara", "Jessica", "Luz","Soler","Solecito", "Robin"},
            {"Luffy", "Zoro", "Nami", "Chopper", "Brook", "Frankly","Sanji","Jimbe", "Ussopp"},
            {"Valentina", "Jonny", "Jack", "David", "Andres", "Jorge","Armando","Karoll", "Julieth"},
            {"Elvia", "Alfredo", "Leal", "Mendoza", "Luis", "Heisenberg","Walter","Lois", "Peter"},
            {"Homero", "Marge", "Lisa", "Bart", "Mou", "Luigi","Ash Ketchut","Goku", "Vegueta"},
            {"Naruto", "Sasuke", "Jim", "Obama", "Sailor", "Zena","Hiruma","Meibis", "Dracula"}
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
            {20, 22, 26 , 18, 20, 22, 26 , 18, 19 },
            {10, 22, 22 , 27, 10, 22, 26 , 18, 19},
            {20, 22, 22 , 27, 20, 22, 16 , 18, 19},
            {20, 12, 22 , 27, 20, 22, 26 , 18, 19},
            {20, 22, 22 , 27, 20, 22, 16 , 18, 19},
            {20, 22, 22 , 17, 20, 22, 26 , 18, 19},
            {10, 22, 22 , 27, 20, 22, 26 , 18, 16},
            {20, 22, 12 , 27, 20, 22, 26 , 18, 15},
            {30, 32, 20,  33, 20, 22, 26 , 18, 17 }

    } ;
    int plata[][] = {
            {15000, 20000, 10000 , 15555, 50000, 20000, 10000 , 1555, 15200},
            {15000, 2000, 10000 , 15555, 50000, 20000, 10000 , 15555, 15200},
            {15000, 20000, 10000 , 15555, 50000, 20000, 10000 , 15555, 15200},
            {22000, 12000, 15000, 3000,  50000, 2000, 10000 , 15555, 15200},
            {20000, 15000, 33000 , 50000,  50000, 20000, 10000 , 15555, 15200},
            {2000, 15000, 33000 , 50000,  50000, 20000, 10000 , 15555, 15200},
            {20000, 15000, 33000 , 50000,  50000, 20000, 10000 , 15555, 15200},
            {20000, 15000, 33000 , 5000,  50000, 20000, 10000 , 15555, 15200},
            {22000, 1200, 15000, 30000,  50000, 20000, 1000 , 15555, 15200}

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
