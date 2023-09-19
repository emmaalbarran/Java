// Clase concreta para el objeto Avioneta
class Avioneta extends Volador implements PuedeAterrizarEnPista1 {
    public Avioneta() {
        nombre = "Avioneta";
        codigo = "N02588";
        tipo = "Comercial";
    }

    @Override
    public boolean puedeAterrizarEnPista1() {
        return true;
    }
}

