package mobs;

import acciones.Curar;
import acciones.Movimiento;

public class Jugador extends Mob {

    private Movimiento curar;

    public Jugador(int hp, int hpMaxima, int escudo){
        super(hp,hpMaxima,escudo,10,5);
        curar = new Curar(0.15,this);
    }

    public Movimiento curar(){
        return curar;
    }

}
