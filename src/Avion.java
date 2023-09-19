// Clase Avion
class Avion extends Volador implements PuedeAterrizarEnPista1 {
    public Avion() {
        nombre = "Avion";
        codigo = "LV-HYU";
        tipo = "Comercial";
    }

    @Override
    public boolean puedeAterrizarEnPista1() {
        return true;
    }
}


