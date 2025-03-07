package acciones;

import mobs.Jugador;
import mobs.Mob;

public class Curar implements Movimiento{

    private double porcentajeCuracion;
    private Jugador objetivo;

    public Curar(double porcentajeCuracion, Jugador objetivo) {
        this.porcentajeCuracion = porcentajeCuracion;
        this.objetivo = objetivo;
    }

    @Override
    public void aplicar() {
        int curacion = (int) ((double) objetivo.getHpMaxima() * this.porcentajeCuracion);
        objetivo.aumentarVida(curacion);
    }

    @Override
    public int obtenerFaseEnQueAplica(){
        return FASE_DEFENSA;
    }

}
