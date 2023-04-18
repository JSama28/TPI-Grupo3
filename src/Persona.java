import java.util.ArrayList;

public class Persona {
    private String nombre;
    private ArrayList<Pronostico> pronosticos;

    public Persona(String nombre, ArrayList<Pronostico> pronosticos) {
        this.nombre = nombre;
        this.pronosticos = pronosticos;
    }
}
