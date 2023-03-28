public class Partido {
    private int equipo1;
    private int equipo2;

    private int golesEquipo1;
    private int getGolesEquipo2;

    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(int equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(int equipo2) {
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

    public int equipoGanador(Equipo equipo1, Equipo equipo2){
        if (golesEquipo1 > getGolesEquipo2){
            return 1;
        } else if (getGolesEquipo2 > golesEquipo1) {
            return 2;
        } else {
            return 0;
        }
    }


}
