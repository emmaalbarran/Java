public class NaveEspacial implements Volador {
    private String nombre;
    private String codigo;
    private String tipo;

    public NaveEspacial(String nombre, String codigo, String tipo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.tipo = tipo;
    }

    @Override
    public boolean aterrizarEnPista1() {
        return false;
    }
    @Override
    public String toString() {
    return "Volador " + nombre + ", " + codigo + ", " + tipo + ":";
    }
}