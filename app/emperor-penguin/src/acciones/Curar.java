package acciones;

import mobs.Mob;

public class Curar implements Movimiento{

    private double porcentajeCuracion;
    private Mob objetivo;

    public Curar(double porcentajeCuracion, Mob objetivo) {
        this.porcentajeCuracion = porcentajeCuracion;
        this.objetivo = objetivo;
    }

    @Override
    public void aplicar() {
        int curacion = (int) ((double) objetivo.getHpMaxima() * this.porcentajeCuracion);
        objetivo.setHp(curacion + objetivo.getHp());
    }

    @Override
    public int obtenerFaseEnQueAplica(){
        return FASE_DEFENSA;
    }

}
