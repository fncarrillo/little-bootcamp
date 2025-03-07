package mobs;

import acciones.Atacar;
import acciones.Defender;
import acciones.Movimiento;

public class Mob {

    protected int hp;
    private int hpMaxima;
    private int defensa;
    private int danio;
    private int escudo;

    public Mob(int hp, int hpMaxima, int defensa, int danio, int escudo) {
        this.hp = hp;
        this.hpMaxima = hpMaxima;
        this.defensa = defensa;
        this.danio = danio;
        this.escudo = escudo;
    }

    public int getHpMaxima() {
        return hpMaxima;
    }

    public void recibirDanio(int danio){
        this.escudo-=danio;
        if(this.escudo<0){
            hp+=this.escudo;
            this.escudo=0;
        }
    }

    public void darEscudo(int escudo){
        this.escudo+=escudo;
    }

    public boolean estaMuerto(){
        return hp<=0;
    }

    public Movimiento atacar(Mob mob){
        return new Atacar(danio,mob);
    }

    public Movimiento defender(){
        return new Defender(escudo,this);
    }


}
