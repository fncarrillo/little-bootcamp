package acciones;

import mobs.Mob;

public class Atacar implements Movimiento{

    private int danio;
    private Mob objetivo;

    public Atacar(int danio, Mob objetivo) {
        this.danio = danio;
        this.objetivo = objetivo;
    }

    @Override
    public void aplicar() {
        objetivo.recibirDanio(danio);
    }

    @Override
    public int obtenerFaseEnQueAplica(){
        return FASE_ATAQUE;
    }

}
