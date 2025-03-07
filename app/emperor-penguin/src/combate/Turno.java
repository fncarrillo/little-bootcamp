package combate;

import acciones.Movimiento;

public class Turno {

    private Movimiento movimientoJugador;
    private Movimiento movimientoEnemigo;

    public Turno(Movimiento jugador, Movimiento enemigo) {
        this.movimientoJugador = jugador;
        this.movimientoEnemigo = enemigo;
    }

    public void avanzarTurno(){
        fase(Movimiento.FASE_DEFENSA);
        fase(Movimiento.FASE_ATAQUE);
    }

    private void fase(int fase){
        if(aplicaEnFase(this.movimientoJugador,fase)){
            this.movimientoJugador.aplicar();
        }
        if(aplicaEnFase(this.movimientoEnemigo,fase)){
            this.movimientoEnemigo.aplicar();
        }
    }

    private boolean aplicaEnFase(Movimiento movimiento, int fase){
        return movimiento.obtenerFaseEnQueAplica()==fase;
    }


}
