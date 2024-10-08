package Cine;

public class Peliculas {
    private String titulo;
    private String autor;
    private int duracion;
    private int edadMin;
    private int precio;


    public Peliculas(String titulo, String autor, int duracion, int edadMin, int precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        this.edadMin = edadMin;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdadMin() {
        return edadMin;
    }

    public void setEdadMin(int edadMin) {
        this.edadMin = edadMin;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
