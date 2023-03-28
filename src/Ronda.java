import java.util.ArrayList;

public class Ronda {
    private String numeroDeRonda;
    private Partido[] partidos;

    public ArrayList<Equipo> equiposGanadores(){
        ArrayList<Equipo> resultado = new ArrayList<>();
        for (Partido partido : partidos){
            Equipo equipoGanador = partido.equipoGanador(partido.getEquipo1(), partido.getEquipo2());
            resultado.add(equipoGanador);
        }
        return resultado;
    }



}
