import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Array;
import java.util.ArrayList;

public class Main {

    public Main() throws IOException {
    }

    public static void main(String[] args) throws IOException {
        String rutaPronostico = "C:\\Users\\Celeste\\Desktop\\Argentina programa\\ProyectoArgentinaPrograma\\TPI-Grupo3\\src\\pronostico.txt";
        String rutaResultado = "C:\\Users\\Celeste\\Desktop\\Argentina programa\\ProyectoArgentinaPrograma\\TPI-Grupo3\\src\\pronostico.txt";

        ArrayList<Pronostico> pronosticos = txtAPronostico(rutaPronostico);
        ArrayList<Partido> partidos = txtAPartidos(rutaResultado);

        Ronda ronda = new Ronda("1", partidos);
        int puntos = ronda.puntos(pronosticos);

    }

    static ArrayList<Pronostico> txtAPronostico(String rutaPronostico) throws IOException {
        ArrayList<Pronostico> pronosticos = new ArrayList<>();

        for (String linea : Files.readAllLines(Paths.get(rutaPronostico))) {
//            ArrayList<String> splitted = new ArrayList<>();
//            for (int i = 0; i < linea.length(); i++){
//                splitted.add(linea[i]);
//            }
            String[] splitted = linea.split(" ");
            Equipo equipo1 = new Equipo(splitted[0]);
            Equipo equipo2 = new Equipo(splitted[1]);
            Partido partido = new Partido(equipo1, equipo2);
            Equipo equipo = new Equipo(splitted[2]);

            ResultadoEnum resultado;
            String resultadoLinea = splitted[3];

            if (resultadoLinea.equals("Empate")) {
                resultado = ResultadoEnum.empate;
            } else if (resultadoLinea.equals("Ganador")) {
                resultado = ResultadoEnum.ganador;
            } else {
                resultado = ResultadoEnum.perdedor;
            }

            Pronostico pronostico = new Pronostico(partido, equipo, resultado);
            pronosticos.add(pronostico);
        }
        return pronosticos;
    }

    static ArrayList<Partido> txtAPartidos(String rutaPartido) throws IOException {
        ArrayList<Partido> partidos = new ArrayList<>();

        for (String linea : Files.readAllLines(Paths.get(rutaPartido))){
            String[] splitted = linea.split(" ");
            Equipo equipo1 = new Equipo(splitted[0]);
            int goles1 = Integer.valueOf(splitted[1]);
            int goles2 = Integer.valueOf(splitted[2]);
            Equipo equipo2 = new Equipo(splitted[3]);
            Partido partido = new Partido(equipo1, equipo2, goles1, goles2);
            partidos.add(partido);
        }
        return partidos;
    }
    Persona persona1 = new Persona("persona1", txtAPronostico("C:\\Users\\Celeste\\Desktop\\Argentina programa\\ProyectoArgentinaPrograma\\TPI-Grupo3\\src\\pronostico.txt"));
    Persona persona2 = new Persona("persona2", txtAPronostico("C:\\Users\\Celeste\\Desktop\\Argentina programa\\ProyectoArgentinaPrograma\\TPI-Grupo3\\src\\pronostico.txt"));
}