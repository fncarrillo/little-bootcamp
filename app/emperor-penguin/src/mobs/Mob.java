package mobs;

import acciones.Atacar;
import acciones.Defender;
import acciones.Movimiento;

public class Mob {

    private int hp;
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

    public int getHp() {
        return hp;
    }

    public int getHpMaxima() {
        return hpMaxima;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setHp(int hp){
        this.hp = Math.min(hp,this.hpMaxima);
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
