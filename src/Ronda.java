import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ronda {
    private String numeroDeRonda;
    private ArrayList<Partido> partidos;

    private ArrayList<Persona> personas;


    public Ronda(String numeroDeRonda, ArrayList<Partido> partidos) {
        this.numeroDeRonda = numeroDeRonda;
        this.partidos = partidos;
    }

    public int puntos(ArrayList<Pronostico> pronosticos){
        int puntosSumados = 0;

        for(Pronostico pronostico : pronosticos) {
            Partido partidoPronosticado;

            for(Partido partido : partidos) {
                Partido partidoPronostico = pronostico.getPartido();
                boolean mismoEquipo1 = partido.getEquipo1().getNombre().equals(partidoPronostico.getEquipo1().getNombre());
                boolean mismoEquipo2 = partido.getEquipo2().getNombre().equals(partidoPronostico.getEquipo2().getNombre());

                if(mismoEquipo1 && mismoEquipo2) {
                    partidoPronosticado = partido;

                    if (partidoPronosticado.resultado(pronostico.getEquipo()).equals(pronostico.getResultado())) {
                        puntosSumados++;
                    }
                }
            }
        }
        return puntosSumados;
    }

    public Map<Persona, Integer> puntosPorPersona(ArrayList<Pronostico> pronosticos){
        Map<Persona, Integer> resultado = new HashMap<>();
        for (Persona persona: personas){
            int puntosDeLaPersona = puntos(pronosticos);
            resultado.put(persona, puntosDeLaPersona);
            System.out.println(persona + " " + puntosDeLaPersona);
        }
        return resultado;
    }
}
