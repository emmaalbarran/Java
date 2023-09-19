// Clase base Volador
public abstract class Volador {
    protected String nombre;
    protected String codigo;
    protected String tipo;

    @Override
    public String toString() {
        return nombre + " (" + tipo + ", " + codigo + ")";
    }
}

