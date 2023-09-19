// Clase Avion
class Avion extends Volador implements PuedeAterrizarEnPista1 {
    public Avion() {
        nombre = "Avion";
        codigo = "DFK-98";
        tipo = "Comercial";
    }

    @Override
    public boolean puedeAterrizarEnPista1() {
        return true;
    }
}

