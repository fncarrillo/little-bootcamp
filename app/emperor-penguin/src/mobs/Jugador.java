package mobs;

import acciones.Curar;
import acciones.Movimiento;

public class Jugador extends Mob {

    private Movimiento curar;

    public Jugador(int hp, int hpMaxima, int defensa, int danio, int escudo, double porcentajeCuracion) {
        super(hp,hpMaxima,defensa,danio,escudo);
        curar = new Curar(porcentajeCuracion,this);
    }

    public Movimiento curar(){
        return curar;
    }

    public void aumentarVida(int curacion){
        super.hp = Math.min(super.hp+curacion,super.getHpMaxima());
    }

}
