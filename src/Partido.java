public class Partido {
    private Equipo equipo1;
    private Equipo equipo2;

    private int golesEquipo1;
    private int getGolesEquipo2;

    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

    public int getGolesEquipo1() {
        return golesEquipo1;
    }

    public void setGolesEquipo1(int golesEquipo1) {
        this.golesEquipo1 = golesEquipo1;
    }

    public int getGetGolesEquipo2() {
        return getGolesEquipo2;
    }

    public void setGetGolesEquipo2(int getGolesEquipo2) {
        this.getGolesEquipo2 = getGolesEquipo2;
    }

    public Equipo equipoGanador(Equipo equipo1, Equipo equipo2){
        if (golesEquipo1 > getGolesEquipo2){
            return equipo1;
        } else if (getGolesEquipo2 > golesEquipo1) {
            return equipo2;
        } else {
            return null;
        }
    }


}
