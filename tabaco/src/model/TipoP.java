package model;


public class TipoP {
    private int id;
    private String nombre;
    private String sabor;

    public TipoP() {
    }

    public TipoP(int id, String nombre, String sabor) {
        this.id = id;
        this.nombre = nombre;
        this.sabor = sabor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    @Override
    public String toString() {
        return "TipoP{" + "id=" + id + ", nombre=" + nombre + ", sabor=" + sabor + '}';
    }
    
}
