package acciones;

import mobs.Mob;

public class Defender implements Movimiento{

    private int escudo;
    private Mob objetivo;

    public Defender(int escudo, Mob objetivo) {
        this.escudo = escudo;
        this.objetivo = objetivo;
    }

    @Override
    public void aplicar() {
        objetivo.darEscudo(this.escudo);
    }

    @Override
    public int obtenerFaseEnQueAplica(){
        return FASE_DEFENSA;
    }

}
