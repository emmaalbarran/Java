// Clase concreta para el objeto Helicoptero
class Helicoptero extends Volador implements PuedeAterrizarEnPista1 {
    public Helicoptero() {
        nombre = "Helicoptero";
        codigo = "A7-JOS";
        tipo = "Comercial";
    }

    @Override
    public boolean puedeAterrizarEnPista1() {
        return true;
    }
}


