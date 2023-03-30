import java.util.ArrayList;

public class Ronda {
    private String numeroDeRonda;
    private Partido[] partidos;



    public int puntos(Pronostico[] pronosticos){
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
        return puntosSumados
    }
}
