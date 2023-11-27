public class Item {
    private String nombre;
    private String tipo;
    private float precio;
    private int desgaste;

    public Item(String nombre, String tipo, float precio, int desgaste) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.desgaste = desgaste;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getDesgaste() {
        return desgaste;
    }

    public void setDesgaste(int desgaste) {
        this.desgaste = desgaste;
    }
}
