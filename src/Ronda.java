import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Ronda {
    private String numeroDeRonda;
    private Partido[] partidos;

    ArrayList<Pronostico> txtAPronostico(String rutaPronostico) throws IOException {
        ArrayList<Pronostico> resultado = null;
        for (String linea : Files.readAllLines(Paths.get(rutaPronostico))){
            String[] splitted = linea.split(" ");
            Partido partido =
            Pronostico pronostico = new Pronostico();
        }
        return resultado;
    }

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
        return puntosSumados;
    }
}
