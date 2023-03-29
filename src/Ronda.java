import java.util.ArrayList;

public class Ronda {
    private String numeroDeRonda;
    private Partido[] partidos;

    public ArrayList<Integer> equiposGanadores(){
        ArrayList<Integer> resultado = new ArrayList<Integer>();
        for (Partido partido : partidos){
            int equipoGanador = partido.equipoGanador(partido.getEquipo1(), partido.getEquipo2());
            resultado.add(equipoGanador);
        }
        return resultado;
    }
}
