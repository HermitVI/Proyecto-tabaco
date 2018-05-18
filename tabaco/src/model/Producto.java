package model;


public class Producto {
    private int id;
    private int tipoT;
    private int tipoP;
    private int tipoF;
    private int precio;

    public Producto() {
    }

    public Producto(int id, int tipoT, int tipoP, int tipoF, int precio) {
        this.id = id;
        this.tipoT = tipoT;
        this.tipoP = tipoP;
        this.tipoF = tipoF;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTipoT() {
        return tipoT;
    }

    public void setTipoT(int tipoT) {
        this.tipoT = tipoT;
    }

    public int getTipoP() {
        return tipoP;
    }

    public void setTipoP(int tipoP) {
        this.tipoP = tipoP;
    }

    public int getTipoF() {
        return tipoF;
    }

    public void setTipoF(int tipoF) {
        this.tipoF = tipoF;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", tipoT=" + tipoT + ", tipoP=" + tipoP + ", tipoF=" + tipoF + ", precio=" + precio + '}';
    }
    
}
