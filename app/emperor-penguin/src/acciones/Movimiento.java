package acciones;

import mobs.Mob;

public interface Movimiento {
    static final int FASE_DEFENSA=0;
    static final int FASE_ATAQUE=1;

    void aplicar();
    int obtenerFaseEnQueAplica();
}
